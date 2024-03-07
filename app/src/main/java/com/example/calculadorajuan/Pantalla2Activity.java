package com.example.calculadorajuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2Activity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        botonEnviar = findViewById(R.id.botonEnviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Pantalla2Activity.this, Pantalla3Activity.class);
                intent.putExtra("angulo", editText1.getText().toString());
                intent.putExtra("valor", editText2.getText().toString());
                intent.putExtra("potencia", editText3.getText().toString());
                intent.putExtra("numero", editText4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
