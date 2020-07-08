function testarData(stringDate) {
    var date = stringDate;
    var array = new Array
    var regex = new RegExp("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}")
    array = date.split("/")

    if (date.search(regex) == -1)
        return false

    else if (((array[1] == 4) || (array[1] == 6) || (array[1] == 9) || (array[1] == 11)) && (array[0] > 30))
       return false

    else if (array[1] == 2) {
        if ((array[0] > 28) && ((array[2] % 4) != 0))
            return false
        if ((array[0] > 29) && ((array[2] % 4) == 0))
           return false
    } else 
        return  true
}