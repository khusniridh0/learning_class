import time
import random
import Stuck_Class as stuck
stack = stuck.Stack()

batu = ['Batu ke-'+str(i+1) for i in range(random.randint(0, 50))]

for i in batu:
    stack.push(i)

print('\n')
print('+'*80)
print('|',('Total Batu ' + str(stack.size())).center(76),'|')
print('+'*80)
print('\n')
time.sleep(5)

while not stack.is_empty():
    count = random.randint(2, 5)
    print('='*80)
    print('|',('Mengantar ' + str(count) + ' Batu').center(76),'|')
    print('='*80)
    for i in range(count):
        if not stack.is_empty():
            print('|',i+1,' '*(2-len(str(i))-2),'|', stack.peek(),' '*(72-len(stack.peek())-2),'|')
            stack.pop()
    time.sleep(2)
    