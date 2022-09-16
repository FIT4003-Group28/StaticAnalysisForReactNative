package defpackage;

import android.content.IntentFilter;
import android.util.Log;
/* compiled from: PG */
/* renamed from: abxr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxr implements abtv {
    public final /* synthetic */ abyk a;
    private final /* synthetic */ int b;

    public /* synthetic */ abxr(abyk abykVar) {
        this.a = abykVar;
    }

    public /* synthetic */ abxr(abyk abykVar, int i) {
        this.b = i;
        this.a = abykVar;
    }

    @Override // defpackage.abtv
    public final void a(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            this.a.j.b();
        } else if (i2 == 1) {
            abyk abykVar = this.a;
            if (!abykVar.d.d()) {
                return;
            }
            abykVar.c.A();
        } else if (i2 != 2) {
            abyp abypVar = this.a.j;
            abypVar.k = false;
            abypVar.h();
        } else {
            abyk abykVar2 = this.a;
            if (i != 0) {
                if (i == 2 || i == 7 || i == 8) {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Capture pipeline not configured properly - ");
                    sb.append(i);
                    zep.b(sb.toString());
                    abykVar2.T = false;
                    abykVar2.j.m();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Error starting capture: ");
                sb2.append(i);
                zep.b(sb2.toString());
                abykVar2.h(i);
                return;
            }
            abykVar2.T = false;
            if (!abykVar2.U) {
                return;
            }
            if (!abykVar2.v()) {
                abykVar2.c();
            }
            abyb abybVar = new abyb(abykVar2);
            abvj abvjVar = abykVar2.h;
            abvjVar.A = abybVar;
            abvjVar.e(abykVar2.s);
            abxx abxxVar = new abxx(abykVar2);
            abux abuxVar = abykVar2.b;
            abuxVar.o = abxxVar;
            if (abuxVar.d) {
                Log.w("CaptureRsrcMonitor", "Resource monitor already running.");
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                abuxVar.b.registerReceiver(abuxVar.m, intentFilter);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.SCREEN_ON");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                intentFilter2.addCategory("android.intent.category.DEFAULT");
                abuxVar.b.registerReceiver(abuxVar.n, intentFilter2);
                abxa.b().f(asto.class, abux.class, abuxVar);
                abuxVar.d = true;
            }
            long j = abykVar2.K;
            if (j == 0 || abykVar2.L > 0) {
                j = abykVar2.i.d() - abykVar2.L;
                abykVar2.K = j;
            }
            abykVar2.c.x(j);
            abxa.b().j(astk.class, abyk.a);
        }
    }
}
