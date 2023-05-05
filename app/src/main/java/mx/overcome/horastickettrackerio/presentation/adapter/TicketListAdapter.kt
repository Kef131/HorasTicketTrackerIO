package mx.overcome.horastickettrackerio.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import mx.overcome.horastickettrackerio.data.model.Ticket
import mx.overcome.horastickettrackerio.databinding.ItemTicketSummaryBinding


class TicketListAdapter(private val clickListener: OnTicketClickListener) :
    ListAdapter<Ticket, TicketListAdapter.TicketViewHolder>(TicketDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketViewHolder {
        val binding = ItemTicketSummaryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TicketViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TicketViewHolder, position: Int) {
        val alias = getItem(position)
        holder.bind(alias)
    }

    inner class TicketViewHolder(private val binding: ItemTicketSummaryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(ticket: Ticket) {
            binding.apply {
                cardTvIdTicket.text = ticket.id.toString() ?: "Error retrieving data from model"
                cardTvTitleTicket.text = ticket.title ?: "Error retrieving data from model"
                cardTvResponsibleTicket.text = ticket.responsible ?: "Error retrieving data from model"
                cardTvDescriptionTicket.text = ticket.description ?: "Error retrieving data from model"
                cardTvTypeTicket.text = ticket.ticketType.toString() ?: "Error retrieving data from model"
                cardTvPriorityTicket.text = ticket.priorityTicket.toString() ?: "Error retrieving data from model"
            }
            binding.root.setOnClickListener {
                clickListener.onTicketClick(ticket)
            }
        }
    }

    // This is a workaround to avoid a bug in the ListAdapter
    override fun submitList(list: List<Ticket>?) {
        super.submitList(list?.toList())
    }
}

object TicketDiffCallback : DiffUtil.ItemCallback<Ticket>() {
    override fun areItemsTheSame(oldItem: Ticket, newItem: Ticket): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Ticket, newItem: Ticket): Boolean {
        return oldItem == newItem
    }
}