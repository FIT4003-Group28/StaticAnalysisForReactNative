package defpackage;
/* compiled from: PG */
/* renamed from: cck  reason: default package */
/* loaded from: classes4.dex */
public class cck<T> implements bxd<T> {
    protected final T a;

    public cck(T t) {
        cjn.b(t);
        this.a = t;
    }

    @Override // defpackage.bxd
    public final Class<T> a() {
        return (Class<T>) this.a.getClass();
    }

    @Override // defpackage.bxd
    public final T b() {
        return this.a;
    }

    @Override // defpackage.bxd
    public final int c() {
        return 1;
    }

    @Override // defpackage.bxd
    public final void d() {
    }
}
