package com.google.android.apps.gmm.notification.log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationBlockStateReceiver extends BroadcastReceiver {
    public cjqy a;
    public ckcw b;
    public gdo c;
    public bvrv d;
    public btrm e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ddda dddaVar;
        ddda dddaVar2;
        ddda dddaVar3;
        dxiq.c(this, context);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        this.c.b();
        this.b.f(ckhc.NOTIFICATION_LOGGING_SERVICE);
        String action = intent.getAction();
        if ("android.app.action.APP_BLOCK_STATE_CHANGED".equals(action)) {
            if (intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false)) {
                dddaVar3 = ddda.ef;
            } else {
                dddaVar3 = ddda.eg;
            }
            cjqy cjqyVar = this.a;
            cjsx i = cjsy.i();
            i.b(dddaVar3);
            cjqyVar.k(i.a());
        } else if ("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
            if (stringExtra != null) {
                if (booleanExtra) {
                    dddaVar2 = ddda.ei;
                } else {
                    dddaVar2 = ddda.ej;
                }
                aufo aufoVar = aufo.UNKNOWN_NOTIFICATION_CHANNEL_GROUP_ID;
                auin[] values = auin.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    auin auinVar = values[i2];
                    if (stringExtra.equals(auinVar.h)) {
                        aufoVar = auinVar.l;
                        break;
                    }
                    i2++;
                }
                cjqy cjqyVar2 = this.a;
                cjsx i3 = cjsy.i();
                i3.b(dddaVar2);
                ddov bZ = ddow.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddow ddowVar = (ddow) bZ.b;
                ddowVar.b = Integer.valueOf(aufoVar.p);
                ddowVar.a = 2;
                ((cjrt) i3).a = bZ.bK();
                cjqyVar2.k(i3.a());
            }
        } else if ("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(action)) {
            boolean booleanExtra2 = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            String stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            if (stringExtra2 != null) {
                if (booleanExtra2) {
                    dddaVar = ddda.eh;
                } else {
                    dddaVar = ddda.ek;
                }
                cjqy cjqyVar3 = this.a;
                cjsx i4 = cjsy.i();
                i4.b(dddaVar);
                ddov bZ2 = ddow.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddow ddowVar2 = (ddow) bZ2.b;
                stringExtra2.getClass();
                ddowVar2.a = 3;
                ddowVar2.b = stringExtra2;
                ((cjrt) i4).a = bZ2.bK();
                cjqyVar3.k(i4.a());
            }
        }
        this.e.b(new btas());
        this.b.g(ckhc.NOTIFICATION_LOGGING_SERVICE);
        this.c.e();
        this.d.a();
    }
}
