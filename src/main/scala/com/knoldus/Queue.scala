package com.knoldus
trait Queue{
  def Enqueue(list: List[Int],input:Int):List[Int]

  def Dequeue(list:List[Int]):List[Int]=
  {
    list.tail
  }
}
class DoubleQueue extends  Queue {
  override  def Enqueue(list : List[Int],input :Int):List[Int]={
    val double=input*2
    list:+double
  }

}

class SquareQueue extends  Queue {
  override  def Enqueue(list : List[Int],input :Int):List[Int]={
    val square=input*input
    list:+square

  }

}

object Queue extends App{
  val double=new DoubleQueue
  val square=new SquareQueue
  val dequeue=new DoubleQueue
  println( double.Enqueue(List(3,4),8))
  println( square.Enqueue(List(2,4),9))
  println( double.Dequeue(List(1,3,5,9)))
}