fun TestaList(){
    val pedidos: List<Pedido> = listOf(
        Pedido(1, 10.00),
        Pedido(2, 20.00),
        Pedido(3, 30.00),
        Pedido(4, 40.00),
        Pedido(5, 80.00)
    )

    val pedidoAssociateEg = pedidos.associate { pedido ->
        pedido.numero to pedido
    }

    println(pedidoAssociateEg)

    val pedidoAssociateByEg = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidoAssociateByEg)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 30.0
    }

    println(pedidosFreteGratis)

    val pedidosGroup = pedidos.groupBy { pedido -> pedido.valor > 30 }

    val comfreteGratis = pedidosGroup[true]
    val semFreteGratis = pedidosGroup[false]

    println("Pedidos com frete gratis: $comfreteGratis")
    println("Pedidos sem frete gratis: $semFreteGratis")


    val nomes = listOf<String>(
        "Caike",
        "Ingrid",
        "Aquila",
        "Carlos",
        "Priscila",
        "Paulo",
        "Timoteo",
        "Lucas",
        "Filemon",
        "Tito",
        "Filipe",
        "Atos"
    )

    val nomesAgrupadados = nomes.groupBy { nome -> nome.first() }

    println(nomesAgrupadados)

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosAgrupados)

    data class Pedido(val numero: Int, val valor: Double)
}

