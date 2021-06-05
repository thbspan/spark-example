package org.bigdata.spark.core.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Sparak01WordCount {

  def main(args: Array[String]): Unit = {
    // 配置
    val sparkConfig = new SparkConf().setMaster("local").setAppName("WordCount")
    // 建立连接
    val sc = new SparkContext(sparkConfig)
    //1、读取文件
    val lines: RDD[String] = sc.textFile(path = "datas")
    //2、数据进行拆分，形成一个一个的单词
    val words: RDD[String] = lines.flatMap(_.split(' '))
    //3、根据单词进行分组，便于统计
    val wordGroup: RDD[(String, Iterable[String])] = words.groupBy(word => word)
    //4、分组后的数据进行转换
    val word2Count = wordGroup.map {
      case (word, list) => {
        (word, list.size)
      }
    }
    word2Count.collect().toList.sortBy(_._2).reverse.foreach(println)
    sc.stop()
  }
}
