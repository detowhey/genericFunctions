fun Date.string(): String {
    return SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR")).format(this)
}

fun String.toDate(): Date {
    return SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR")).parse(this)
}
