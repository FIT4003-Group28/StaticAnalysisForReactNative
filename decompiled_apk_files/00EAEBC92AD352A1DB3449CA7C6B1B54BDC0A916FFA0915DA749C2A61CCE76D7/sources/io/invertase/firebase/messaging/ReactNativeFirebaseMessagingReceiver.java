package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.s;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, s> f10342a = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
        s sVar = new s(intent.getExtras());
        io.invertase.firebase.common.g b2 = io.invertase.firebase.common.g.b();
        if (sVar.v() != null) {
            f10342a.put(sVar.t(), sVar);
        }
        if (io.invertase.firebase.common.l.a(context)) {
            b2.b(n.a(sVar, (Boolean) false));
            return;
        }
        try {
            Intent intent2 = new Intent(context, ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra("message", sVar);
            if (context.startService(intent2) == null) {
                return;
            }
            com.facebook.react.c.a(context);
        } catch (IllegalStateException e2) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e2);
        }
    }
}
