package mx.overcome.horastickettrackerio.presentation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.activityViewModels
import com.google.android.material.floatingactionbutton.FloatingActionButton
import mx.overcome.horastickettrackerio.R
import mx.overcome.horastickettrackerio.data.model.Ticket
import mx.overcome.horastickettrackerio.databinding.ActivityMainBinding
import mx.overcome.horastickettrackerio.presentation.adapter.OnTicketClickListener
import mx.overcome.horastickettrackerio.presentation.adapter.TicketListAdapter
import mx.overcome.horastickettrackerio.presentation.ui.fragment.TicketListFragment
import mx.overcome.horastickettrackerio.presentation.ui.viewmodel.TicketViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val ticketViewModel: TicketViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setSupportActionBar(binding.toolbar)

        // Add the fragment to the 'fragment_container' FrameLayout
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.host_fragment, TicketListFragment())
                .commit()
        }

        // Add mock tickets
        binding.fabAddTicket.setOnClickListener {
            ticketViewModel.getAllTicketList()
            Toast.makeText(this, "Mock Tickets Added", Toast.LENGTH_SHORT).show()
        }

    }

    // Return the FAB to hande in the fragments
    fun  getFabAddTicket(): FloatingActionButton {
        return binding.fabAddTicket;
    }

}
