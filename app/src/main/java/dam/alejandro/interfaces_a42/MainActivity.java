package dam.alejandro.interfaces_a42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasca2);

        //Tasca 1
        Intent tasca1 = new Intent(this, Tasca1.class);

        //Tasca 2
        Intent tasca2 = new Intent(this, Tasca2.class);
        startActivity(tasca2);
    }
}