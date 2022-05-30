package net.ivanvega.mapasconosmdroida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RutaPersonalizada extends AppCompatActivity {

    EditText lat1,long1,lat2,long2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_personalizada);

        lat1=findViewById(R.id.lat1);
        long1=findViewById(R.id.long1);
        lat2=findViewById(R.id.lat2);
        long2=findViewById(R.id.long2);

        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("lat1",lat1.getText().toString());
                intent.putExtra("lat2",lat2.getText().toString());
                intent.putExtra("long1",long1.getText().toString());
                intent.putExtra("long2",long2.getText().toString());
                startActivity(intent);


            }
        });


    }
}