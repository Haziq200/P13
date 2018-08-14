package sg.edu.rp.dmsd.p13;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver br = new AnotherBroadcastReciever();
    RadioGroup rgOption;
    RadioButton rgTaste;
    RadioButton rgBro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
         filter.addAction("android.intent.action.WALLPAPER_CHANGED");
         this.registerReceiver(br,filter);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        this.unregisterReceiver(br);
    }





}
