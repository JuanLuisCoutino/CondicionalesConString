println("Bienvenido, elige tu opción: \n acceso\n configuracion\n inicio")
var opcion = readLine()!!.lowercase()
when(opcion){

    "acceso"->{ println("Haz elegido acceso") }

    "configuracion"->{ println("Haz elegido configuracion") }

    "inicio"->{ println("Haz elegido inicio") }
    else->{
        println("No has elegido una opcion valida")
    }
}

//Ing. JUAN LUIS COUTIÑO LÓPEZ