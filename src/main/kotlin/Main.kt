fun main(){
    val f1 = Fraction(-4,3)
    val f2 = Fraction()

    //println(f1.simplify())    // შეკვეცა
    println("$f1+$f2=${add(f1,f2)}")    // გამოკლება
    println("$f1-$f2=${subtract(f1,f2)}")    // მიმატება
    println("$f1*$f2=${multiply(f1,f2)}")    // გამრავლება
    println("$f1:$f2=${divide(f1,f2)}")    // გაყოფა
}