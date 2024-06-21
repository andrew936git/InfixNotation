class Point(val x: Int, val y: Int) {
    infix fun isAbove(point: Point): Boolean{
        return this.y > point.y
    }

    infix fun isRightOf(point: Point): Boolean{
        return this.x > point.x
    }
}