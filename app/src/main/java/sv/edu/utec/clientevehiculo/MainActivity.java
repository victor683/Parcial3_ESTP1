package sv.edu.utec.clientevehiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Helper.AdminSQLiteRegistros;

public class MainActivity extends AppCompatActivity {
    EditText txtId_Clie, txtnomb,txtape,txtdir,txtciud;
    Button btnInser,btnActu,btnelimi;
    AdminSQLiteRegistros admin=new AdminSQLiteRegistros(getApplicationContext(),"Clientes", null,1 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtId_Clie=findViewById(R.id.txt_IdCliente);
        txtnomb=findViewById(R.id.txtNomb);
        txtape=findViewById(R.id.txtApelli);
        txtdir=findViewById(R.id.txtDire);
        txtciud=findViewById(R.id.txtCiud);
        btnInser=findViewById(R.id.btninsert);

        btnInser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase bd = admin.getWritableDatabase();
                int Id= Integer.parseInt(txtId_Clie.getText().toString());
                String nom= txtnomb.getText().toString();
                String apell= txtape.getText().toString();
                String dir= txtdir.getText().toString();
                String ciu= txtciud.getText().toString();

                ContentValues informacion = new ContentValues();
                informacion.put("Id_Cliente",Id);
                informacion.put("NombreCliente",nom);
                informacion.put("ApellidosCliente",apell);
                informacion.put("DireccionCliente",dir);
                informacion.put("CiudadCliente",ciu);




            }
        });

    }
}