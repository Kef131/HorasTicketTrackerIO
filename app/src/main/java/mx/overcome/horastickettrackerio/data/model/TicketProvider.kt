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
                "Database Connection Timeout",
                LocalDateTime.now().toDate(),
                "Jane",
                "Development",
                TicketType.BUG,
                PriorityTicket.HIGH,
                "1.1",
                "Users are experiencing slow response times when accessing the application, " +
                        "and some are encountering a database connection timeout error. This issue has been " +
                        "reported by multiple users and needs to be investigated urgently.",
                null,
                TicketState.RESOLVED
            ),
            Ticket(
                4,
                "Implement Dark Mode",
                LocalDateTime.now().toDate(),
                "Pedro",
                "Design",
                TicketType.FEATURE,
                PriorityTicket.MEDIUM,
                "1.03 Alpha",
                "Introduce a dark mode option to the application to provide a better user experience " +
                        "in low-light environments. This should include an easy toggle for users to switch " +
                        "between light and dark mode according to their preferences.",
                null,
                TicketState.IN_PROGRESS
            ),
            Ticket(
                5,
                "Fix Broken Links in Help Documentation",
                LocalDateTime.now().toDate(),
                "Samantha",
                "Documentation",
                TicketType.BUG,
                PriorityTicket.LOW,
                "1.0",
                "Several broken links have been reported in the help documentation. These need to be identified " +
                        "and fixed to ensure users can easily navigate and access relevant information.",
                null,
                TicketState.ARCHIVED
            ),
        )
    }
}