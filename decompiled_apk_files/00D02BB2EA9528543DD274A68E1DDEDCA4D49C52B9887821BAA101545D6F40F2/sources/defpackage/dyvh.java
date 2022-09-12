package defpackage;
/* compiled from: PG */
/* renamed from: dyvh  reason: default package */
/* loaded from: classes6.dex */
public final class dyvh<T> implements dysx<T> {
    private final dyvf<T> a;

    private dyvh(dyvf<T> dyvfVar) {
        this.a = dyvfVar;
    }

    public static <T> dyvh<T> c(dyvf<T> dyvfVar) {
        return new dyvh<>(dyvfVar);
    }

    @Override // defpackage.dysx
    public final T a() {
        return (T) dyvg.a(this.a);
    }

    @Override // defpackage.dysx
    public final T b(Object obj) {
        dyvg.e(this.a, obj);
        return null;
    }
}
