package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person]{
  override def compare(that: Person): Int = {
    if(this.name!=that.name){
      this.name.length-that.name.length
    }
    else{
      this.age-that.age
    }
  }
}
object Person {
  def main(args: Array[String]): Unit = {
    val personOne=new Person("Abhinav",22)
    val personTwo=new Person("akash",23)
    val personThird=new Person("Abhinav",22)
    val personFourth=new Person("Abhinav",23)
    println(personOne>personTwo)
    println(personThird>personFourth)
  }
}


