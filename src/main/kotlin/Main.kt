//3 - Crie um programa para ler 4 notas e mostrar a média delas.

fun main(args: Array<String>) {

    var num = 0
    var cont = 0.0
    var cont1 = 0
    var med = 0.0

    while (cont1 < 4){
        print("Digite sua nota: ")
        num = readLine()!!.toInt()
        cont += num
        cont1 ++

    }

    med = cont/4
    println("A média das suas quantro notas foi $med")

}
