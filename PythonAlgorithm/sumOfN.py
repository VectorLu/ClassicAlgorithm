import time

def sumOfN(n):
    start = time.time()

    theSum = 0
    for i in range(1, n+1):
        theSum = theSum + i

    end = time.time()

    return theSum, end-start

def sumGauss(n):
    

for i in range(5):
    print('Sum is %d required %10.7f seconds' % sumOfN(10000))
