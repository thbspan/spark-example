package org.bigdata.spark.core

object ScalaWordCount {

  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello scala", "hello groovy hello python hello js")

    val words = lines.flatMap(_.split(" "))

    // 生成元组
    val tuples = words.map((_, 1))

    // 以key（单词）进行分组
    val grouped = tuples.groupBy(_._1)
    // key进行分组
    val wordCountMap = grouped.mapValues(_.size)
    val sorted = wordCountMap.toList.sortBy(_._2)
    println(sorted.reverse)
  }
}
