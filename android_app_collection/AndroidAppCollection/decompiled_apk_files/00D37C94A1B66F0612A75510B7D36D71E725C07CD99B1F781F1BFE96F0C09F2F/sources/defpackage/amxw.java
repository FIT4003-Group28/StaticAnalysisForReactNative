package defpackage;
/* compiled from: PG */
/* renamed from: amxw  reason: default package */
/* loaded from: classes.dex */
public final class amxw extends amty {
    static final amxw b = new amxw();
    final transient Object[] c;
    public final transient int d;
    public final transient amxw e;
    private final transient Object f;
    private final transient int g;

    private amxw() {
        this.f = null;
        this.c = new Object[0];
        this.g = 0;
        this.d = 0;
        this.e = this;
    }

    private amxw(Object obj, Object[] objArr, int i, amxw amxwVar) {
        this.f = obj;
        this.c = objArr;
        this.g = 1;
        this.d = i;
        this.e = amxwVar;
    }

    public amxw(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
        this.g = 0;
        int f = i >= 2 ? amvn.f(i) : 0;
        this.f = amyc.r(objArr, i, f, 0);
        this.e = new amxw(amyc.r(objArr, i, f, 1), objArr, i, this);
    }

    @Override // defpackage.amty
    public final amty c() {
        return this.e;
    }

    @Override // defpackage.amup
    public final amvn g() {
        return new amya(this, new amyb(this.c, this.g, this.d));
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object s = amyc.s(this.f, this.c, this.d, this.g, obj);
        if (s == null) {
            return null;
        }
        return s;
    }

    @Override // defpackage.amup
    public final amvn sd() {
        return new amxz(this, this.c, this.g, this.d);
    }

    @Override // defpackage.amup
    public final void sf() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
