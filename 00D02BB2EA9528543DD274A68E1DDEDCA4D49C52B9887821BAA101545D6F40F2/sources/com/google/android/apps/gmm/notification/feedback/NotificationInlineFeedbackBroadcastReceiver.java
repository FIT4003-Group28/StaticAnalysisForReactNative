package com.google.android.apps.gmm.notification.feedback;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationInlineFeedbackBroadcastReceiver extends BroadcastReceiver {
    public gdo a;
    public bvrv b;
    public aunp c;
    public btvo d;

    public static Intent a(Application application, auni auniVar, int i) {
        Intent intent = new Intent(application, NotificationInlineFeedbackBroadcastReceiver.class);
        intent.putExtra("notification_instance_key", auniVar.bS());
        intent.putExtra("notification_inline_rating_value", i - 1);
        intent.setAction("com.google.android.apps.gmm.notification.feedback.PROVIDE_NOTIFICATION_INLINE_FEEDBACK");
        return intent;
    }

    public static dplx b(Application application, auni auniVar, int i) {
        dplu bZ = dplx.g.bZ();
        String flattenToString = new ComponentName(application, NotificationInlineFeedbackBroadcastReceiver.class).flattenToString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dplx dplxVar = (dplx) bZ.b;
        flattenToString.getClass();
        dplxVar.a |= 4;
        dplxVar.d = flattenToString;
        dplv bZ2 = dplw.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dplw dplwVar = (dplw) bZ2.b;
        dplwVar.a |= 1;
        dplwVar.d = "notification_instance_key";
        dspd bR = auniVar.bR();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dplw dplwVar2 = (dplw) bZ2.b;
        bR.getClass();
        dplwVar2.b = 3;
        dplwVar2.c = bR;
        bZ.a(bZ2);
        dplv bZ3 = dplw.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dplw dplwVar3 = (dplw) bZ3.b;
        dplwVar3.a |= 1;
        dplwVar3.d = "notification_inline_rating_value";
        dplwVar3.b = 4;
        dplwVar3.c = Integer.valueOf(i - 1);
        bZ.a(bZ3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dplx dplxVar2 = (dplx) bZ.b;
        dplxVar2.a |= 1;
        dplxVar2.b = "com.google.android.apps.gmm.notification.feedback.PROVIDE_NOTIFICATION_INLINE_FEEDBACK";
        return bZ.bK();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        auni auniVar;
        dxiq.c(this, context);
        this.a.b();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (auniVar = (auni) bvrs.b(extras.getByteArray("notification_instance_key"), (dssr) auni.e.cu(7))) != null) {
                if (!this.c.b(auniVar, 2)) {
                    this.c.a(auniVar, 2, aung.a(extras.getInt("notification_inline_rating_value")));
                }
                dkmn dkmnVar = this.d.getNotificationsParameters().i;
                if (dkmnVar == null) {
                    dkmnVar = dkmn.d;
                }
                if (dkmnVar.c) {
                    context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                Toast.makeText(context, (int) R.string.NOTIFICATION_FEEDBACK_THANKS_TOAST, 1).show();
            }
        } finally {
            this.a.e();
            this.b.a();
        }
    }
}
