package mx.overcome.horastickettrackerio.utils

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
enum class PriorityTicket: Parcelable {
    LOW,
    MEDIUM,
    HIGH
}