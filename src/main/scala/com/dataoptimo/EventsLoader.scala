package com.dataoptimo

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SQLContext}
import scaldi.{Injectable, Injector}

/**
  * Created by fawadalam on 10/03/2017.
  */
class EventsLoader(path: String)(implicit injector : Injector) extends Injectable {

  val sc = inject[SparkContext]
  val sqlContext = inject[SQLContext]

  def loadAsRDDOfStrings: RDD[String] = {
    sc.textFile(path)
  }



}
