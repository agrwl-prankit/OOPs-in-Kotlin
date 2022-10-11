package com.prankit.oopsinkotlin

// Declaring properties

/*
    Properties in Kotlin classes can be declared either as mutable,
    using the var keyword, or as read-only, using the val keyword.
 */

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

// To use a property, simply refer to it by its name:

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}

/*
    The full syntax for declaring a property is as follows:

    var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
 */

/*
    The initializer, getter, and setter are optional.
    The property type is optional if it can be inferred from the initializer
    or the getter's return type, as shown below:

    var initialized = 1 // has type Int, default getter and setter
    var allByDefault // ERROR: explicit initializer required, default getter and setter implied
 */

/*
    You can define custom accessors for a property.
    If you define a custom getter, it will be called every time you access the property
    (this way you can implement a computed property).
    Here's an example of a custom getter:
 */

class Rectangle(val width: Int, val height: Int) {
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height

    // You can omit the property type if it can be inferred from the getter:
    val area2 get() = this.width * this.height
}