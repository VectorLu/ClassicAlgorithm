import random

def generateOne(strLen):
    alphabet = 'abcdefghijklmnopqrstuvwxyz '
    res = ''
    for u in range(strLen):
        res = res + alphabet[random.randrange(27)]

    return res


def score(goal, testStr):
    numSame = 0
    for i in range(len(goal)):
        if goal[i] == testStr[i]:
            numSame = numSame + 1
    return numSame / len(goal)


def main():

    goalStr = 'methinks it is like a weasel'
    newStr = generateOne(28)
    best = 0
    newScore = score(goalStr, newStr)
    while newScore < 1:
        if newScore > best:
            print(newScore, newStr)
            best = newScore
        newStr = generateOne(28)
        newScore = score(goalStr, newStr)

main()
