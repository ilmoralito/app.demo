package grails.demo

class EmailService {

    PersonService personService

    void send() {
        List<Person> personList = personService.find('ana')

        personList.each { Person person ->
            println "Sending email to $person.name $person.email"
        }
    }
}
