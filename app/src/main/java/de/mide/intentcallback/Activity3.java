package de.mide.intentcallback;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity 3, die mit einem expliziten Intent angesprungen wird.
 * <br/><br/>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class Activity3 extends Activity implements OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_3);

            Button zurueckButton = findViewById(R.id.zurueckButtonAufActivity3);
            zurueckButton.setOnClickListener(this);
        }


        /**
         * Button-Event-Handler für Zurücksprung zur Main-Activity.
         */
        @Override
        public void onClick(View view) {

            Log.i("Intent-Callback",
                    "Springe jetzt von Activity3 zurück zur MainActivity zurück.");
        }

}