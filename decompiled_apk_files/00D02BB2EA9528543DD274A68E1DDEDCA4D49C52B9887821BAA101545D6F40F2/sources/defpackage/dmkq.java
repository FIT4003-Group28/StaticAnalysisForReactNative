package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dmkq  reason: default package */
/* loaded from: classes6.dex */
final class dmkq extends BroadcastReceiver {
    public final dbrn<Long, Boolean> a;
    public final dmjz b;
    public Future<?> c;
    final /* synthetic */ dmks d;
    private final int e;
    private final int f;
    private final List<dmkr> g;
    private final eaow h;
    private int i;
    private int j;
    private long k;

    public dmkq(dmks dmksVar, List<dmkr> list, dbrn<Long, Boolean> dbrnVar, long j, dmkc dmkcVar) {
        eaow eaowVar;
        this.d = dmksVar;
        dmjt dmjtVar = (dmjt) dmkcVar;
        this.e = dmjtVar.a;
        this.f = dmjtVar.b;
        this.a = dbrnVar;
        this.k = j;
        dbsk.a(list.isEmpty());
        this.g = list;
        this.b = dmjtVar.d;
        if (Build.VERSION.SDK_INT >= 28) {
            dqgu dqguVar = dmjtVar.c;
            if (dqguVar.c) {
                eaowVar = eaow.e(dqguVar.b).l(4L);
                this.h = eaowVar;
            }
        }
        eaowVar = eaow.a;
        this.h = eaowVar;
    }

    public final void a() {
        long f = this.d.c.f();
        this.k = f;
        this.d.c(this.a, f);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dbsk.l(Looper.getMainLooper().isCurrentThread());
        if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            List<ScanResult> scanResults = this.d.b.getScanResults();
            if (scanResults == null) {
                scanResults = dcdc.e();
            }
            int i = this.i;
            int size = scanResults.size();
            int i2 = this.e;
            if (i + size > i2) {
                scanResults = scanResults.subList(0, i2 - this.i);
            }
            this.i += scanResults.size();
            dcdc q = dcdc.q(dcft.i(scanResults, dmko.a));
            int i3 = this.j;
            int size2 = q.size();
            int i4 = this.f;
            if (i3 + size2 > i4) {
                q = q.subList(0, i4 - this.j);
            }
            this.j += q.size();
            this.g.add(new dmjv(this.k, q));
            if (this.i == this.e || this.j == this.f) {
                this.a.a(Long.valueOf(this.d.c.f()));
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.h.b) - (this.d.c.f() - this.k);
            if (nanos > 0) {
                this.c = this.d.d.schedule(new Runnable(this) { // from class: dmkp
                    private final dmkq a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, nanos, TimeUnit.NANOSECONDS);
            } else {
                a();
            }
        }
    }
}
