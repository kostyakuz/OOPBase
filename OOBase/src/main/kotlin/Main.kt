fun main(args: Array<String>){
    val numbers = listOf<Int>(13,65,3,67,-3,1)
    val x = findMax(numbers)
    println(x)
}


fun  findMax(inputList: List<Int>) : Int {
    var max = Int.MIN_VALUE
    for (i in inputList.indices) {
        if (max < inputList[i]) {
            max = inputList[i]
        }
    }
    return max
}


fun printList(inputList: List<Any>){
    for (i in inputList.indices){
        println(inputList[i])
    }
}

fun listtask2(){
    {
        var numbers = mutableListOf<Int>(5,6,7)
        for (i in 0..4){
            println(i)
        }

        for (i in numbers.indices){
            println(numbers[i])
            numbers[i] = numbers[i]+1
        }
    }
}


fun listtask(){
    var city = listOf<String>("Omsk","Moscow","London")
    println(city[2])
    var names = mutableListOf<String>("Aleksandra","Nikolai")
    names.add("Aleksandra")
    names.removeAt(1)
    names.remove("")
    var food = listOf<Int>(1,2,3)

}

// задачи по теме if-else
fun  ifFirsttask(){
    var x = 6
    var y = 8

    if (y != 0) {
        println(x /y)
    }else{
        println("Делить на ноль нельзя")
    }

    println("Программа закончена")
}

fun  ifSecondtask(){
    var p = 4
    var b = 2
    var fg = p + b
    if (fg > 0) {
        println("Больше нуля")
    }else{
        println("Меньше нуля")
    }

}

fun ifThirdTask(){
    val month = 12
    if (month == 12){
        println("декабрь")
    }
    else if (month == 11){
        println("ноябрь")
    }
    else if (month == 10){
        println("октябрь")
    }
    else if (month == 9){
        println("сентябрь")
    }
    else if (month == 8){
        println("август")
    }
    else if (month == 7){
        println("июль")
    }
    else if (month == 6){
        println("июнь")
    }
    else if (month == 5){
        println("май")
    }
    else if (month == 4){
        println("апрель")
    }else if (month == 3){
        println("март")
    }else if (month == 2){
        println("февраль")
    }else if (month == 1){
        println("январь")
    }else{

    }
}
