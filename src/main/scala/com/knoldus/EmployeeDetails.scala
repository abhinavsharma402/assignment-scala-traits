package com.knoldus

class FirstName (firstName: String){
  val returnfirstName=firstName

}
class LastName (lastName: String){
  val returnLastName=lastName

}
class Age (age: Int){
  val returnAge=age
}
object EmployeeDetails{
  def main(args: Array[String]): Unit = {
 val firstName=  new FirstName("Abhinav")
    val secondName=  new LastName("sharma")
    val age=  new Age(22)
    displayDetails(firstName,secondName,age )


    def displayDetails(firstName1: FirstName,lastName: LastName,age: Age): Unit ={
      val displayFirst=firstName1.returnfirstName
      val displaySecond=lastName.returnLastName
      val displayAge=age.returnAge
      print(s"$displayFirst $displaySecond is of $displayAge years")
    }

  }
}


