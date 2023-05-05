package mx.overcome.horastickettrackerio.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import mx.overcome.horastickettrackerio.data.model.Ticket

@Dao
interface TicketDao {
    @Query("SELECT * FROM ticket ORDER BY creationDate DESC")
    fun getTickets(): LiveData<List<Ticket>>

//    @Query("SELECT * FROM ticket WHERE status = 'NEW' ORDER BY creationDate DESC")
//    fun getNewTickets(): LiveData<List<Ticket>>

//    @Query("SELECT * FROM ticket WHERE status = 'IN_PROGRESS' ORDER BY creationDate DESC")
//    fun getInProgressTickets(): LiveData<List<Ticket>>

//    @Query("SELECT * FROM ticket WHERE status = 'RESOLVED' ORDER BY creationDate DESC")
//    fun getDoneTickets(): LiveData<List<Ticket>>

//    @Query("UPDATE ticket SET status = 'ARCHIVED' WHERE id = :ticketId")
//    suspend fun archiveTicket(ticketId: Long)

    @Query("SELECT * FROM ticket WHERE id = :ticketId")
    fun getTicket(ticketId: Long): LiveData<Ticket>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTicket(ticket: Ticket): Long

    @Update
    suspend fun updateTicket(ticket: Ticket)
}