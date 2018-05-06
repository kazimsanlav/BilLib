    package com.project.kazim.BilLib;


    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ImageView;

    public class MainActivity extends Activity {
         EditText editText = null;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            if( getIntent().getBooleanExtra("Exit me", false)){
                finish();
            }
            setContentView(R.layout.activity_main);
            ImageView myimage = (ImageView)findViewById(R.id.imageView);

            Button btnOne = (Button)findViewById(R.id.button_search);
            editText = (EditText)findViewById(R.id.Book_search);

            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SearchActivity.class);
                    intent.putExtra("book_name", editText.getText().toString());
                    startActivity(intent);
                }
            });


            /**
             * Library Rules Button
             */
            Button rules = (Button) findViewById(R.id.rules_button);
            rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(MainActivity.this, RulesActivity.class);
                    startActivity(myIntent);
                }
            });
            /**
             * Notifications Button
             */
            Button notifications = (Button) findViewById(R.id.notification_button);
            notifications.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent2 = new Intent(MainActivity.this, NotificationsActivity.class);
                    startActivity(myIntent2);
                }
            });

        }
        protected void onDestroy(){
            super.onDestroy();
            System.exit(0);
        }





    }
