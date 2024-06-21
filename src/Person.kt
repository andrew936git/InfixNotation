import javax.security.auth.kerberos.KerberosCredMessage

class Person(val name: String) {
    val message = ""
    infix fun say(message: String){
        println("$name говорит \"$message\"")
    }
}