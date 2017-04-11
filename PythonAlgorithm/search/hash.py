def hash(aStr, tableSize):
    sum = 0
    for pos in range(len(aStr)):
        sum = sum + (pos+1)*ord(aStr[pos])

    return sum % tableSize

class HashTable:
    def __init__(self):
        self.size = 11
        self.slots = [None] * self.size
        self.data = [None] * self.size

    def put(self, key, data):
        hashValue = self.hashFunc(key, len(self.slots))
        if self.slots[hashValue] == None:
            self.slots[hashValue] = key
            self.data[hashValue] = data
        else:
            if self.slots[hashValue] == key:
                self.data[hashValue] = data    # replace
            else:
                nextSlot = self.rehash(hashValue, len(self.slots))
                while self.slots[nextSlot] != None and \
                      self.slots[nextSlot] != key:
                    nextSlot = self.rehash(nextSlot, len(self.slots))

                if self.slots[nextSlot] == None:
                    self.slots[nextSlot] = key
                    self.data[nextSlot] = data
                else:
                    self.data[nextSlot] = data    # replace

    def hashFunc(self, key, size):
        return key % size

    def rehash(self, oldHash, size):
        return (oldHash+1) % size

    def get(self, key):
        starSlot = self.hashFunc(key, len(self.slots))

        data = None
        stop = False
        found = False
        position = starSlot
        while self.slots[position] != None and not found and not stop:
            if self.slots[position] == key:
                found = True
                data = self.data[position]
            else:
                position = self.rehash[position, len(self.slots)]
                if position == starSlot:
                    stop = True

        return data

    def __getitem__(self, key):
        return self.get(key)

    def __setitem__(self, key, data):
        return self.put(key, data)


H = HashTable()
H[54] = 'cat'
H[26] = 'dog'
print(H.slots)
print(H.data)
