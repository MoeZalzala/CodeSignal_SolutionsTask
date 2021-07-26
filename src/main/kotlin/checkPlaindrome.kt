fun checkPalindrome(inputString: String): Boolean {
    var result:Boolean = false;
    var rString:String = inputString.reversed()
    result = inputString.equals(rString);
    return(result);
}

fun main(){

    var input:String = "aabaa";
    checkPalindrome(input);

}