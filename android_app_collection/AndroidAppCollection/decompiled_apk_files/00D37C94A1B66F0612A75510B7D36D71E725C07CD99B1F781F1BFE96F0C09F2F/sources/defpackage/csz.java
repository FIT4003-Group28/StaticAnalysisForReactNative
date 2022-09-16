package defpackage;
/* compiled from: PG */
/* renamed from: csz  reason: default package */
/* loaded from: classes3.dex */
final class csz {
    final Class a;
    final cie b;
    private final Class c;

    public csz(Class cls, Class cls2, cie cieVar) {
        this.c = cls;
        this.a = cls2;
        this.b = cieVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
