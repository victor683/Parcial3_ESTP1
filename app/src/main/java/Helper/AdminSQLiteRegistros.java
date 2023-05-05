package Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteRegistros extends SQLiteOpenHelper {
    public AdminSQLiteRegistros(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Cliente(Id_Cliente int primary key, " +
                "NombreCliente text, ApellidosCliente text, DireccionCliente text, CiudadCliente text )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
