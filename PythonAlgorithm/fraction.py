def gcd(m, n):
    while m%n != 0:
        temp = n
        n = m % n
        m = n

    return n

class Fraction:

    def __init__(self, numerator, denominator):
        self.num = numerator
        self.den = denominator

    def __str__(self):
        return str(self.num) + '/' + str(self.den)

    def __add__(self, otherFraction):
        newNum = self.num*otherFraction.den + self.den*otherFraction.num
        newDen = self.den * otherFraction.den
        common = gcd(newDen, newNum)

        return Fraction(newNum//common, newDen//common)

f1 = Fraction(1, 4)
f2 = Fraction(1, 2)
f3 = f1 + f2
print(f3)
