package defpackage;
/* compiled from: PG */
/* renamed from: cfw  reason: default package */
/* loaded from: classes.dex */
final class cfw<Z, R> {
    final cfv<Z, R> a;
    private final Class<Z> b;
    private final Class<R> c;

    public cfw(Class<Z> cls, Class<R> cls2, cfv<Z, R> cfvVar) {
        this.b = cls;
        this.c = cls2;
        this.a = cfvVar;
    }

    public final boolean a(Class<?> cls, Class<?> cls2) {
        return this.b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
    }
}
