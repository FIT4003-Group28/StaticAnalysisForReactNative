package com.google.android.apps.gmm.notification.optout;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NotificationOptOutBroadcastReceiver extends BroadcastReceiver {
    public gdo a;
    public bvrv b;
    public Application c;
    public auhi d;
    public auhj e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        aujb g;
        auix b;
        dxiq.c(this, context);
        this.a.b();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (i = extras.getInt("notification_type_id", 0)) != 0 && (g = this.d.g(i)) != null && (b = g.b()) != null) {
                this.d.e(g.a, aufs.DISABLED);
                aujb h = this.d.h(dpyv.NOTIFICATION_OPT_OUT_CONFIRMATION.dm);
                if (h != null) {
                    augc b2 = this.e.b(dpyv.NOTIFICATION_OPT_OUT_CONFIRMATION.dm, h);
                    b2.f = this.c.getString(b.b);
                    b2.g = this.c.getString(R.string.NOTIFICATION_OPT_OUT_ACTIONABLE_TOAST_DESCRIPTION);
                    b2.w(2131232784);
                    Intent a = auhz.a(autv.c(this.c, i), new ArrayList());
                    b2.E(a, auhw.ACTIVITY);
                    auod k = auoe.k(ddcu.az);
                    ((auoa) k).e = 1;
                    k.g(this.c.getString(R.string.SETTINGS));
                    k.c(2131232820);
                    k.j(a, auhw.ACTIVITY);
                    k.f(true);
                    b2.B(k.h());
                    this.d.j(b2.a());
                }
            }
        } finally {
            this.a.e();
            this.b.a();
        }
    }
}
