package fr.dc.bdw1.partiel;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    private MenuInflater ActivityMainBinding;

    TextInputEditText des = findViewById(R.id.des);
    TextInputEditText faces = findViewById(R.id.faces);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button1);


        String chaine1 = des.getText().toString();
        String chaine2 = faces.getText().toString();


        ActivityResultLauncher<Intent> LancementActivityResultLauncher = this.registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        switch (result.getResultCode()) {
                            case RESULT_CANCELED:
                                break;

                            case RESULT_OK: {


                            }
                        }
                        Log.d("Mainactivity", String.valueOf(result.getResultCode()));

                    }
                }


        );


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LancementActivity.class);
                LancementActivityResultLauncher.launch(i);
                String chaine1 = des.getText().toString();
                String chaine2 = faces.getText().toString();

                i.putExtra("chaine1", chaine1);
                i.putExtra("chaine2", chaine2);

            }
        });
    }

}