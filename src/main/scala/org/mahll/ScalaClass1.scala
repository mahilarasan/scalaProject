package org.mahll


abstract class abstractClass {
  def abstractClassMethod(inputString: String): Unit;
}

trait traitClass {
  def traitMethod(inputInteger: Int):Unit;
}


class ScalaClass1 extends abstractClass with traitClass {

  def methodInClass: Unit = {
    println("Called Method in class")
  }

  override def abstractClassMethod(inputString: String): Unit = {
    println("Hello Baby I'm abstract class :"+ inputString.toLowerCase)
  }

  override def traitMethod(inputInteger: Int): Unit = {
    print("I'm a trait method" + inputInteger.toString)
    }
}

object ScalaClass1 {

  def methodInObject: Unit = {
    println("Called method in object")
  }
}

object MainClass extends App {
  println("Invoked Main method")
  ScalaClass1.methodInObject
  val classObj = new ScalaClass1()
  classObj.methodInClass
  classObj.abstractClassMethod("Hello")
  classObj.traitMethod(78)

}


