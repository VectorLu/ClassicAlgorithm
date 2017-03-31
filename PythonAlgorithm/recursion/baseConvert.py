def baseConvert(n, base):
    convertStr = "0123456789ABCDEF"
    if n < base:
        return convertStr[n]
    else:
        return baseConvert(n//base, base) + convertStr[n%base]

print(baseConvert(1453, 16))
print(baseConvert(10, 2))
