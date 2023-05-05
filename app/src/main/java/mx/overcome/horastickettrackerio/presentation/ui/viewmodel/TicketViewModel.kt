package mx.overcome.horastickettrackerio.presentation.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mx.overcome.horastickettrackerio.data.model.Ticket
import mx.overcome.horastickettrackerio.data.model.TicketProvider

class TicketViewModel: ViewModel() {

    private val _ticketList = MutableLiveData<List<Ticket>>()
    val ticketList: LiveData<List<Ticket>> get() = _ticketList

    init {
        _ticketList.value = mutableListOf()
    }

    fun getAllTicketList() {
        try {
            val mockTicketList = TicketProvider.getMockTicketList()
            val updatedTicketList = mutableListOf<Ticket>().apply {
                addAll(ticketList.value ?: emptyList())
                addAll(mockTicketList)
            }
            _ticketList.value = updatedTicketList
        } catch (e: Exception) {
            // _errorMessage.value = e.message
        }
        val currentList = TicketProvider.getMockTicketList()

    }

    fun addTicket(ticket: Ticket) {
//        val currentList = TicketProvider.getMockTicketList()
//        currentList.add(ticket)
//        _ticketList.value = currentList
    }

}

//class MainViewModelFactory constructor(private val repository: UrlShortenerRepositoryImpl): ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
//            MainViewModel(this.repository) as T
//        } else {
//            throw IllegalArgumentException("ViewModel not found")
//        }
//    }
//}