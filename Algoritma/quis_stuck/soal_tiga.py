import time
import random
from queue import Queue
queue = Queue()

antrian = ['Nasabah ke-'+str(i+1) for i in range(random.randint(0, 10))]

for i in antrian:
    queue.put(i)

print('\n')
print('+'*80)
print('|',('Total Antrian ' + str(queue.qsize())).center(76),'|')
print('+'*80)
print('\n')
time.sleep(2)

print('-'*80)
for i in range(queue.qsize()):
    data = str(queue.get())
    print('|',i+1,' '*(2-len(str(i))-2),'|', ('Melayani Nasabah ' + data),' '*(72-len(('Melayani Nasabah ' + data))-2),'|')
    print('-'*80)
    time.sleep(3)