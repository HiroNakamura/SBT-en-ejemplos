package ejemplo


import javax.swing.JOptionPane
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


object Hola {
    def main(args: Array[String]): Unit = {
       println(testB()) 
       testA()
       testC()
       testD()
       testE()
       testF()
    }

<<<<<<< HEAD
    def testF():Unit={
        def servicio = new ServicioImpl()
        servicio.abrir()
=======
    def testF(): Unit = {
        var nombre:String = "Fernando Carraro Aguirre"
        var suma:Int = 0
        val palabras = nombre.split(" ")
        println(nombre)
        println("Cant. de palabras: "+palabras.size)
        for (e <- palabras) {
            println(e+" : "+e.length())
            suma += e.length()
        }
        println("Cant. de letras: "+suma)
>>>>>>> 8f2256bc81ebb27d38da8c713115151f812d6799
    }

    def testE():Unit={
        for( w <- 0 to 3){ 
            println(w); 
        }
        println("*****************************")
        for( w <- 0 until 3){ 
            println(w); 
        }
        println("*****************************")
        for( w <- 0 to 3; z<- 8 until 9 ) { 
            println("Valor de w:" +w); 
            println("Value de y:" +z); 
        } 
        println("*****************************") 
        val numeros = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
        var cont = 0
        for(cont <- numeros){
            println(cont)
        }
        println("*****************************") 
        var diccionario = Map("A"->1, "B" -> 2, "C"->3)
        println("Valor de A: "+diccionario("A"))
        println("*****************************")
        for ((k,v) <- diccionario){
            printf("key: %s, value: %s\n", k, v)
        }
        println("*****************************")
        var contador = 0
        while(contador < 4){
            println("Contador: "+contador)
            contador = contador + 1
        }

        numeros.foreach{ println }
        var suma:Int = 0
        numeros.foreach{ suma+=_}
        printf("Suma: %d\n",suma)

        val vector = Vector("A","N","A"," ","M","A","R","I","A")
        var concatenar:String =""
        vector.foreach{ concatenar+=_ }
        printf("%s\n",concatenar)
        for (v <- vector if v.startsWith("A")){
            println(v)
        }
        println("*****************************")
        val numeral = (1 to 100000).toList
        println("Suma: "+numeral.reduce{_+_})
        val str:String = "FERROCARRILERO".toLowerCase()
        printf("%s\n",str)
        str.foreach{println}
        println("*****************************")
        for(i <- 1 to 3) println(i)
        for(i <- 3 to 1) println(i)
        for(i <- 5 to 1 by -1) println(i)
        for(i <- 5 to 1 by -2) println(i)
        for(i <- 1 to 5 by 2) println(i)
        for(i <- 5 to 1 by 1) println(i)
        println("*****************************")
        val arrayInt = Array(1,2,3,4)
        val arrayStr = Array("1","2","3","4")
        arrayInt.foreach{println}
        arrayStr.foreach{println}
        println("*****************************")
        val tupla = (123,"Juan Perez",true,'\u0021')
        println("Tupla: "+tupla)
    }

    def testD():Unit={
        val x: X = new X("Aldebaran de Casio")
        println(x.nombre)
        if(isX(x) == true){
            println("Es de tipo X")
        }
        val y: Y = new Y("Fuller de Gilbrantad")
        println(y.nombre)
        val a = new A()
        val b:B = new B()
        try{
            a.metodo()
            b.metodo()
        }catch{
            case ex: Exception => { 
                println("Ha ocurrido una excepcion") 
            }
        }

        val z:Z = new Z("Juan Polinar Sanchez",true)
        z.metodo()
        //Esto no puede ser: atributos nombre y activo son private, no se puede acceder a ellos
        //if(z.activo){
            //printf("%s\n",z.nombre)
        //}

        if(z.isActivo()){
            println("Nombre: "+z.getNombre())
        }
        println("***************************************")
        val q = new Q("Ana")
        printf("Nombre: %s\n",q.nombre)
        q.setNombre("Maria")
        println("Nombre: "+q.getNombre())
        println("****************************************")
        val hijaNoAbs:HijaNoAbs = new HijaNoAbs()
        println("a: "+hijaNoAbs.a)
        
        
        //Esto no se puede: MyTrait es abstracta:
        //val myTrait = new MyTrait()
        //println("a: "+myTrait.a)

        val hijatrait:HijaTrait = new HijaTrait(2)
        println("a: "+hijatrait.a)
        println("****************************************")
        
        ObjetoX.nombre ="Thomas Wayne"
        ObjetoY.edad = 32
        println("Nombre: "+ObjetoX.nombre)
        ObjetoY.metodo()

        //Esto no se puede:
        //MyTrait.a = 22
        //println("Valor de a: "+MyTrait.a)
        println("****************************************")
        val c1 = new MyCaseClass(122200L,"Torre 123","Dominique")
        val c2 = new MyCaseClass(199900L,"Aldama 101","Benedictus")
        val c3:MyCaseClass = new MyCaseClass(12222L,"Aldonjares 232","Romulo San Pedro")
        val listaCaseClass = Array(c1,c2,c3)
        println(c1)
        println(c2)
        println(c3)
        println("****************************************")
        listaCaseClass.foreach{println}

    }

    def testC(): Unit ={
        JOptionPane.showMessageDialog(null,"Estas usando javax en Scala","Scala",JOptionPane.INFORMATION_MESSAGE)
        try {
            val f = new FileReader("archivo.dat")
        }catch {
            case ex: FileNotFoundException => {
                println("El archivo no existe")
            }
            case ex: IOException => {
                println("Una excepcion al leer el archivo")
            }
        }finally {
            println("Hecho")
        }
    }

    def testB(): String = {
        "*** Programando en Scala como si fuera en primero ***"
    }

    def isX(x: Any): Boolean = x match {
        case o: X => true
        case _ => false
    }

    def testA():Unit={
        var byte:Byte = 1
        var corto:Short = 32
        var entero:Int = 5
        var cadena:String = "ABCD-1234"
        var real:Double = 45.87
        var flotante = 12.6f
        var verdadero:Boolean = 34 > 22
        var caracter:Character= '\u0099'
        var largo:Long = 123344L
        println("Byte: "+byte)
        println("Short: "+corto)
        println("Caracter: "+caracter)
        println("Entero: "+entero)
        println("Largo: "+largo)
        println("Cadena: "+cadena)
        println("Real: "+real)
        println("Flotante: "+flotante)
        println("Booleano: "+verdadero)

        if(verdadero){
            println("Esto es verdadero")
        }

        if(caracter == '$'){
            println("Esto no se vera")
        }else{
            println("Esto si se vera")
        }

        if(!verdadero){
            println("X")
        } else if(corto == 32){
            println("Y")
        }else{
            println("Z")
        }

        val opcion:Int = 1
        var resultado:String=""
        opcion match {
            case 1 =>  resultado = "Alef"
            case 2 => resultado = "Beth"
            case 3 => resultado = "Gimmel"
            case 4 => resultado = "Daleth"
            case 5 => resultado = "Hei"
        }
        println(resultado)

        val x = if (4 == 4) 1 else 0
        val y = if (5<4) "Hola" else "Adios"
        println("x: "+x)
        println("y: "+y)

    }
}

class X(val nombre:String)

class Y(override val nombre:String) extends X(nombre)

class A{
    def metodo():Unit={
        println("Metodo en A")
    }
}

class B extends A{
    override def metodo():Unit={
        println("Metodo en B")
    }
}

class Z(private val nombre:CharSequence, private val activo:Boolean){
    def saludar():String={
        "Hola, estoy en la clase Z"
    }
    def metodo():Unit={
        println(saludar())
        if(activo == true){
            printf("Nombre: %s\n",nombre)
        }
    }

    def getNombre():CharSequence={
        nombre
    }

    def isActivo():Boolean={
        activo
    }
}

class Q(var nombre:String){
    def setNombre(nombre:String):Unit={
        this.nombre = nombre
    }
    def getNombre():String = {
        nombre
    }

    def metodo():Unit={
        println("Estoy en la clase Q")
    }
}

abstract class Abstracta{
    val a:Int = 0
}

class HijaNoAbs extends Abstracta{
    override val a:Int=1
}

trait MyTrait {
  var a: Int
}

class HijaTrait(var a: Int) extends MyTrait

object ObjetoX{
    var nombre:String = ""
}

object ObjetoY{
    var edad:Int = 0

    def metodo():Unit={
        printf("Edad: %d\n",edad)
    }
}

case class MyCaseClass(clave:Long,direccion:String,nombre:CharSequence)

//En Scala las interfaces son trait
trait IServicio{
    def abrir(): Unit
}

class ServicioImpl extends IServicio{
    def abrir:Unit = println("Abriendo la puerta del auto!!")
}


