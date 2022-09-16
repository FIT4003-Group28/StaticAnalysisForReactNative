package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggs  reason: default package */
/* loaded from: classes.dex */
public final class aggs implements aguv {
    public static final long a = TimeUnit.MINUTES.toSeconds(5);
    public static final long b = TimeUnit.HOURS.toSeconds(4);
    public final azqb c;
    public final azqb d;
    private final ScheduledExecutorService e;
    private final agvq f;
    private final yni g;
    private final yjs h;

    public aggs(azqb azqbVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar2, yjs yjsVar, agvq agvqVar, yni yniVar) {
        this.c = azqbVar;
        this.e = scheduledExecutorService;
        this.d = azqbVar2;
        this.f = agvqVar;
        this.h = yjsVar;
        this.g = yniVar;
    }

    private final void i(String str, long j, boolean z) {
        long j2 = j + j;
        yjs yjsVar = this.h;
        long j3 = b;
        yjsVar.d("offline_r_charging", j2 + j3, j + j3, z, 1, true, aggv.a(str), aggv.b);
        this.h.d("offline_r", j2 + j3, j3, z, 1, false, aggv.a(str), aggv.b);
    }

    @Override // defpackage.aguv
    public final void a(String str) {
        g();
        this.f.G(str, 0L);
    }

    @Override // defpackage.aguv
    public final void b(String str) {
        long r = this.f.r(str);
        if (r > 0) {
            i(str, r, false);
        }
    }

    @Override // defpackage.aguv
    public final void c(String str) {
        this.h.c("offline_r_charging");
        this.h.e("offline_r", a, true, 1, aggv.a(str), aggv.b, false);
        this.e.execute(new aggr(this, str, 1));
        this.g.d(new agok());
    }

    @Override // defpackage.aguv
    public final void d(String str) {
        this.h.e("offline_r_inc", a, true, 1, aggv.a(str), aggv.b, false);
        this.e.execute(new aggr(this, str));
    }

    @Override // defpackage.aguv
    public final void e(String str, long j) {
        this.h.e("offline_r_inc", j, true, 1, aggv.a(str), aggv.b, false);
    }

    @Override // defpackage.aguv
    public final void f(String str, long j) {
        if (j > 0) {
            i(str, j, true);
            this.f.G(str, j);
        }
    }

    @Override // defpackage.aguv
    public final void g() {
        this.h.c("offline_r");
        this.h.c("offline_r_charging");
        this.h.c("offline_r_inc");
    }

    @Override // defpackage.aguv
    public final void h() {
        this.h.c("offline_r_inc");
    }
}
