package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agbr  reason: default package */
/* loaded from: classes.dex */
public class agbr implements afzu {
    private final dxio<bvjj> a;
    private final dxio<afzs> b;
    private final dxio<agwp> c;
    private final List<afzt> d = new CopyOnWriteArrayList();
    private final Map<btlu, Long> e = new HashMap();
    private final Map<btlu, Boolean> f = new HashMap();

    public agbr(dxio<bvjj> dxioVar, dxio<afzs> dxioVar2, dxio<agwp> dxioVar3) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
    }

    private final long m(btlu btluVar) {
        if (!btluVar.l() || !this.e.containsKey(btluVar)) {
            return 0L;
        }
        return this.e.get(btluVar).longValue();
    }

    private final boolean n(btlu btluVar) {
        if (!btluVar.l() || !this.f.containsKey(btluVar)) {
            return false;
        }
        return this.f.get(btluVar).booleanValue();
    }

    @Override // defpackage.afzu
    public final long a(btlu btluVar) {
        return this.a.a().x(bvjk.aG, btluVar, 0L);
    }

    @Override // defpackage.afzu
    public final boolean b(@dzsi btlu btluVar) {
        boolean n;
        boolean z = false;
        if (this.b.a().b() && btlu.q(btluVar).l()) {
            if (this.b.a().f()) {
                synchronized (this) {
                    dbsk.s(btluVar);
                    n = n(btluVar);
                }
                return n;
            }
            long micros = TimeUnit.DAYS.toMicros(this.b.a().a.a().g());
            if (micros < 0) {
                micros = 0;
            }
            synchronized (this) {
                if (this.b.a().a.a().h()) {
                    dbsk.s(btluVar);
                    dbsk.s(btluVar);
                    if (a(btluVar) + micros < m(btluVar)) {
                        z = true;
                    }
                    return z;
                }
                dbsk.s(btluVar);
                dbsk.s(btluVar);
                if (a(btluVar) + micros < f(btluVar)) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // defpackage.afzu
    public final boolean c(@dzsi btlu btluVar) {
        return this.c.a().a(btluVar);
    }

    @Override // defpackage.afzu
    public final void d(afzt afztVar) {
        this.d.add(afztVar);
        afztVar.a(this);
    }

    @Override // defpackage.afzu
    public final void e(afzt afztVar) {
        this.d.remove(afztVar);
    }

    public final long f(btlu btluVar) {
        return this.a.a().x(bvjk.aH, btluVar, 0L);
    }

    public final synchronized void g(btlu btluVar) {
        this.a.a().aa(bvjk.aG, btluVar, -1L);
        this.a.a().aa(bvjk.aH, btluVar, 0L);
    }

    public final synchronized void h(btlu btluVar, long j) {
        if (j > a(btluVar)) {
            this.a.a().aa(bvjk.aG, btluVar, j);
            i(btluVar, j);
            l();
        }
    }

    public final synchronized boolean i(btlu btluVar, long j) {
        boolean z;
        bvjj a = this.a.a();
        if (j > f(btluVar)) {
            a.aa(bvjk.aH, btluVar, j);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void j(btlu btluVar, long j) {
        if (!btluVar.l() || j <= m(btluVar)) {
            return;
        }
        this.e.put(btluVar, Long.valueOf(j));
        l();
    }

    public final synchronized void k(@dzsi btlu btluVar, boolean z) {
        btlu q = btlu.q(btluVar);
        if (!q.l()) {
            return;
        }
        if (n(q) == z) {
            return;
        }
        this.f.put(q, Boolean.valueOf(z));
        l();
    }

    public final void l() {
        for (afzt afztVar : this.d) {
            afztVar.a(this);
        }
    }
}
