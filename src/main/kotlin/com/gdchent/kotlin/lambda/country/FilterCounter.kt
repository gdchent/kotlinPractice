package com.gdchent.kotlin.lambda.country



class FilterCounter {
    fun filterCounters(countries: List<Country>, test:(Country)->Boolean):List<Country>{ //增加了一个函数类型的参数
        val res = mutableListOf<Country>()
        //for in循环
        for(country in countries){
            if(test.invoke(country)){
                res.add(country)
            }
        }
        return res
    }
    fun isBigEuropeanCountry(country: Country):Boolean{
        return country.continient== "EU" &&country.popular>1000
    }
}