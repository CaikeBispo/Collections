fun main(args: Array<String>) {
    


}

private fun baseCollection() {
    println("Hello World!")

    var banco: bancoDeNomes = bancoDeNomes()
    banco.adiciona("Caike")
    banco.adiciona("Ingrid")
    banco.adiciona("Pele")

    var copia: Collection<String> = banco.nomes

    banco.adiciona("Taylor")

    println(copia)

    println(banco.nomes)
}

class bancoDeNomes(){
    val nomes: Collection<String> get() = Companion.dados.toList()
    fun adiciona(nome: String){
        Companion.dados.add(nome)
    }
    companion object {
        private var dados = mutableListOf<String>()
    }

}


private fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("Caike", "Ingrid", "Jose", "Edinelva", "Leonardo", "Lucas")

    nomes.forEach {
        println(it)
    }

//    nomes.add("Souza")

    println("Tem Ingrid: ${nomes.contains("Ingrid")}")

    println("Size of: ${nomes.size}")
//    nomes.remove("Souza")
    println(nomes.plus("Marina"))

    println("Nome aleatorio: ${nomes.random()}")
}