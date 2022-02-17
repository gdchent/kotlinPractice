package diu06

class KotlinSetGetBean {
    private var userName:String?=null
     set(value) {
         field =value
     }
    get() {
       return field
    }
    private var userPwd:String?=null
    set(value) {
        field=value
    }
    get() {
        return field;
    }
}