package mx.overcome.horastickettrackerio.presentation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.activityViewModels
import mx.overcome.horastickettrackerio.R
import mx.overcome.horastickettrackerio.databinding.ActivityMainBinding
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

        //Use fragment
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.host_fragment, TicketListFragment())
                .commit()
        }

        binding.fabAddTicket.setOnClickListener {
            ticketViewModel.getAllTicketList()
        }

    }
}
