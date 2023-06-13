class Stack:
    def __init__(stuck):
        stuck.items = []
    
    def is_empty(stuck):
        return len(stuck.items) == 0

    def push(stuck, item):
        stuck.items.append(item)

    def pop(stuck):
        if not stuck.is_empty():
            return stuck.items.pop()

    def peek(stuck):
        if not stuck.is_empty():
            return stuck.items[-1]

    def size(stuck):
        return len(stuck.items)
