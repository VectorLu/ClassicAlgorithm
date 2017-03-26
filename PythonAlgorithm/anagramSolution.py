def anagramSolution(s1, s2):
    s2List = list(s2)
    pos1 = 0
    stillOK = True
    while pos1<len(s1) and stillOK:
        pos2 = 0
        found = False
        while pos2<len(s2List) and (not found):
            if s1[pos1] == s2List[pos2]:
                found = True
            else:
                pos2 += 1
        if found:
            s2List[pos2] = None
        else:
            stillOK = False
        pos1 += 1

    return stillOK

print(anagramSolution('abcd', 'dcba'))
print(anagramSolution('heart', 'earth'))
print(anagramSolution('abd', 'efg'))


def anagramSolution2(s1, s2):
    s1List = list(s1)
    s2List = list(s2)

    s1List.sort()
    s2List.sort()

    pos = 0
    matches = True

    while pos < len(s1) and matches:
        if s1List[pos] == s2List[pos]:
            pos += 1
        else:
            matches = False

    return matches

print(anagramSolution2('abcde', 'edcba'))

def anagramSolution4(s1, s2):
    c1 = [0]*26
    c2 = [0]*26

    for i in range(len(s1)):
        pos = ord(s1[i]) - ord('a')
        c1[pos] = c1[pos] + 1

    for i in range(len(s2)):
        pos = ord(s2[i]) - ord('a')
        c2[pos] = c2[pos] + 1

    j = 0
    stillOK = True
    while j<26 and stillOK:
        if c1[j]==c2[j]:
            j += 1
        else:
            stillOK = False

    return stillOK

print(anagramSolution4('apple', 'pleap'))
