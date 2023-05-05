package mx.overcome.horastickettrackerio.utils

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.Date


fun LocalDateTime.toDate(): Date {
    return Date.from(this.atZone(ZoneId.systemDefault()).toInstant())
}
