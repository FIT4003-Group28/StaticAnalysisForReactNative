package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: bzgb  reason: default package */
/* loaded from: classes4.dex */
public final class bzgb {
    public final PowerManager a;
    private final bzfz d;
    public volatile int c = 1;
    final BroadcastReceiver b = new bzfy(this);

    public bzgb(Context context, bzfz bzfzVar) {
        this.a = (PowerManager) context.getSystemService("power");
        this.d = new bzga(this, context, bzfzVar);
    }

    public final synchronized void a(int i) {
        int i2 = this.c;
        this.c = i;
        bzfz bzfzVar = this.d;
        int i3 = this.c;
        if (i3 == 1) {
            if (i2 != 1) {
                ((bzga) bzfzVar).a.unregisterReceiver(((bzga) bzfzVar).c.b);
            }
        } else if (i2 == 1) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            ((bzga) bzfzVar).a.registerReceiver(((bzga) bzfzVar).c.b, intentFilter);
            i2 = 1;
        }
        final bzaf bzafVar = ((bzab) ((bzga) bzfzVar).b).a;
        if (!bzafVar.h && i3 == 2 && i2 == 3) {
            bzafVar.c.execute(new Runnable(bzafVar) { // from class: bzac
                private final bzaf a;

                {
                    this.a = bzafVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            });
        }
    }
}
