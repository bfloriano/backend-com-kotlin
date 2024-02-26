fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")
    println("${slugTitulo}_${slugAutor}")

}

fun String.generateSlug(): String {
    var text = this.replace(". ", "-").replace(" ", "-").toLowerCase()
    return text
}

