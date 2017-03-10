package com.dataoptimo

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext

/**
  * Created by fawadalam on 10/03/2017.
  */
trait MyLocalSparkContext {

  val conf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("my app")
  val sc = new SparkContext(conf)
  val sqlContext = new SQLContext(sc)

}
