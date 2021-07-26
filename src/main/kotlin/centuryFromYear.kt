fun centuryFromYear(year: Int): Int {
    var century:Int = 0;
    var modValue:Int;
    modValue = year % 100;
    if(modValue > 0){
        century = year / 100;
        century += 1;
    }
    else{
        century = year / 100;
    }
    return (century);


}