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

def reverseStr(myStr):
    myStack = Stack()
    for i in range(len(myStr)):
        myStack.push(myStr[i])
    reversedStr = ''
    for i in range(len(myStr)):
        reversedStr = reversedStr + myStack.pop()
    return reversedStr

s = Stack()

print(s.isEmpty())
s.push(4)
s.push('dog')
print(s.peek())
s.push(True)
print(s.size())
print(s.isEmpty())
s.push(8.4)
print(s.pop())
print(s.pop())
print(s.size())
print(reverseStr('hello'))
