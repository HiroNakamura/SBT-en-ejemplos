package ejemplo


import javax.swing.JOptionPane


object Hola {
    def main(args: Array[String]): Unit = {
       println(testB()) 
       testA()
       testC()
       testD()
       testE()
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
        

    }

    def testD():Unit={
        val x: X = new X("Aldebaran de Casio")
        println(x.nombre)
        val y: Y = new Y("Fuller de Gilbrantad")
        println(y.nombre)
    }

    def testC(): Unit ={
        JOptionPane.showMessageDialog(null,"Estas usando javax en Scala","Scala",JOptionPane.INFORMATION_MESSAGE)
    }

    def testB(): String = {
        "*** Programando en Scala como si fuera en primero ***"
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

    }
}

class X(val nombre:String)

class Y(override val nombre:String) extends X(nombre)

