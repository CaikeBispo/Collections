fun main(args: Array<String>) {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 10.99),
        Pair(2, 19.15),
        3 to 7.15,
        4 to 27.15,
        5 to 50.1,
        6 to 52.1,
        7 to 39.9,
        8 to 58.0,

    )

    TestOperacoesMap(pedidos)
}

