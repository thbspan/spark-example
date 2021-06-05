package org.bigdata.spark.core

object ArrayTest {

  def main(args: Array[String]): Unit = {
    val arr = Array(("a", 1), ("b", 2), ("c", 3))
    println(arr.mkString("Array(", ", ", ")"))
    println(arr.toMap)

    val arr1 = Array("a", "b", "c")
    val arr2 = Array(24, 25, 26, 28)
    // 拉链操作
    // 会截断没有对应的元素
    println((arr1 zip arr2).mkString("Array(", ", ", ")"))
  }
}
