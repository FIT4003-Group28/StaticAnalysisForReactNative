package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ckcf  reason: default package */
/* loaded from: classes.dex */
public final class ckcf implements ckcy {
    private static final dcqe b = dcqe.c("ckcf");
    private static final long j = TimeUnit.SECONDS.toMillis(20);
    private static final long k = TimeUnit.SECONDS.toMillis(2);
    public boolean a;
    private final ckcw c;
    private final cqat d;
    private boolean g;
    private boolean h = false;
    @dzsi
    private Long i = null;
    private final Map<ddda, Long> e = dcjz.d();
    private final Set<ckha> f = new HashSet();

    public ckcf(ckcw ckcwVar, cqat cqatVar) {
        this.c = ckcwVar;
        this.d = cqatVar;
    }

    @dzsi
    private final synchronized Long l() {
        if (this.i != null) {
            long e = this.d.e();
            Long l = this.i;
            dbsk.s(l);
            return Long.valueOf(e - l.longValue());
        }
        return null;
    }

    private static void m(Long l, Long l2, ckcd ckcdVar, List<Pair<ckcd, Long>> list) {
        list.add(new Pair<>(ckcdVar, Long.valueOf(l2.longValue() - l.longValue())));
    }

    private final synchronized boolean n() {
        boolean z;
        if (this.e.containsKey(ddda.D) && this.e.containsKey(ddda.r)) {
            if (this.e.get(ddda.r).longValue() - this.e.get(ddda.D).longValue() > k) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // defpackage.ckcy
    public final synchronized void a(ckha ckhaVar) {
        this.f.add(ckhaVar);
    }

    @Override // defpackage.ckcy
    public final synchronized void b(ckha ckhaVar) {
        this.f.remove(ckhaVar);
    }

    @Override // defpackage.ckcy
    public final synchronized void c(ckha ckhaVar) {
        if (!this.f.contains(ckhaVar)) {
            return;
        }
        Long l = l();
        if (l == null) {
            return;
        }
        this.c.t(ckhaVar, l.longValue());
        b(ckhaVar);
    }

    @Override // defpackage.ckcy
    public final synchronized void d(long j2) {
        if (!this.e.containsKey(ddda.C)) {
            return;
        }
        long longValue = this.e.get(ddda.C).longValue() - j2;
        if (longValue >= j) {
            return;
        }
        this.c.t(ckcd.APPLICATION_CREATE_PROCESS.h, longValue);
    }

    @Override // defpackage.ckcy
    public final synchronized void e(ddda dddaVar) {
        if (this.h) {
            return;
        }
        Long valueOf = Long.valueOf(this.d.e());
        this.e.put(dddaVar, valueOf);
        if (dddaVar == ddda.r) {
            this.i = valueOf;
        } else if (dddaVar != ddda.y) {
        } else {
            this.h = true;
        }
    }

    public final synchronized void f() {
        this.e.clear();
    }

    @Override // defpackage.ckcy
    public final synchronized void g(boolean z, boolean z2) {
        this.g = z;
        this.a = z2;
    }

    final synchronized List<Pair<ckcd, Long>> h() {
        ArrayList a;
        a = dchl.a();
        if (this.e.containsKey(ddda.C) && this.e.containsKey(ddda.D)) {
            m(this.e.get(ddda.C), this.e.get(ddda.D), ckcd.APPLICATION_ON_CREATE, a);
        }
        if (this.e.containsKey(ddda.r) && this.e.containsKey(ddda.s)) {
            m(this.e.get(ddda.r), this.e.get(ddda.s), ckcd.ACTIVITY_ON_CREATE, a);
        }
        if (this.e.containsKey(ddda.t) && this.e.containsKey(ddda.u)) {
            m(this.e.get(ddda.t), this.e.get(ddda.u), ckcd.ACTIVITY_ON_NEW_INTENT, a);
        }
        if (this.e.containsKey(ddda.z) && this.e.containsKey(ddda.A)) {
            m(this.e.get(ddda.z), this.e.get(ddda.A), ckcd.ACTIVITY_ON_START, a);
        }
        if (this.e.containsKey(ddda.v) && this.e.containsKey(ddda.w)) {
            m(this.e.get(ddda.v), this.e.get(ddda.w), ckcd.ACTIVITY_ON_RESTART, a);
        }
        if (this.e.containsKey(ddda.x) && this.e.containsKey(ddda.y)) {
            m(this.e.get(ddda.x), this.e.get(ddda.y), ckcd.ACTIVITY_ON_RESUME, a);
        }
        return a;
    }

    @dzsi
    final synchronized Pair<ckce, Long> i() {
        ckce ckceVar;
        Long l;
        if (!this.g) {
            return null;
        }
        if (!this.e.containsKey(ddda.C) || n()) {
            if (this.e.containsKey(ddda.r)) {
                if (this.a) {
                    ckceVar = ckce.CLEAN_CREATE_ACTIVITY;
                } else {
                    ckceVar = ckce.RESTORED_CREATE_ACTIVITY;
                }
                l = this.e.get(ddda.r);
            } else if (this.e.containsKey(ddda.t)) {
                ckceVar = this.a ? null : ckce.RESUMED_ACTIVITY;
                l = this.e.get(ddda.t);
            } else if (this.e.containsKey(ddda.v)) {
                if (this.a) {
                    bvoo.h("Resumed Activity From History List startup flow but isFreshStart is true.", new Object[0]);
                    ckceVar = null;
                } else {
                    ckceVar = ckce.RESUMED_ACTIVITY_FROM_HISTORY_LIST;
                }
                l = this.e.get(ddda.v);
            } else {
                ckceVar = null;
                l = null;
            }
        } else {
            if (this.a) {
                ckceVar = ckce.CLEAN_CREATE_APPLICATION;
            } else {
                ckceVar = ckce.RESTORED_CREATE_APPLICATION;
            }
            l = this.e.get(ddda.C);
        }
        if (ckceVar != null && l != null && this.e.containsKey(ddda.y)) {
            return new Pair<>(ckceVar, Long.valueOf(this.e.get(ddda.y).longValue() - l.longValue()));
        }
        return null;
    }

    @Override // defpackage.ckcy
    public final void j() {
        for (Pair<ckcd, Long> pair : h()) {
            Object obj = pair.first;
            Object obj2 = pair.second;
            this.c.t(((ckcd) pair.first).h, ((Long) pair.second).longValue());
        }
        Pair<ckce, Long> i = i();
        if (i != null) {
            Object obj3 = i.first;
            Object obj4 = i.second;
            this.c.t(((ckce) i.first).g, ((Long) i.second).longValue());
        }
        f();
    }

    @Override // defpackage.ckcy
    public final void k() {
        this.c.b(ckgx.COLD_START, new ckcc(this));
    }
}
