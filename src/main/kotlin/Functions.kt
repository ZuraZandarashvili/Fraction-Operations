//შეკრება
fun add(n1:Fraction, n2:Fraction):String{
    val result = Fraction()

    result.denominator = n1.denominator*n2.denominator
    result.numerator = n1.numerator*n2.denominator + n2.numerator*n1.denominator

    return result.simplify()
}

//გამოკლება
fun subtract(n1:Fraction, n2:Fraction):String{
    val result = Fraction()

    result.denominator = n1.denominator*n2.denominator
    result.numerator = n1.numerator*n2.denominator - n2.numerator*n1.denominator

    return result.simplify()
}

//გამრავლება
fun multiply(n1: Fraction, n2: Fraction):String{
    val result = Fraction()

    result.denominator = n1.denominator*n2.denominator
    result.numerator = n1.numerator*n2.numerator

    return result.simplify()
}

//გაყოფა
fun divide(n1: Fraction, n2: Fraction):String{
    val result = Fraction()

    result.denominator = n1.denominator*n2.numerator
    result.numerator = n1.numerator*n2.denominator

    return result.simplify()
}