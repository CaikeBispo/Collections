fun main(args: Array<String>) {

    val pedidos: List<Pedido> = listOf(
        Pedido(1, 10.00),
        Pedido(2, 20.00),
        Pedido(3, 30.00),
        Pedido(4, 40.00),
        Pedido(5, 80.00)
    )

    val  pedidoAssociateEg = pedidos.associate { pedido ->
        pedido.numero to pedido
    }

    println(pedidoAssociateEg)

    val pedidoAssociateByEg = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidoAssociateByEg)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 30.0
    }

    println(pedidosFreteGratis)




}

data class Pedido(val numero: Int, val valor: Double)