package com.dataoptimo

/**
  * Created by fawadalam on 10/03/2017.
  */


import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.scalatest._
import scaldi.Module


class EventsLoaderSpec extends FlatSpec with Matchers with MyLocalSparkContext
{


  val injector = new Module {
    bind[SparkContext] to sc
    bind[SQLContext] to sqlContext
  }

  val underTest = new EventsLoader("src/test/resources/testfile")(injector)



  "load as text file" should "read the file as an RDD of Strings" in {

    underTest.loadAsRDDOfStrings.count() should equal(4.0)

  }


}
