package de.mide.intentcallback;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Activity 2, die mit einem expliziten Intent angesprungen wird.
 * <br/><br/>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class Activity2 extends Activity implements OnClickListener  {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);

            Button zurueckButton = findViewById(R.id.zurueckButtonAufActivity2);
            zurueckButton.setOnClickListener(this);
        }

        /**
         * Button-Event-Handler für Zurücksprung zur Main-Activity.
         */
        @Override
        public void onClick(View view) {

            Log.i("Intent-Callback",
                    "Springe jetzt von Activity2 zurück zur MainActivity zurück.");
        }

}