import json
import Proxychecker as proxy_checker
import random

class Proxy():

    def __init__(self):
        with open('proxy.json') as file:
            self.proxies = json.load(file)
    

    def config(self, params = { 'country': 'all', 'count': 20, 'timeout': 1000 }):
        self.config = params
        self.result = []


    def get(self):

        i = 0
        x = 0
        while self.result.__len__() < self.config['count']:
            if self.config['country'] != 'all':
                try:
                    if self.config['country'] == self.proxies[i]['negara'] and self.config['timeout'] > self.proxies[i]['ping']:
                        self.result.append(self.proxies[i])
                except:
                    break
            else:
                if self.config['timeout'] > self.proxies[i]['ping']:
                    self.result.append(self.proxies[i])
    
            if x > self.proxies.__len__():
                break

            i += 1
            x += 1

        return self.result[random.randrange(self.result.__len__())]


    def hard_reload_proxy(self):
        proxy_checker.main_checker()