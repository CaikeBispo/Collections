public fun CollectionsWithSet() {
    val viuAndroid: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria", "Alex", "Fran", "Gui", "Maria")
    val viuKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria", "Fran", "Gui")

//    val ambosold: List<String> =  viuKotlin.plus(viuAndroid)
//    val ambos: Set<String> =  viuAndroid + viuKotlin
    val ambos: MutableSet<String> = mutableSetOf<String>()

    ambos.addAll(viuAndroid)
    ambos.addAll(viuKotlin)
    ambos.add("Malu")
    ambos.add("Milu")
    ambos.add("Milu")

    println(viuAndroid + viuKotlin) //união simples
    println(viuAndroid union viuKotlin) //união entre conjuntos utilizando infix

    println(viuAndroid - viuKotlin) //subtração simples
    println(viuAndroid subtract viuKotlin) //subtração entre conjuntos utilizando infix


    println(viuAndroid intersect viuKotlin) //interseccção entre conjuntos utilizando infix

    println(ambos)
    println(ambos.distinct())

    val listambos = ambos.toMutableList()

    listambos.add("Malu") //Permite itens repetidos

    println(listambos)
    println(listambos.toSet()) //ao converter para o set remove itens repetidos

    /**
    Vimos que as coleções permitem realizar operações aritméticas para devolver novas coleções.
    Esse código é possível a partir da técnica de operator overloading.
    Para saber mais detalhes das possibilidades de sobrecarga de operador em Collections, confira a documentação.
    #See -> https://kotlinlang.org/docs/set-operations.html

    . Como devolver uma lista sem repetições com a função distinct()
    . A definição da coleção List e Set
    . Quando utilizar o Set
    . Quais são os comportamentos exclusivos do Set e como utilizá-los
    . Como converter um List para um Set
     **/
}

