package com.yw.test

//import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.sql.functions._

object Begin  {
  System.setProperty("hadoop.home.dir", "G:\\hadoop\\hadoop-2.6.2")
 // System.setProperty("HADOOP_USER_NAME", "hdfs")
val conf=new SparkConf().setAppName("mytest")//.setMaster("yarn-client")
    .setMaster("local[*]")
  //.setMaster("spark://master01:7077")
  conf.set("spark.locality.wait.process","300s")
  conf.set("spark.locality.wait.node","200s")
  val sc=new SparkContext(conf)
/*
val ss=SparkSession.builder().master("local")
    .appName("test").enableHiveSupport().getOrCreate()
*/

  def main(args: Array[String]): Unit = {

    val sqlHiveContext=new HiveContext(sc)
    import  sqlHiveContext.implicits._
    val student=sqlHiveContext.table("default.student").groupBy('age).agg(sum('height))show(false)
  }

}
