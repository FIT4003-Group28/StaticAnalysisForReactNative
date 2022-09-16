package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: anc  reason: default package */
/* loaded from: classes.dex */
public abstract class anc implements amn {
    public static final anb a = new amt();
    public static final anb b = new amu();
    public static final anb c = new amv();
    public static final anb d = new amw();
    public static final anb e = new amx();
    public static final anb f = new amr();
    public float g;
    float h;
    boolean i;
    final Object j;
    final and k;
    public boolean l;
    public final float m;
    private long n;
    private final ArrayList o;
    private final ArrayList p;
    private amq q;

    public anc(ane aneVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = null;
        this.k = new ams(aneVar);
        this.m = 1.0f;
    }

    private static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.amn
    public final void a(long j) {
        long j2 = this.n;
        if (j2 == 0) {
            this.n = j;
            d(this.h);
            return;
        }
        this.n = j;
        boolean e2 = e(j - j2);
        float min = Math.min(this.h, Float.MAX_VALUE);
        this.h = min;
        float max = Math.max(min, -3.4028235E38f);
        this.h = max;
        d(max);
        if (!e2) {
            return;
        }
        c(false);
    }

    public final amq b() {
        if (this.q == null) {
            if (amq.a.get() == null) {
                amq.a.set(new amq(new amp()));
            }
            this.q = (amq) amq.a.get();
        }
        return this.q;
    }

    public final void c(boolean z) {
        this.l = false;
        amq b2 = b();
        b2.b.remove(this);
        int indexOf = b2.c.indexOf(this);
        if (indexOf >= 0) {
            b2.c.set(indexOf, null);
            b2.g = true;
        }
        this.n = 0L;
        this.i = false;
        for (int i = 0; i < this.o.size(); i++) {
            if (this.o.get(i) != null) {
                ((amz) this.o.get(i)).a(z);
            }
        }
        i(this.o);
    }

    final void d(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.p.size(); i++) {
            if (this.p.get(i) != null) {
                ((ana) this.p.get(i)).a(this.h);
            }
        }
        i(this.p);
    }

    public abstract boolean e(long j);

    public final void f(amz amzVar) {
        if (!this.o.contains(amzVar)) {
            this.o.add(amzVar);
        }
    }

    public final void g(ana anaVar) {
        if (this.l) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (this.p.contains(anaVar)) {
            return;
        }
        this.p.add(anaVar);
    }

    public final void h(float f2) {
        this.h = f2;
        this.i = true;
    }

    public anc(Object obj, and andVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = obj;
        this.k = andVar;
        this.m = (andVar == c || andVar == d || andVar == e) ? 0.1f : andVar == f ? 0.00390625f : (andVar == a || andVar == b) ? 0.002f : 1.0f;
    }
}
