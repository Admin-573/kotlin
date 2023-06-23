import java.util.Scanner
fun main()
{
    println()
    while(true)
    {
        println("Topic 1.5 Arrays And Lists :- ")
        println("1.Arrays :- ")
        println("2.Lists :- ")
        println("3.Exit :- ")

        val scanner = Scanner(System.`in`)
        print("Enter The Choice : ")
        val Choice = scanner.nextInt()

        when(Choice)
        {
            1->
            {
                array_program()
            }
            2->
            {
                list_program()
            }
            3->
            {
                println("Exiting...")
                return
            }
            else->
            {
                println("Invalid Choice !")
            }
        }
    }
}
fun array_program()
{
    println()
    println("Array Operations Program :-")
    val scanner = Scanner(System.`in`)
    var array : IntArray? = null

    while (true)
    {
        println("1.Create Array :-")
        println("2.Modify Array Element :-")
        println("3.Access Array Element :-")
        println("4.Exit :-")

        println()

        print("Enter Your Choice : ")
        val choice = scanner.nextInt()

        when (choice)
        {
            1-> {
                print("Enter The Array Size : ")
                val size = scanner.nextInt()
                println()
                array = IntArray(size)
                println("Array Created Of Size $size")
                println()
            }
            2-> {
                if (array != null)
                {
                    print("Enter The Index Of Element To Modify : ")
                    val index = scanner.nextInt()
                    println()

                    if(index in array.indices)
                    {
                        print("Enter New Value : ")
                        val newValue = scanner.nextInt()
                        array[index]=newValue
                        println("New Value Modified $newValue")
                        println()

                    } else {
                        println("Invalid Index !")
                    }
                }
                else
                {
                    println("Array Not Created Yet !")
                }
            }
            3-> {
                if (array != null)
                {
                    print("Enter Array Index To Access : ")
                    val index1 =scanner.nextInt()

                    if (index1 in array.indices)
                    {
                        val value = array[index1]
                        println("Value At index : $index1 Is $value")
                        println()
                    }
                    else
                    {
                        println("Invalid Index !")
                    }
                }
                else
                {
                    println("Array Not Created Yet !")
                }
            }
            4->{
                println("Exiting Array...")
                println()
                return
            }
            else-> {
                println("Invalid Choice !")
            }
        }
    }
}
fun list_program()
{
    val scanner = Scanner(System.`in`)
    var list: MutableList<Int>? = null
    println()
    println("List Operation Program :-")
    while (true)
    {
        println("1.Create A List :-")
        println("2.Modify List Elements :-")
        println("3.Access List Elements :-")
        println("4.Exit")

        println()

        print("Enter Your Choice : ")
        val choice = scanner.nextInt()

        when (choice)
        {
            1-> {
                print("Enter The Size Of List : ")
                val size = scanner.nextInt()

                list = mutableListOf()
                for (i in 0 until size) {
                    print("Enter Element $i: ")
                    val item = scanner.nextInt()
                    list.add(item)
                }
                println("List Successfully Created !")
                println()
            }

            2->{
                if(list != null)
                {
                    println("Current List Items : $list")
                    println()
                    print("Enter Index Of Item To Modify : ")
                    val index = scanner.nextInt()

                    if (index in list.indices)
                    {
                        print("Enter A New Item : ")
                        val newItem = scanner.nextInt()
                        list[index] = newItem
                        println("Item Modified Successfully !")
                        println()
                    }
                    else
                    {
                        println("Invalid Index")
                    }
                }
                else
                {
                    println("List Not Created Yet !")
                }
            }

            3->{
                if(list != null)
                {
                    println("Current List Items : $list")
                    println()
                    print("Enter Index Of Item To Access : ")
                    val index = scanner.nextInt()

                    if(index in list.indices)
                    {
                        val value = list[index]
                        println("Value At Index $index Is $value")
                        println()
                    }
                    else
                    {
                        println("Invalid List")
                    }
                }
                else
                {
                    println("List Not Created Yet !")
                }
            }
            
            4->{
                println("Exiting Lists...")
                println()
                return
            }
            
            else ->
            {
                println("Invalid Choice !")
            }
        }
    }
}