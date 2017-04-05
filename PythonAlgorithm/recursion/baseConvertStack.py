class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items)-1]

    def size(self):
        return len(self.items)

numStack = Stack()
def baseConvert(n, base):
    convertStr = '0123456789ABCDEF'
    while n > 0:
        if n < base:
            numStack.push(convertStr[n])
        else:
            numStack.push(convertStr[n%base])
        n = n // base

    result = ''
    while not numStack.isEmpty():
        result = result + str(numStack.pop())
    return result
