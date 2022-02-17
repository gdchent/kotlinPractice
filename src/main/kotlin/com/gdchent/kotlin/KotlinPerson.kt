class KotlinPerson(name: String, sound: String, age: Int) {

    private var name: String? = null
    private var sound: String? = null
    private var age = 0

    init {
        this.name = name
        this.sound = sound
        this.age = age
        println("被调用")
    }
}
