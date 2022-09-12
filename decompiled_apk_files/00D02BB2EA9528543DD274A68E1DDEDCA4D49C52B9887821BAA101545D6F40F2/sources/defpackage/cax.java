package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cax  reason: default package */
/* loaded from: classes.dex */
public final class cax<Model, Data> {
    final Class<Data> a;
    final caq<? extends Model, ? extends Data> b;
    private final Class<Model> c;

    public cax(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        this.c = cls;
        this.a = cls2;
        this.b = caqVar;
    }

    public final boolean a(Class<?> cls, Class<?> cls2) {
        return b(cls) && this.a.isAssignableFrom(cls2);
    }

    public final boolean b(Class<?> cls) {
        return this.c.isAssignableFrom(cls);
    }
}
