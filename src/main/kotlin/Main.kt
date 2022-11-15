fun main(args: Array<String>) {
    println("Hello World!")

    val nomes: Collection<String> = listOf("Caike", "Ingrid", "Jose", "Edinelva", "Leonardo", "Lucas")

    nomes.forEach {
        println(it)
    }

    println("Tem Ingrid: ${nomes.contains("Ingrid")}")

    println("Size of: ${nomes.size}")

    println(nomes.plus("Souza"))

    println(nomes.random())

}