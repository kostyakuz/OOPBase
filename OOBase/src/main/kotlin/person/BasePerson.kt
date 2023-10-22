package person

import java.awt.Point
import javax.print.attribute.standard.Destination

open class BasePerson(inputHealth: Int) {
    var healthe: Int = inputHealth
    private var location: Point = Point()

    fun muve(destination: Point){
       location = destination
   }

    fun destroy(){
     println("Destroying Base Person")
    }

}