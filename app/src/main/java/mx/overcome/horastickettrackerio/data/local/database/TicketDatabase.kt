package mx.overcome.horastickettrackerio.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import mx.overcome.horastickettrackerio.data.local.dao.TicketDao
import mx.overcome.horastickettrackerio.data.model.Ticket

@Database(entities = [Ticket::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class TicketDatabase : RoomDatabase() {
    abstract fun ticketDao(): TicketDao

    companion object {
        @Volatile
        private var INSTANCE: TicketDatabase? = null

        fun getDatabase(context: Context): TicketDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TicketDatabase::class.java,
                    "ticket_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }


}