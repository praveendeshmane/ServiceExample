package blog.praveendeshmane.co.in.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start = null, stop = null, next = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.button);
        stop =  findViewById(R.id.button2);
        next =  findViewById(R.id.button3);
    }

    public void start(View view){
        startService(new Intent(this, MyService.class));
    }

    public void stop(View view){
        stopService(new Intent(this, MyService.class));
    }

    public void next(View view){
        Intent intent=new Intent(this,NextActivity.class);
        startActivity(intent);
    }
}
