package grails.demo

class Person {

    String name
    String email

    static constraints = {
        name blank: false
        email blank: false, email: true, unique: true
    }
}
