def hanoiTower(height, fromPole, toPole, withPole):
    if height >= 1:
        hanoiTower(height-1, fromPole, withPole, toPole)
        print(fromPole + ' -> ' + toPole)
        hanoiTower(height-1, withPole, toPole, fromPole)

hanoiTower(3, 'A', 'B', 'C')
