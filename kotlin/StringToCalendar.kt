fun String.toCalendar(): Calendar {
    val formatDateTime = "dd/MM/yyyy HH:mm"
    val format = SimpleDateFormat(formatDateTime, Locale("pt","BR"))
    return Calendar.getInstance().apply { time = format.parse(this@toCalendar) }
}