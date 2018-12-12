package com.example.chrono.tpath

class User {
    var id: Int =0
    var emailstu: String = ""
    var passwordstu: String = ""

    constructor(name:String,passwd:String){
        this.emailstu = name
        this.passwordstu = passwd
    }
}