package mx.overcome.horastickettrackerio.presentation.adapter

import mx.overcome.horastickettrackerio.data.model.Ticket


interface OnTicketClickListener {
    fun onTicketClick(ticket: Ticket)
}