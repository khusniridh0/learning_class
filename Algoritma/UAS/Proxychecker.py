import time
import requests as req
import threading
import json
from undetected_chromedriver import Chrome, ChromeOptions
from selenium.webdriver.common.by import By


proxy_list = open('proxy/proxy.txt', 'r').read().split("\n")
proxy_list = open('proxy/http_proxies.txt', 'r').read().split("\n")
proxy_list = open('proxy/https_proxies.txt', 'r').read().split("\n") 
proxy_list = open('proxy/socks4_proxies.txt', 'r').read().split("\n") 
proxy_list = open('proxy/socks5_proxies.txt', 'r').read().split("\n")


threads, final_proxy = [], []


def check_proxy(proxy):
    chrome_options = ChromeOptions()
    ping = time.time()
    proxies = {'http': f'http://{proxy}', 'https': f'http://{proxy}'}
    chrome_options.add_argument('--headless')
    chrome_options.add_argument('--incognito')
    chrome_options.add_argument('--proxy-server={}'.format(proxy))

    try:
        with req.get('http://ipinfo.io/json', proxies=proxies, timeout=5) as res:
            if res.status_code == 200:
                driver = Chrome(options=chrome_options)
                driver.get('https://books.toscrape.com/')
                elmn = driver.find_element(By.CSS_SELECTOR, 'li.col-xs-6:nth-child(1) > article:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)')
                if elmn.is_displayed():
                    print(proxy)
                    final_proxy.append({
                        'proxy': proxy,
                        'kota': res.json()['city'],
                        'wilayah': res.json()['region'],
                        'negara': res.json()['country'],
                        'zona-waktu': res.json()['timezone'],
                        'lokasi': res.json()['loc'],
                        'ping': round(time.time() - ping, 2)
                    })
                
                driver.quit()
    except:
        pass


def save():
    n = final_proxy.__len__()
    save = []
    # Algoritma sorting
    for i in range(n):
        for x in range(n - 1):
            if final_proxy[i]['ping'] < final_proxy[x]['ping']:
                final_proxy[i], final_proxy[x] = final_proxy[x], final_proxy[i]

    for i in range(n):
        if final_proxy[i]['proxy'] not in save:
            save.append(final_proxy[i])

    with open('proxy.json', 'w') as file:
        json.dump(save, file, indent=4)
    
    print(f'\n{n} Proxy berhasil diperbarui')


def main_checker():
    for i in range(proxy_list.__len__() - 1):
        thread = threading.Thread(target=check_proxy, args=(proxy_list[i], ))
        thread.start()
        thread.join()
    
    if not thread.is_alive():
        save()


def filter():
    with open('proxy.json') as file:
        final_proxy = json.load(file)

    n = final_proxy.__len__()
    for i in range(n):
        for x in range(n - 1):
            if final_proxy[i]['ping'] < final_proxy[x]['ping']:
                final_proxy[i], final_proxy[x] = final_proxy[x], final_proxy[i]

    for i in range(n):
            if final_proxy[i]['proxy'] not in save:
                save.append(final_proxy[i])


    with open('proxy.json', 'w') as file:
        json.dump(save, file, indent=4)