package org.mahil {
  class ScalaClass2(name: String, age: Int) {
    println("Name in constructor:" + name);
    println("Age in constructor" + age);

    def instanceMethod: Unit ={
      import math._;

      println("Instance method")
      ScalaClass2.staticMethod()
      println("sqrt of age" + sqrt(age))
      println(methodInPackage)
    }
  }

  object ScalaClass2{
    def staticMethod(): Unit = {
      println("Static method");
    }
  }

  object startPoint extends App{
    ScalaClass2.staticMethod();
    new ScalaClass2("Mahil", 30).instanceMethod
  }



}


package  org {
  package object mahil {
    def methodInPackage: Unit = {
      println("Method in package")
    }
  }
}
