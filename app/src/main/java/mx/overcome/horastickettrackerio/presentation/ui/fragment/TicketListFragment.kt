package mx.overcome.horastickettrackerio.presentation.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import mx.overcome.horastickettrackerio.R
import mx.overcome.horastickettrackerio.data.model.Ticket
import mx.overcome.horastickettrackerio.databinding.FragmentTicketListBinding
import mx.overcome.horastickettrackerio.presentation.adapter.OnTicketClickListener
import mx.overcome.horastickettrackerio.presentation.adapter.TicketListAdapter
import mx.overcome.horastickettrackerio.presentation.ui.activity.MainActivity
import mx.overcome.horastickettrackerio.presentation.ui.viewmodel.TicketViewModel


class TicketListFragment : Fragment(), OnTicketClickListener {

    private var _binding : FragmentTicketListBinding? = null
    private val binding get() = _binding!!

    private lateinit var ticketListAdapter: TicketListAdapter

    private val ticketViewModel: TicketViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTicketListBinding.inflate(inflater, container, false)
        initRecyclerView()
        (requireActivity() as MainActivity).getFabAddTicket().show()
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        ticketViewModel.ticketList.observe(viewLifecycleOwner) { ticketList ->
            ticketListAdapter.submitList(ticketList)
        }
    }

    private fun initRecyclerView() {
        ticketListAdapter = TicketListAdapter(this)
        binding.fragTicketListRvTicketPool.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ticketListAdapter
        }
    }

    // Implement interface to open TicketDetailFragment on click with Ticket Information
    override fun onTicketClick(ticket: Ticket) {
        val ticketDetailFragment = TicketDetailFragment.newInstance(ticket)
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace((requireView().parent as ViewGroup).id, ticketDetailFragment)
            .addToBackStack(null)
            .commit()
    }

}