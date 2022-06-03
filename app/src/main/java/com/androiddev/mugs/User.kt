package com.androiddev.mugs

class User {
    var name : String? = null
    var email : String? = null
    var phone : String? = null
    var uid : String? = null

    constructor(name:String?, email:String?, phone:String?, uid:String?){
        this.name = name
        this.email = email
        this.phone = phone
        this.uid = uid
    }
}