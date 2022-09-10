package defpackage;

import defpackage.amhk;
/* compiled from: PG */
/* renamed from: amhj  reason: default package */
/* loaded from: classes.dex */
public abstract class amhj<T extends amhk> {
    private final btnh<amhk> a;

    public amhj(btmv btmvVar, btng btngVar) {
        this.a = new amhi(this, btmvVar, btngVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        T t = (T) this.a.d();
        t.q = this.a;
        return t;
    }
}
