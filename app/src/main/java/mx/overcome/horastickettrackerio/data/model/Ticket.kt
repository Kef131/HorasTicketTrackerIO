package mx.overcome.horastickettrackerio.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import mx.overcome.horastickettrackerio.utils.IncidentType
import mx.overcome.horastickettrackerio.utils.Priority
import mx.overcome.horastickettrackerio.utils.TicketState
import java.util.Date

@Entity(tableName = "ticket")
data class Ticket(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val creationDate: Date,
    val responsibleName: String,
    val responsibleTeam: String? = null,
    val incidentType: IncidentType,
    val priority: Priority,
    val softwareVersion: String? = null,
    val description: String,
    val attachmentURIs: List<String>? = null,
    val status: TicketState = TicketState.OPEN
)