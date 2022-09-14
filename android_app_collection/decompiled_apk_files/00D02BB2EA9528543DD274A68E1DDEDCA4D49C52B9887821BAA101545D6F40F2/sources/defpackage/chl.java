package defpackage;
/* compiled from: PG */
/* renamed from: chl  reason: default package */
/* loaded from: classes.dex */
final class chl<T, R> {
    final Class<R> a;
    final buc<T, R> b;
    private final Class<T> c;

    public chl(Class<T> cls, Class<R> cls2, buc<T, R> bucVar) {
        this.c = cls;
        this.a = cls2;
        this.b = bucVar;
    }

    public final boolean a(Class<?> cls, Class<?> cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
