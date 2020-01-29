package ru.netology.hierarchy

class ViewGroup():View(){
    lateinit var view: TextView // поле класса.
    fun addView(title: TextView) { 
        view = title // функция addView которая сохраняет в переменную view  передаваемое значение.
    }
}
