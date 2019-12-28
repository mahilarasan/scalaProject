package org.mahll

import scala.collection.mutable.ArrayBuffer

object ScalaObject1 extends App {
 println("test Mahil");
  callDummyFunction;
  callFunctionWithValues("Hello", "Mahil")
  arrayConcept
  checkArrayBuffer
  loopConcept


 def callDummyFunction() {
   println("Dummy function called");
 }

  def callFunctionWithValues(value1: String, value2: String): Unit = {
    var concatedValues = value1 + " " + value2;
    println(concatedValues);
  }

  def arrayConcept {
    var test:Array[String] = new Array[String](10);
    test(0) = "Name1"
    test(1) = "Name2"

    var arrayIdx = 0;
    while(arrayIdx < test.length) {
      println(test(arrayIdx))
      arrayIdx = arrayIdx + 1;
    }


    var hardCodedArray = Array("1", "2", "3");
    var hardCodedArrayIdx = 0;
    while(hardCodedArrayIdx < hardCodedArray.length - 1) {
      println(hardCodedArray(hardCodedArrayIdx).toInt);

      hardCodedArrayIdx = hardCodedArrayIdx + 1;
    }
  }

  def checkArrayBuffer(): Unit = {
    println("checkArrayBuffer Method!");
    var test = "Mahil";
    var bufferVariable = ArrayBuffer[String ]();
    bufferVariable += 1.toString;
    bufferVariable += 2.toString;
    bufferVariable += ("1", "2", "3")

    for ( i <- 0 until bufferVariable.size) {
      println(bufferVariable(i))
    }

    var newArray = for(i <- 0 to 10)  yield i * 2
    println(newArray.toString());
  }

  def loopConcept(): Unit = {
    for( i <- 0 to 10 if i <  9;  j <- 0 to 10 if j > i  ) {
      println( i + "," + j)
    }

    var test = 1 to 100;
    var result = test.filter(i => i%3 == 0).map(n => n *1)

    println("result")
    println(result);

    var sum = test.sum
    println("sum " + sum)
  }
}
