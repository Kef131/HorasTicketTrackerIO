package mx.overcome.horastickettrackerio.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.overcome.horastickettrackerio.R
import mx.overcome.horastickettrackerio.data.model.Ticket
import mx.overcome.horastickettrackerio.databinding.FragmentTicketDetailBinding
import java.text.SimpleDateFormat

class TicketDetailFragment : Fragment() {

    private var _binding : FragmentTicketDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTicketDetailBinding.inflate(inflater, container, false)

        val ticket = requireArguments().getParcelable<Ticket>(ARG_TICKET)

        binding.fragTicketDetTvCreationDate.text = "Creation Date: ${SimpleDateFormat("dd MMM yyyy").format(ticket?.creationDate)}"
        binding.fragTicketDetTvTicketTitle.text = ticket?.title
        binding.fragTicketDetTvResponsible.text = "Responsible: ${ticket?.responsible}"
        binding.fragTicketDetTvTeam.text = ticket?.responsibleTeam ?: "No team assigned"
        binding.fragTicketDetTvSoftwareVer.text = ticket?.softwareVersion ?: "No software version"
        binding.fragTicketDetTvTicketType.text = "Type: ${ticket?.ticketType.toString()}"
        binding.fragTicketDetTvTicketPriority.text = "Priority: ${ticket?.priorityTicket.toString()}"
        binding.fragTicketDetEtDescription.setText(ticket?.description)

        binding.fragTicketDetBtnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }


        return binding.root
    }

    companion object {
        private const val ARG_TICKET = "arg_ticket"

        fun newInstance(ticket: Ticket): TicketDetailFragment {
            val args = Bundle().apply {
                putParcelable(ARG_TICKET, ticket)
            }
            return TicketDetailFragment().apply {
                arguments = args
            }
        }
    }

}