package com.herrera.tp1_dm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Llamada extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        boolean aux =  intent.getExtras().getBoolean("connected");

        if (aux)
        {
            Toast.makeText(context, "Iniciando llamada...", Toast.LENGTH_LONG).show();
            Intent intento = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 911"));
            context.startActivity(intento);
        }
    }
}
