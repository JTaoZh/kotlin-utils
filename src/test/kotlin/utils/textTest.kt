package utils

fun main(args:Array<String>){
    assert("1234567890".changeEndian() == "9078563412")
    assert("1234567890".changeEndian(startIndex = 2) == "1290785634")
    assert("1234567890".changeEndian(stopIndex = 8) == "7856341290")
    assert("1234567890".changeEndian(2,8) == "1278563490")
    try{ ("123567890".changeEndian())}  catch (e:Exception){ assert(e.message == "illegal hex string.") }
    try{ ("123567w890".changeEndian())} catch (e:Exception){ assert(e.message == "illegal hex string.")}
    println("test success.")
}