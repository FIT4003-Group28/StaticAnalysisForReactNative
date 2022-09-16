package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abvx  reason: default package */
/* loaded from: classes.dex */
public final class abvx implements abto {
    private final ScheduledExecutorService A;
    private ScheduledFuture B;
    public final acbo b;
    public final acbw c;
    public final int d;
    public final int e;
    public final Handler f;
    public final accd g;
    public final snc h;
    public int j;
    public int l;
    public int m;
    public int n;
    public long x;
    public abug y;
    private final acca z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ArrayDeque i = new ArrayDeque();
    public int k = Integer.MAX_VALUE;
    public int o = -1;
    public long p = -1;
    public long q = -1;
    public int r = -1;
    public int s = -1;
    public long t = -1;
    public long u = -1;
    public long v = -1;
    public long w = -1;

    public abvx(int i, int i2, int i3, acbo acboVar, acbt acbtVar, acbw acbwVar, ScheduledExecutorService scheduledExecutorService, Handler handler, snc sncVar) {
        this.d = i;
        this.l = i2;
        this.e = i3;
        acboVar.getClass();
        this.b = acboVar;
        acbtVar.getClass();
        acbwVar.getClass();
        this.c = acbwVar;
        handler.getClass();
        this.f = handler;
        sncVar.getClass();
        this.h = sncVar;
        scheduledExecutorService.getClass();
        this.A = scheduledExecutorService;
        boolean z = true;
        aqxo.p(i <= i2 && i2 <= i3);
        aqxo.p(i2 <= 0 ? false : z);
        this.j = i2;
        this.g = new accd(null);
        this.z = new acca(3);
        if (acboVar.b() != i2) {
            acboVar.a(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int f(int i, int i2, int i3) {
        if (i >= 4000) {
            double d = i;
            Double.isNaN(d);
            double d2 = i2;
            Double.isNaN(d2);
            return (int) ((4000.0d / d) * d2);
        }
        double d3 = 4000 - i;
        Double.isNaN(d3);
        double d4 = i3 + 144000;
        Double.isNaN(d4);
        return ((int) (((d3 / 1000.0d) * d4) / 8.0d)) + i2;
    }

    @Override // defpackage.abto
    public final long a() {
        return 0L;
    }

    @Override // defpackage.abto
    public final void b(abug abugVar) {
        this.y = abugVar;
    }

    @Override // defpackage.abto
    public final void c(final int i, final abxd abxdVar) {
        aqxo.y(i > 0);
        this.f.post(new Runnable() { // from class: abvt
            @Override // java.lang.Runnable
            public final void run() {
                abvx abvxVar = abvx.this;
                int i2 = i;
                abxd abxdVar2 = abxdVar;
                abvxVar.b.a(i2);
                abvxVar.a.post(new abvm(abxdVar2, 2));
            }
        });
        this.l = i;
    }

    @Override // defpackage.abto
    public final void e(int i) {
        this.s = i;
    }

    @Override // defpackage.abto
    public final void d(boolean z) {
        if (!z) {
            if (this.B == null) {
                return;
            }
            abxa.b().f(astk.class, abto.class, null);
            this.B.cancel(true);
            this.B = null;
        } else if (this.B != null) {
        } else {
            this.k = f(0, 0, this.j);
            this.f.post(new Runnable() { // from class: abvs
                @Override // java.lang.Runnable
                public final void run() {
                    abvx abvxVar = abvx.this;
                    abvxVar.c.i(abvxVar.k);
                }
            });
            this.g.b();
            this.z.c();
            this.w = this.h.d();
            this.r = -1;
            this.o = -1;
            this.B = this.A.scheduleWithFixedDelay(new abvv(this), 200L, 200L, TimeUnit.MILLISECONDS);
            abxa.b().f(astk.class, abto.class, new abvw(this));
        }
    }
}
