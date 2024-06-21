//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val sum = 5 plus 10
    println("Сумма = $sum")
    val difference = 11 subtraction 2
    println("Разность = $difference")
    val product = 9 multiplication 3
    println("Произведение = $product")
    val quotient = 125 division 5
    println("Частное = $quotient")
    println("=================================================")
//2
    val person = Person("Иван")
    person say("Привет!")
    println("=================================================")
//3
    val point1 = Point(6,12)
    val point2 = Point(1,11)
    println(point1 isAbove point2)
    println(point1 isRightOf point2)
}
infix fun Int.plus(element: Int): Int = this + element

infix fun Int.subtraction(element: Int): Int = this + element

infix fun Int.multiplication(element: Int): Int = this * element

infix fun Int.division(element: Int): Int = this / element