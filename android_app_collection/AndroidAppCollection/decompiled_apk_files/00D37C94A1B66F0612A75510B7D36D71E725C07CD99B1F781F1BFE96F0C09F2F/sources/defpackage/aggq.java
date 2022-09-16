package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggq  reason: default package */
/* loaded from: classes.dex */
public final class aggq implements aggo {
    private final snc a;
    private final agvq b;
    private final yjs c;

    static {
        TimeUnit.HOURS.toSeconds(4L);
    }

    public aggq(snc sncVar, yjs yjsVar, agvq agvqVar) {
        sncVar.getClass();
        this.a = sncVar;
        agvqVar.getClass();
        this.b = agvqVar;
        yjsVar.getClass();
        this.c = yjsVar;
    }

    @Override // defpackage.aggo
    public final void a(String str) {
        d();
        this.b.D(str, 0L);
    }

    @Override // defpackage.aggo
    public final void b(String str) {
        long p = this.b.p(str);
        if (p <= 0) {
            return;
        }
        this.c.e("offline_auto_offline", TimeUnit.MILLISECONDS.toSeconds(Math.max(0L, p - this.a.c())), false, 1, aggv.a(str), aggv.b, false);
    }

    @Override // defpackage.aggo
    public final void c(String str, long j, long j2) {
        this.c.e("offline_auto_offline", j, true, 1, aggv.a(str), aggv.b, false);
        this.b.D(str, this.a.c() + TimeUnit.SECONDS.toMillis(j));
        this.b.C(str, j2);
    }

    @Override // defpackage.aggo
    public final void d() {
        this.c.c("offline_auto_offline");
    }
}
