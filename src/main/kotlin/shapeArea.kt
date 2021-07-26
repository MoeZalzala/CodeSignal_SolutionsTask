fun shapeArea(n: Int): Int {

    var corner = n - 2
    var cheese:Int = 0
    for(i in corner downTo 0){cheese += i
    }


    var area:Int = ((n-1)*4)+1+(cheese*4)

    return area
}
