package defpackage;
/* compiled from: PG */
/* renamed from: cdkb  reason: default package */
/* loaded from: classes4.dex */
public final class cdkb<T> extends x<T> {
    public T g;
    public final z<Boolean> h;
    public final v<Boolean> i;
    public final z<T> j;
    private final dzvi<T, T, Boolean> k;

    public cdkb(z<T> zVar, v<T> vVar) {
        this(zVar, vVar, cdjy.a);
    }

    @Override // defpackage.z, defpackage.v
    public final void g(T t) {
        super.g(t);
        this.j.g(h());
        this.h.g(Boolean.valueOf(o(h(), this.g)));
    }

    public final boolean o(T t, T t2) {
        return (t == null || t2 == null || !this.k.a(t, t2).booleanValue()) ? false : true;
    }

    public final void p(T t) {
        this.g = t;
        this.j.g(t);
        this.h.g(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cdkb(z<T> zVar, v<T> vVar, dzvi<? super T, ? super T, Boolean> dzviVar) {
        dzvx.c(dzviVar, "saveCheck");
        this.j = zVar;
        this.k = dzviVar;
        z<Boolean> zVar2 = new z<>();
        this.h = zVar2;
        this.i = zVar2;
        m(vVar, new cdjz(this));
        m(zVar, new cdka(this));
    }
}
