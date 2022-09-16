package com.google.android.apps.gmm.messaging.intent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissMessagingNotificationBroadcastReceiver extends BroadcastReceiver {
    public cjqy a;
    public gdo b;

    public static Intent a(Context context, String[] strArr, String str, String str2) {
        Intent intent = new Intent(context, DismissMessagingNotificationBroadcastReceiver.class);
        intent.setAction("com.google.android.apps.gmm.messaging.intent.DISMISS_MESSAGING_NOTIFICATION");
        intent.putExtra("other_participant_id", str);
        intent.putExtra("message_id_array", strArr);
        intent.putExtra("server_registration_id", str2);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.b.b();
        cjry e = cjrz.e();
        e.b(ddcu.m);
        String[] stringArrayExtra = intent.getStringArrayExtra("message_id_array");
        String stringExtra = intent.getStringExtra("other_participant_id");
        String stringExtra2 = intent.getStringExtra("server_registration_id");
        if (stringExtra != null && stringArrayExtra != null && stringExtra2 != null) {
            ddzf bZ = ddzg.t.bZ();
            ddcg bZ2 = ddcj.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddcj ddcjVar = (ddcj) bZ2.b;
            stringExtra.getClass();
            ddcjVar.a |= 1;
            ddcjVar.b = stringExtra;
            bZ2.a(Arrays.asList(stringArrayExtra));
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddcj ddcjVar2 = (ddcj) bZ2.b;
            stringExtra2.getClass();
            ddcjVar2.a |= 4;
            ddcjVar2.d = stringExtra2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ.b;
            ddcj bK = bZ2.bK();
            bK.getClass();
            ddzgVar.o = bK;
            ddzgVar.b |= 32768;
            ((cjrn) e).a = bZ.bK();
        }
        cjqy cjqyVar = this.a;
        cjst d = cjsu.d();
        d.d(ddda.aS);
        d.f(e.a());
        cjqyVar.l(d.e());
        this.b.e();
    }
}
