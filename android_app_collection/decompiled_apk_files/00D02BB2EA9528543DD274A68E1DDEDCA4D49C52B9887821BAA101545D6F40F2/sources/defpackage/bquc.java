package defpackage;
/* compiled from: PG */
/* renamed from: bquc  reason: default package */
/* loaded from: classes4.dex */
abstract class bquc<T> implements cqkp {
    private final T a;
    private T b;
    private long c = -1;
    private dbsg<T> d = dbpy.a;
    private dbsg<T> e = dbpy.a;

    public bquc(T t) {
        this.a = t;
        this.b = t;
    }

    protected abstract dbsg<T> h(docg docgVar);

    public void j(ilo iloVar) {
        long j = iloVar.ai().c;
        if (j == this.c) {
            return;
        }
        this.c = j;
        boolean n = n();
        this.e = h(iloVar.bq());
        dbsg<T> h = h(iloVar.bs());
        this.d = h;
        T c = h.d(this.e).c(this.a);
        if (n) {
            c = c.equals(this.a) ? k() : l(c);
        }
        o(c);
    }

    public final T k() {
        return this.b;
    }

    protected T l(T t) {
        return t;
    }

    public final boolean m() {
        return !this.e.c(this.a).equals(this.b);
    }

    public final boolean n() {
        return !this.b.equals(this.a) && !this.d.d(this.e).c(this.a).equals(this.b);
    }

    public final void o(T t) {
        if (this.b.equals(t)) {
            return;
        }
        this.b = t;
    }
}
