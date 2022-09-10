package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aifu  reason: default package */
/* loaded from: classes2.dex */
public final class aifu implements aify {
    public final akox b;
    public final dxio<vtb> c;
    public final cqat d;
    @dzsi
    public vtw e;
    @dzsi
    public vue f;
    @dzsi
    public aifw g;
    private final bvrb i;
    private long j;
    public final Object a = new Object();
    private final Runnable k = new aifs(this);
    public final vsy h = new aift(this);

    public aifu(akox akoxVar, bvrb bvrbVar, dxio<vtb> dxioVar, cqat cqatVar) {
        this.b = akoxVar;
        this.i = bvrbVar;
        this.c = dxioVar;
        this.d = cqatVar;
        this.j = cqatVar.b();
    }

    private final void f(@dzsi aifw aifwVar) {
        synchronized (this.a) {
            if (dbsd.a(this.g, aifwVar) && this.d.b() - this.j < TimeUnit.MINUTES.toMillis(1L)) {
                return;
            }
            this.j = this.d.b();
            this.g = aifwVar;
            this.i.b(this.k, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.aify
    public final void a() {
        this.c.a().a();
    }

    @Override // defpackage.aify
    public final void b(aifq aifqVar) {
        f((aifw) aifqVar.h(aifw.class));
    }

    @Override // defpackage.aify
    public final void c() {
        f(null);
        this.c.a().b();
    }

    @Override // defpackage.aify
    public final void d(aifq aifqVar) {
        aifw aifwVar = (aifw) aifqVar.h(aifw.class);
        if (aifwVar == null || !aifwVar.b()) {
            return;
        }
        f(aifwVar);
    }

    @Override // defpackage.aify
    public final dcdc<aifn> e(int i) {
        return dcdc.f(new aifr(irf.a));
    }

    public final String toString() {
        String dbsbVar;
        synchronized (this.a) {
            dbsb b = dbsc.b(this);
            b.f("hash", hashCode());
            b.b("route", this.g);
            boolean z = true;
            b.h("directions", this.e != null);
            if (this.f == null) {
                z = false;
            }
            b.h("traffic", z);
            dbsbVar = b.toString();
        }
        return dbsbVar;
    }
}
