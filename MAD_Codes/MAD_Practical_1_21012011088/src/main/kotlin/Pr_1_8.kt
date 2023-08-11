// Que : Create different types of Array as shown in image. Explore Arrays.deepToString(), contentDeepToString() methods, IntArray variable .joinToString()  and use in program to print Array. Explore range, downTo, until etc. for loop and use in this program. Sort Array of Integer data type without using inbuilt function & with using inbuilt function.
import java.util.Arrays
var lambdaFun = {size:Int -> Array<Int>(size){index -> index*2} }

fun sortArray(arrOrig : IntArray):IntArray{
    var arr = arrOrig;
    val len = arr.size;
    for(i in 0..<len){
        for(j in 0..<len){
            if (arr[j]>arr[i]){
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
    }
    return arr;
}

fun main() {
    println("Create Array using arrayOf() method :")
    var arr1 = arrayOf(2, 13, 1, 24, 16)
    println(Arrays.deepToString(arr1))

    println("Create Array using Array<>() method :")
    var arr2 = Array<Int>(5){0}
    println(arr2.contentDeepToString())

    println("Create Array using Array<>() and lambda method :")
    var arr3 = lambdaFun(5)
    println(arr3.contentDeepToString())

    println("Create Array using IntArray() method :")
    var arr4 = IntArray(5){0}
    println(arr4.joinToString())

    println("Create Array using IntArrayOf() method :")
    var arr5 = intArrayOf(12,10,5,24)
    println(arr5.joinToString())

    println("Create 2D Array using arrayOf & IntArrayOf() method :")
    var arr6 = arrayOf(intArrayOf(1,2) , intArrayOf(3,4))
    println(arr6.contentDeepToString())

    var arr7 = IntArray(5){0};
    println("Please Enter array values : ")
    for (i in 0..4){
        print("a[$i]=")
        arr7[i] = readln().toInt();
    }
    println(arr7.joinToString())

    println("After sorting with user-defined function : ")
    var sortArr = sortArray(arr7)
    println(sortArr.joinToString())

    println("After sorting with built-in function : ")
    arr7.sort()
    println(arr7.joinToString())
}