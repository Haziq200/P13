package sg.edu.rp.dmsd.p13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 17010603 on 14/8/2018.
 */

public class AnotherBroadcastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"You have changed the wallpaper",Toast.LENGTH_LONG).show();
    }
}
