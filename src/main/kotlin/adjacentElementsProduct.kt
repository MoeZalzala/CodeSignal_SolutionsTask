fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var bProduct = -10000
    var fProduct:Int = 0
    var product  = 0
    var element1 = 0
    var element2 = 0
    for(i in 0 until inputArray.size  step 1){
        if(i % 2 == 0) element1 = inputArray[i] else element2 = inputArray[i]
        println("Element1: $element1 Element2: $element2")
        if(i>= 1) {

            product = element1 * element2
            //println("The value of i: $i")
            var recentProduct:Int = product

            if (bProduct< recentProduct) {
                bProduct = recentProduct
                println("Recent: $recentProduct BProduct: $bProduct")
            }
            fProduct = bProduct
            println("Final: $fProduct")
        }
    }
    return(fProduct)
}