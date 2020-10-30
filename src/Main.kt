fun main() {

    val p= Point()

    p.abscissa = 2F
    p.ordinate = 9F
    println(p.toString())
    println(p.abscissa == p.ordinate)


    val about  = Triangle(height = p.abscissa,base = p.ordinate)
    println(about.getArea())
}

interface IFigure {

    fun getArea():Float
}

class Point {
    var abscissa: Float = 2F
    var ordinate: Float = 9F

    override fun equals(other: Any?): Boolean {

        if (other is Point)
            if (abscissa > ordinate) {
                return true
            }
        return false
    }

    override fun toString(): String {
        return "x=${abscissa}, y=${ordinate} "
    }
}

class Triangle(private val height: Float, private val base: Float):IFigure {
    override fun getArea(): Float {
        return height*base/2
    }
}