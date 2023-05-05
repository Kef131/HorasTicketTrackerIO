package mx.overcome.horastickettrackerio.data.model

import mx.overcome.horastickettrackerio.utils.TicketType
import mx.overcome.horastickettrackerio.utils.PriorityTicket
import mx.overcome.horastickettrackerio.utils.TicketState
import mx.overcome.horastickettrackerio.utils.toDate
import java.time.LocalDateTime
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
               "Server Problem: Not responding",
               LocalDateTime.now().toDate(),
               "Juan",
               "Development",
               TicketType.BUG,
               PriorityTicket.HIGH,
               "1.0",
               " Users are unable to access the email service due " +
                       "to a \"Server not responding\" error message. The issue has " +
                       "been ongoing for the past hour, and multiple users have reported the same problem.",
               null,
               TicketState.OPEN
           ),
            Ticket(
                2,
                "Change colors of the main interface",
                LocalDateTime.now().toDate(),
                "Maria",
                null,
                TicketType.FEATURE,
                PriorityTicket.MEDIUM,
                "1.03 Aplha",
                "Modify the color scheme of the main interface" +
                        " to align with the design specifications or user " +
                        "preferences. This should include adjustments to the " +
                        "background color, font color, and button color, in order" +
                        " to enhance the overall visual appeal and usability of the interface.",
                null,
                TicketState.IN_PROGRESS
            ),
            Ticket(
                3,
                "Ticket 3",
                LocalDateTime.now().toDate(),
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
                LocalDateTime.now().toDate(),
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
                LocalDateTime.now().toDate(),
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