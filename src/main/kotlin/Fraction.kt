//წილადის კლასი
class Fraction {
    //default მნიშვნელობები
    var numerator:Int = 0
    var denominator:Int = 1

    //შეკვეცა
    fun simplify():String{
        if(denominator < 0){
            numerator *= -1
            denominator *= -1
        }

        for (i in 2..denominator){
            while(denominator%i == 0 && numerator%i == 0){
                denominator /= i
                numerator /= i
            }
        }

        return "$numerator/$denominator"
    }

    //ორი წილადის შედარება
    override fun equals(other: Any?): Boolean {
        return other is Fraction && numerator*other.numerator / denominator == other.denominator
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}