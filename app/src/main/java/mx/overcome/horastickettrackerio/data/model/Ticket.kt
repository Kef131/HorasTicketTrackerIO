package mx.overcome.horastickettrackerio.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import mx.overcome.horastickettrackerio.utils.TicketType
import mx.overcome.horastickettrackerio.utils.PriorityTicket
import mx.overcome.horastickettrackerio.utils.TicketState
import java.util.Date

@Entity(tableName = "ticket")
data class Ticket(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val creationDate: Date,
    val responsible: String,
    val responsibleTeam: String? = null,
    val ticketType: TicketType,
    val priorityTicket: PriorityTicket,
    val softwareVersion: String? = null,
    val description: String,
    val attachmentURIs: List<String>? = null,
    val status: TicketState = TicketState.OPEN
)