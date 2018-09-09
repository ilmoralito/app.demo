package grails.demo

class BootStrap {

    def init = { servletContext ->
        new Person(name: 'john', email: 'john.doe@example.com').save(failOnError: true)
        new Person(name: 'jane', email: 'jane.doe@example.com').save(failOnError: true)
        new Person(name: 'ana', email: 'ana.doe@example.com').save(failOnError: true)
        new Person(name: 'eddie', email: 'eddie.doe@example.com').save(failOnError: true)
    }
    def destroy = {
    }
}
