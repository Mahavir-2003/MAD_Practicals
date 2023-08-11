class car(
    var carobjn: Int,
    var type: String,
    var model: String,
    var originalprice: Long,
    var currentprice: Long,
    var owner: String,
    var miles: Int
) {
    fun getcarprice(): Long {
        return originalprice
    }

    fun getcarinformation(): Array<String> {
        var a1 = arrayOf<String>(type, model, owner)
        return a1
    }

    fun getoriginalprice(): Long {
        return originalprice
    }

    fun getcurrentprice(): Long {
        return currentprice
    }

    fun displycarinfo() {
        println("Creating car class object car$carobjn in next line")
        println("Object of class is created and Init is Called.")
        println("----------")
        var a = getcarinformation()
        println("Car Information : ${a[0]},${a[1]}")
        println("Car Owner : ${a[2]}")
        println("Miles Drive : $miles")
        println("Original Car Price : $originalprice")
        println("Current Car Price : $currentprice")
        println("----------")
    }


}

fun main() {
    var no: Int = 0;
    no = no + 1
    var obj1 = car(no, "Alto 800", "2000", 150000, 98950, "Mahavir", 6546)
    obj1.displycarinfo()
    no=no+1
    var obj2= car(no,"BMW","2019",400000,350000,"Raj",20)
    obj2.displycarinfo()
    println("************ ArrayList of Car *****************")
    no=no+1
    var obj3=car(no,"Toyota","2017",1080000,1079000,"Mahavir",100)
    no=no+1
    var obj4=car(no,"Maruti","2020",4000000,3998000,"Nisarg",200)

    var person=arrayOf<car>(obj3,obj4)
    for(i in person)
    {
        i.displycarinfo()
    }
}