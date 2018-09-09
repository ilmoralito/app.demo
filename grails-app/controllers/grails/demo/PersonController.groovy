package grails.demo

class PersonController {

    EmailService emailService

    def index() {
        emailService.send()

        render 'sending'
    }
}
