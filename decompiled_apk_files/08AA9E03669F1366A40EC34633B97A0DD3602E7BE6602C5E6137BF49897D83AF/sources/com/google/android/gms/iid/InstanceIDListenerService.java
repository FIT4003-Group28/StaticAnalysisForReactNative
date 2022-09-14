package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
@Deprecated
/* loaded from: classes.dex */
public class InstanceIDListenerService extends zze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(Context context, zzak zzakVar) {
        zzakVar.zzx();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            return;
        }
        Bundle bundle = null;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra != null) {
            bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
        }
        InstanceID instanceID = InstanceID.getInstance(this, bundle);
        String stringExtra2 = intent.getStringExtra("CMD");
        if (Log.isLoggable("InstanceID", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 34 + String.valueOf(stringExtra2).length());
            sb.append("Service command. subtype:");
            sb.append(stringExtra);
            sb.append(" command:");
            sb.append(stringExtra2);
            Log.d("InstanceID", sb.toString());
        }
        if ("RST".equals(stringExtra2)) {
            instanceID.zzm();
        } else if (!"RST_FULL".equals(stringExtra2)) {
            if (!"SYNC".equals(stringExtra2)) {
                return;
            }
            InstanceID.zzn().zzi(String.valueOf(stringExtra).concat("|T|"));
            onTokenRefresh();
            return;
        } else if (InstanceID.zzn().isEmpty()) {
            return;
        } else {
            InstanceID.zzn().zzx();
        }
        onTokenRefresh();
    }

    public void onTokenRefresh() {
    }
}
