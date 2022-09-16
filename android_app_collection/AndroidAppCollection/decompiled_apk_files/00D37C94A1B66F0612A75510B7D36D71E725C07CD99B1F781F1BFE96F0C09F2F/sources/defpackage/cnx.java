package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnx  reason: default package */
/* loaded from: classes2.dex */
public final class cnx {
    final Class a;
    final cnr b;
    private final Class c;

    public cnx(Class cls, Class cls2, cnr cnrVar) {
        this.c = cls;
        this.a = cls2;
        this.b = cnrVar;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }

    public final boolean b(Class cls, Class cls2) {
        return a(cls) && this.a.isAssignableFrom(cls2);
    }
}
