fun TestOperacoesMap(pedidos: MutableMap<Int, Double>) {
        println(pedidos.get(4))

        var orElse = pedidos.getOrElse(key = 5, defaultValue = ({
            999.1 * 89 / 77
        }))

        println(orElse)

        val orDefault = pedidos.getOrDefault(7, { 9.1 })
        println(orDefault)

        for (k in pedidos.keys) {
            println("k = ${k}")
        }

        for (v in pedidos.values) {
            println("v = [${v}]")
        }

        val filtered: Map<Int, Double> = pedidos.filter { (numero, valor) ->
            numero % 2 == 0 && valor > 40
        }

        println("Filtered = ${filtered}")

        val filteredKey = pedidos.filterKeys { it > 4 }

        println(filteredKey.keys)

        val filteredValue = pedidos.filterValues {
            it % 2 == 0.0 && it > 10
        }

        println(filteredValue)

        /**
         * See: https://kotlinlang.org/docs/map-operations.html
         *      https://kotlinlang.org/docs/list-operations.html
         * */

//    println(pedidos.getValue(9)) // Lança exceção quando não encontra o valor correspondente

        pedidos.putAll(setOf(9 to 5.99, 10 to 9.99))
        pedidos += listOf(11 to 9.99, 12 to 9.99)

        println(pedidos)

        pedidos.keys.remove(1)

        println(pedidos)

        pedidos.values.removeAll(listOf(9.99))

        println(pedidos)

        pedidos.keys -= 4

        println(pedidos)

    }