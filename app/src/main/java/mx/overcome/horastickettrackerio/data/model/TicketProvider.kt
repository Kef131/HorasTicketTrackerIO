package mx.overcome.horastickettrackerio.data.model

import mx.overcome.horastickettrackerio.utils.TicketType
import mx.overcome.horastickettrackerio.utils.PriorityTicket
import mx.overcome.horastickettrackerio.utils.TicketState
import java.util.Date

class TicketProvider {

    companion object {
        fun getMockTicket(): Ticket {
            val position = (0..tickets.size).random()
            return tickets[position]
        }

        fun getMockTicketList(): List<Ticket> {
            return tickets
        }

        private val tickets = listOf(
           Ticket(
               1,
               "Ticket 1",
               Date( 2021, 1, 1, 1, 1, 1),
               "Juan",
               null,
               TicketType.BUG,
               PriorityTicket.HIGH,
               null,
               "Description of ticket 1\nDescription of ticket 1\nDescription of ticket 1",
               null,
               TicketState.OPEN
           ),
            Ticket(
                2,
                "Ticket 2",
                Date( 2021, 1, 1, 1, 1, 1),
                "Juan",
                null,
                TicketType.FEATURE,
                PriorityTicket.MEDIUM,
                null,
                "Description of ticket 2\nDescription of ticket 2\nDescription of ticket 2",
                null,
                TicketState.IN_PROGRESS
            ),
            Ticket(
                3,
                "Ticket 3",
                Date( 2021, 1, 1, 1, 1, 1),
                "Juan",
                null,
                TicketType.BUG,
                PriorityTicket.HIGH,
                null,
                "Description of ticket 3\nDescription of ticket 3\nDescription of ticket 3",
                null,
                TicketState.IN_PROGRESS
            ),
            Ticket(
                4,
                "Ticket 4",
                Date( 2021, 1, 1, 1, 1, 1),
                "Juan",
                null,
                TicketType.BUG,
                PriorityTicket.HIGH,
                null,
                "Description of ticket 4\nDescription of ticket 4\nDescription of ticket 4",
                null,
                TicketState.RESOLVED
            ),
            Ticket(
                5,
                "Ticket 5",
                Date( 2021, 1, 1, 1, 1, 1),
                "Juan",
                null,
                TicketType.BUG,
                PriorityTicket.HIGH,
                null,
                "Description of ticket 5\nDescription of ticket 5\nDescription of ticket 5",
                null,
                TicketState.ARCHIVED
            ),
        )
    }
}