fun main(){
    var brands = arrayOf("gucci","addidas","puma","nike")

    println("array sizr:"+brands.size)
    println(brands[1])
    brands[0]="LV"

    for (i in brands){
        println(i)
    }

}