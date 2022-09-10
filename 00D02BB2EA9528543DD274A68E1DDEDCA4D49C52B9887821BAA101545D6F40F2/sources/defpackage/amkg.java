package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amkg  reason: default package */
/* loaded from: classes.dex */
public final class amkg implements bnud {
    public final amjk b;
    public final akzh c;
    public final bnsn d;
    public boolean f;
    public volatile boolean g;
    public volatile boolean l;
    public final ckcw m;
    public final bvnx n;
    public final alol o;
    public final alok p;
    private static final Comparator<amhh> q = new amkd();
    public static final Comparator<amhh> a = new amke();
    private final List<amkf> r = dchl.a();
    private final Set<amhh> s = dcnm.c();
    public final Set<amhh> h = dcnm.k(q);
    public final ArrayList<amhh> i = new ArrayList<>();
    public Set<akti> j = dcnm.c();
    public Set<akti> k = dcnm.c();
    public final amjo e = new amjo();

    public amkg(ckcw ckcwVar, akzh akzhVar, bnsn bnsnVar, alol alolVar, alok alokVar, amjk amjkVar, bvnx bvnxVar) {
        this.c = akzhVar;
        this.d = bnsnVar;
        this.m = ckcwVar;
        this.o = alolVar;
        this.p = alokVar;
        this.b = amjkVar;
        this.n = bvnxVar;
    }

    public static int h(amhh amhhVar, amhh amhhVar2) {
        dmpn a2 = amhhVar.s().a();
        int i = a2.q;
        int i2 = a2.m;
        int i3 = a2.n;
        dmpn a3 = amhhVar2.s().a();
        int i4 = a3.q;
        int i5 = a3.m;
        return dbzx.b.c(i, i4).c(i2, i5).c(i3, a3.n).c(amhhVar.s().f(), amhhVar2.s().f()).i();
    }

    public static int i(amhh amhhVar, amhh amhhVar2) {
        return dbzx.b.c(amhhVar.t(), amhhVar2.t()).c(amhhVar.hashCode(), amhhVar2.hashCode()).i();
    }

    public final synchronized void a() {
        List<amkf> list = this.r;
        long a2 = this.n.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            amkf amkfVar = list.get(i);
            amhh amhhVar = amkfVar.c;
            amhh amhhVar2 = amkfVar.b;
            int i2 = amkfVar.a;
            if (i2 == 1) {
                if (!this.h.contains(amhhVar2)) {
                    amhhVar2.w(8);
                    this.h.add(amhhVar2);
                }
                amhhVar2.B(a2, 2);
            } else if (i2 != 2) {
                if (amhhVar != null && this.h.contains(amhhVar)) {
                    this.h.remove(amhhVar);
                    amhhVar.x(8);
                }
                if (!this.h.contains(amhhVar2)) {
                    amhhVar2.w(8);
                    this.h.add(amhhVar2);
                }
                amhhVar2.B(a2, 4);
            } else if (this.h.contains(amhhVar2)) {
                amhhVar2.B(a2, 3);
            }
        }
        for (amhh amhhVar3 : this.s) {
            amhhVar3.x(16);
        }
        this.s.clear();
        list.clear();
    }

    public final synchronized void b(amhh amhhVar) {
        if (!this.s.contains(amhhVar)) {
            amhhVar.w(16);
            this.s.add(amhhVar);
        }
        this.r.add(new amkf(1, amhhVar));
    }

    public final synchronized void c(amhh amhhVar, amhh amhhVar2) {
        if (!this.s.contains(amhhVar)) {
            amhhVar.w(16);
            this.s.add(amhhVar);
        }
        if (!this.s.contains(amhhVar2)) {
            amhhVar2.w(16);
            this.s.add(amhhVar2);
        }
        this.r.add(new amkf(amhhVar2, amhhVar));
    }

    public final synchronized void d(amhh amhhVar) {
        if (!this.s.contains(amhhVar)) {
            amhhVar.w(16);
            this.s.add(amhhVar);
        }
        this.r.add(new amkf(2, amhhVar));
    }

    public final void e() {
        this.d.q();
    }

    public final synchronized void f() {
        for (amhh amhhVar : this.s) {
            amhhVar.x(16);
        }
        for (amhh amhhVar2 : this.h) {
            amhhVar2.x(8);
        }
        this.r.clear();
        this.s.clear();
        this.h.clear();
        this.b.e();
        this.f = true;
    }

    public final synchronized boolean g() {
        return this.f;
    }
}
