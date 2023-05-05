package mx.overcome.horastickettrackerio.utils

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
enum class TicketState: Parcelable {
    OPEN,
    IN_PROGRESS,
    RESOLVED,
    ARCHIVED
}