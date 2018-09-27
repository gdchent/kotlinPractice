



class MyIterator(val iterable: Iterable<Int>){

    operator fun next():Int{
        return iterable.iterator().next()
    }

    operator  fun hasNext():Boolean{

        return iterable.iterator().hasNext()
    }

}