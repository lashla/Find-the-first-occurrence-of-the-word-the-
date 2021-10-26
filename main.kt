fun main() {
    val input = readLine()!!.toString().toLowerCase()
    val searchResult = input.indexOf("the")
    if (input.contains("the")) {
        println(searchResult)
    } else {
        println(-1)
    }
}
