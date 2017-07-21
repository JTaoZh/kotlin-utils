package utils

val hexCharList = listOf('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','a','b','c','d','e','f')

fun String.changeEndian(startIndex:Int = 0, stopIndex:Int = this.length):String{
    if(this.length % 2 != 0 || !this.all { hexCharList.contains(it) }) throw RuntimeException("illegal hex string.")
    else return this.changeEndianLoop(startIndex, stopIndex)
}

private tailrec fun String.changeEndianLoop(startIndex:Int, stopIndex:Int):String {
    return if (stopIndex == startIndex) this
    else (substring(0, startIndex) +
            substring(stopIndex - 2, stopIndex) +
            substring(startIndex, stopIndex - 2) +
            substring(stopIndex, length))
            .changeEndianLoop(startIndex + 2, stopIndex)
}

