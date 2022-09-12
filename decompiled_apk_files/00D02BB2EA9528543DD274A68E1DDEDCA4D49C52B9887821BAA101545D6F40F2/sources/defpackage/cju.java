package defpackage;
/* compiled from: PG */
/* renamed from: cju  reason: default package */
/* loaded from: classes.dex */
final class cju<T> implements my<T> {
    private final cjt<T> a;
    private final cjw<T> b;
    private final my<T> c;

    public cju(my<T> myVar, cjt<T> cjtVar, cjw<T> cjwVar) {
        this.c = myVar;
        this.a = cjtVar;
        this.b = cjwVar;
    }

    @Override // defpackage.my
    public final T a() {
        T a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof cjv) {
            ((cjv) a).Nk().b(false);
        }
        return a;
    }

    @Override // defpackage.my
    public final boolean b(T t) {
        if (t instanceof cjv) {
            ((cjv) t).Nk().b(true);
        }
        this.b.a(t);
        return this.c.b(t);
    }
}
