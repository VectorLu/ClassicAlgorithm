def binarySearch(orderedList, item):
    first = 0
    last = len(orderedList)
    found = False
    while first <= last and not found:
        middle = (first+last)//2
        if orderedList[middle] == item:
            found = True
        elif item < orderedList[middle]:
            last = middle - 1
        else:
            first = middle + 1

    return found

def recurBinarySearch(orderedList, item):
    if len(orderedList) == 0:
        return False
    else:
        middle = len(orderedList)//2
        if orderedList[middle] == item:
            return True
        elif item < orderedList[middle]:
            return recurBinarySearch(orderedList[:middle], item)
        else:
            return recurBinarySearch(orderedList[middle+1:], item)
