package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzfw  reason: default package */
/* loaded from: classes4.dex */
public final class bzfw extends bzfs<cray> {
    @dzsi
    public final btrm c;
    @dzsi
    public final ahjq d;
    @dzsi
    public final byzk e;
    public final bzfo f;
    public final cqzw g;
    public final btvo h;
    public boolean i;
    protected final bzfv j;
    public final bzfu k;
    public final craw l;
    private final bzgj m;

    public bzfw(btrm btrmVar, ahjq ahjqVar, bzfo bzfoVar, cqzw cqzwVar, bvrb bvrbVar, btvo btvoVar, byzk byzkVar, bzfu bzfuVar, craw crawVar) {
        bzge bzgeVar;
        bzgj bzgjVar = new bzgj();
        this.m = bzgjVar;
        this.i = false;
        this.c = btrmVar;
        this.d = ahjqVar;
        this.f = bzfoVar;
        this.g = cqzwVar;
        this.h = btvoVar;
        this.e = byzkVar;
        this.k = bzfuVar;
        this.l = crawVar;
        this.j = new bzfv(this);
        bzgf bzgfVar = new bzgf(this) { // from class: bzft
            private final bzfw a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                bzfw bzfwVar = this.a;
                boolean z = bzfwVar.a.size() != 0;
                if (z == bzfwVar.i) {
                    return;
                }
                bzfwVar.i = z;
                if (z) {
                    bzfwVar.d.k();
                    btrm btrmVar2 = bzfwVar.c;
                    bzfv bzfvVar = bzfwVar.j;
                    dceq a = dcet.a();
                    a.b(amqo.class, new bzfx(amqo.class, bzfvVar, bvrj.NAVIGATION_INTERNAL));
                    btrmVar2.g(bzfvVar, a.a());
                    return;
                }
                bvrj.a();
                bzfwVar.c.a(bzfwVar.j);
                bzfwVar.d.l();
            }
        };
        Executor g = bvrbVar.g(bvrj.NAVIGATION_INTERNAL);
        synchronized (this) {
            if (this.b == null) {
                this.b = new bzge();
            }
            bzgeVar = this.b;
        }
        bzgeVar.b(bzgfVar, bzgjVar, g);
    }
}
