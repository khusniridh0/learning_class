import random
from Proxy import Proxy
from undetected_chromedriver import Chrome, ChromeOptions
from selenium.webdriver.chrome.service import Service

# Konsep stuck
class Spoofer(object):

    def __init__(self):
        # Menjalankan kelas proxy pada file proxy
        proxy = Proxy()
        # Menerapkan konfigurasi proxy
        proxy.config({
            'country': 'all',
            'count': 10,
            'timeout': 22
        })
        userAgent = [
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36',
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0',
            'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.1 Safari/605.1.15',
            'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.1 Safari/605.1.15',
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 Edg/91.0.864.48',
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 Edg/91.0.864.48',
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 Edg/91.0.864.48',
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.203',
        ]

        # Mengacak user agen berdasarkan variabel userAgent
        self.userAgent = userAgent[random.randint(0, len(userAgent) - 1)]
        # Meminta 1 proxy beserta portnya
        self.proxy = proxy.get()
        self.proxy_detile = self.proxy
        self.proxy = self.proxy['proxy']
        self.prefs = {
            'webrtc.ip_handling_policy': 'disable_non_proxied_udp',
            'webrtc.multiple_routes_enabled': False,
            'webrtc.nonproxied_udp_enabled': False
        }


class WebDriver(object):

    def __init__(self):
        # Menjalankan kelas spoofer
        self.Spoofer = Spoofer()
        # Membuat konfigurasi browser
        self.chrome_options = ChromeOptions()
        self.chrome_service = Service('/usr/bin/chromedriver/chromedriver')
        self.chrome_options.add_argument('--incognito')
        self.chrome_options.add_argument('--no-sandbox')
        self.chrome_options.add_argument('--start-maximized')
        self.chrome_options.add_argument('--user-agent=' + self.Spoofer.userAgent)
        self.chrome_options.add_argument('--proxy-server=' + self.Spoofer.proxy)
        self.chrome_options.add_experimental_option('prefs', self.Spoofer.prefs)
        self.chrome_options.add_argument('--disable-dev-shm-usage')
        self.chrome_options.add_argument('--disable-gpu')
        self.chrome_options.add_argument('--disable-impl-side-painting')
        self.chrome_options.add_argument('--disable-setuid-sandbox')
        self.chrome_options.add_argument('--disable-seccomp-filter-sandbox')
        self.chrome_options.add_argument('--disable-breakpad')
        self.chrome_options.add_argument('--disable-client-side-phishing-detection')
        self.chrome_options.add_argument('--disable-cast')
        self.chrome_options.add_argument('--disable-cast-streaming-hw-encoding')
        self.chrome_options.add_argument('--disable-cloud-import')
        self.chrome_options.add_argument('--disable-popup-blocking')
        self.chrome_options.add_argument('--disable-session-crashed-bubble')
        self.chrome_options.add_argument('--disable-ipv6')


    def get_driver(self):
        # Menampilkan detile ip dan user agen yang di gunakan
        print('IP          :', self.Spoofer.proxy_detile['proxy'])
        print('Kota        :', self.Spoofer.proxy_detile['kota'])
        print('Wilayah     :', self.Spoofer.proxy_detile['wilayah'])
        print('Kode Negara :', self.Spoofer.proxy_detile['negara'])
        print('Lokasi      :', self.Spoofer.proxy_detile['lokasi'])
        print('User-Agent  :', self.Spoofer.userAgent)

        # Menerapkan konfigurasi browser
        return Chrome(service=self.chrome_service, options=self.chrome_options)


class Browser():

    def run():
        # mulai membuaka browser
        driver = WebDriver().get_driver()
        print()
        input('Tekan Enter untuk Berhenti')
        return


if __name__ == "__main__":
    Browser.run()
