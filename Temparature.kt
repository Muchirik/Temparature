fun main (){
    Temperature1(temp_in_celsius= 100)
}

//in a mew function create a new program to convert degree celsius to degree fahrenheit
//conversion formula is F=C*(9/5)+32 where F stands for degree fahrenheight
fun Temperature1(temp_in_celsius:Int){
    var temp_in_fahrenheit=temp_in_celsius*(1.8)+32
    println("$temp_in_celsius celsius is equal to $temp_in_fahrenheit farenheight ")
}
