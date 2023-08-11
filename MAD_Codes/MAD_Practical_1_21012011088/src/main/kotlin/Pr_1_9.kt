fun main(){
    println("Enter the Array values : ")
    var arr = Array<Int>(5){0};
    for(i in 0..<5){
        print("arr[$i] = ")
        arr[i] = readln().toInt();
    }
    arr.sort();
    println("Largest Element is = ${arr[arr.size-1]}")
}