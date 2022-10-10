package com.prankit.oopsinkotlin

/*
    1. Please create a class called MobilePhone.
       It should have three primary constructor variables, osName, brand and model.
    2. Use the initializer to print those details.
    3. Create three objects of that class in the Main function.

    Examples of phones would be:
    Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra
 */

class MobilePhone(osName: String, brand: String, model: String){ // class with constructor

    // initialize the class
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}

fun main(){

    // objects of the class MobilePhone
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}