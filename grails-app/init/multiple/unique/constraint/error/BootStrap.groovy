package multiple.unique.constraint.error
import sec.Requestmap
class BootStrap {

    def init = { servletContext ->
      new Requestmap(url: '/test1/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets", httpMethod:"POST").save(failOnError:true)
      new Requestmap(url: '/test1/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets").save(failOnError:true)
    }
    def destroy = {
    }
}
