def unorderedSequentialSearch(unorderedList, item):
    pos = 0
    found = False
    while pos < len(unorderedList) and not found:
        if unorderedList[pos]==item:
            found = True
        else:
            pos += 1
    return found

testList = [1, 2, 32, 8, 17, 19, 42, 13, 0]
print(unorderedSequentialSearch(testList, 3))
print(unorderedSequentialSearch(testList, 13))

def orderedSequentialSearch(orderedList, item):
    pos = 0
    found = False
    stop = False
    while pos < len(orderedList) and not found and not stop:
        if orderedList[pos] == item:
            found = True
        elif orderedList[pos] > item:
            stop = True
        else:
            pos += 1

    return found

anOrderedList = [0, 1, 2, 8, 13, 17, 19, 32, 42]
print(orderedSequentialSearch(anOrderedList, 3))
print(orderedSequentialSearch(anOrderedList, 13))
