package grails.demo

import grails.gorm.services.Service

interface IPersonService {
    List<Person> list()
}

@Service(Person)
abstract class PersonService implements IPersonService {

    List<Person> find(final String name) {
        Person.where { name == name }.list()
    }
}
