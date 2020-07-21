package multiple.unique.constraint.error
import sec.Requestmap
class BootStrap {

    def init = { servletContext ->
      println 1111111

    try{
      new Requestmap(url: '/test1/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets", httpMethod:"POST").save(failOnError:true)
      println 2222222
      new Requestmap(url: '/test1/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets").save(failOnError:true)
      println 3333333  
    }catch(Exception e){
      println e
    }

    try{
      new Requestmap(url: '/test2/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets").save(failOnError:true)
      new Requestmap(url: '/test2/**', configAttribute: "IS_AUTHENTICATED_ANONYMOUSLY",name:"Assets", httpMethod:"POST").save(failOnError:true)
    }catch(Exception e){
      println e
    }

    }
    def destroy = {
    }
}
