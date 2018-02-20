package corp.poopapps.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNombre, eCorreo;
    //Button bGuardar;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre = findViewById(R.id.eNombre);
        eCorreo = findViewById(R.id.eCorreo);
  //      bGuardar = findViewById(R.id.bGuardar);

       /* bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre = eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        });*/
    }

    public void onButtonClicked(View view) {
        nombre = eNombre.getText().toString();
        eCorreo.setText(nombre);
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        if(id == R.id.rMasculino){
            eCorreo.setText("Masculino");
            //code
        }
        else{
            eCorreo.setText("Femenino");
        }
    }

    public void onCheckBoxClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.cCine:
                eCorreo.setText("Cine");
                break;

            case R.id.cNadar:
                eCorreo.setText("Nadar");
                break;

            case R.id.cPlay:
                eCorreo.setText("Play");
                break;
        }
    }
}
