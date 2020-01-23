package ru.netology.hierarchy


open class View{
    open fun click(){
        println("View clicked")
    }
}

class ViewGroup:View(){
    fun addView(title: TextView) {
    }
}

open class TextView(var text: String): View(){

}

class Button(text: String): TextView(text){

}


fun main() {
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}