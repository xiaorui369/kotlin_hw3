package ru.netology.hierarchy


fun main() {
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}