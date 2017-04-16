from lib.graphs import Graph, Vertex

def posToNodeId(row, column, boardSize):
    return row*boardSize + column

def knightGraph(boardSize):
    ktGraph = Graph()
    for row in range(boardSize):
        for column in range(boardSize):
            nodeId = posToNodeId(row, col, boardSize)
            newPositions = getLegalMoves(row, column, boardSize)
            for p in newPositions:
                newId = posToNodeId(p[0], p[1], boardSize)
                ktGraph.addEdge(nodeId, newId)
    return ktGraph

def getLegalMoves(x, y, boardSize):
    newMoves = []
    moveOffsets = [(-1, -2), (-1, 2), (1, 2), (1, -2),
                   (-2, -1), (-2, 1), (2, 1), (2, -1)]
    for i in moveOffsets:
        newX = x + i[0]
        newY = y + i[1]
        if legalCoord(newX, boardSize) and \
                    legalCoord(newY, boardSize):
            newMoves.append((newX, newY))
    return newMoves

def legalCoord(x, boardSize):
    if x >= 0 and x < boardSize:
        return True
    else:
        return False

def knightTour(n, path, v, limit):
    v.setColor('gray')
    path.append(v)
    if n < limit:
        connectedL = list(v.getConections())
        i = 0
        done = False
        while i < len(connectedL) and not done:
            if connectedL[i].getColor() == 'white':
                done = knightTour(n+1, path, connectedL[i], limit)
            i += 1
        if not done:
            path.pop()
            u.setColor('white')
    else:
        return True

def orderByAvail(n):
    resList = []
    for v in n.getConections():
        if v.getColor() == 'white':
            c = 0
            for w in v.getConections():
                if w.getColor() == 'white':
                    c += 1
            resList.append((c, v))
    resList.sort(key=lambda x: x[0])
    return [y[1] for y in resList]
