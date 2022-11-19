fun TestaMap(){
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 10.99),
        Pair(2, 19.15),
        3 to 7.15,
        4 to 27.15
    ) //Infix é fortemente desaconselhado quando performance for exigida


    val pedido = pedidos[40]
    pedido?.let {
        println("Pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("Numero do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")

    }

    pedidos.putIfAbsent(6, 10.99)
    pedidos.putIfAbsent(6, 11.99)

    println(pedidos)

    pedidos.remove(6, 10.99)

    println(pedidos)
}