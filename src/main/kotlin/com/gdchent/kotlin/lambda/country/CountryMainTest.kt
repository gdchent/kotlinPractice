package com.gdchent.kotlin.lambda.country

fun main() {
      val filterCounter = FilterCounter()
    val list= mutableListOf<Country>()
      filterCounter.filterCounters(list,filterCounter::isBigEuropeanCountry)
      filterCounter.filterCounters(list,{ country-> filterCounter.isBigEuropeanCountry(country) })
}