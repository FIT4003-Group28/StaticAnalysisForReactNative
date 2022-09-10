package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cat  reason: default package */
/* loaded from: classes.dex */
public final class cat {
    private final caz a;
    private final cas b;

    public cat(my<List<Throwable>> myVar) {
        caz cazVar = new caz(myVar);
        this.b = new cas();
        this.a = cazVar;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        this.a.a(cls, cls2, caqVar);
        this.b.a();
    }

    public final synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        this.a.b(cls, cls2, caqVar);
        this.b.a();
    }

    public final synchronized <Model, Data> void c(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        for (caq<? extends Model, ? extends Data> caqVar2 : this.a.c(cls, cls2, caqVar)) {
            caqVar2.b();
        }
        this.b.a();
    }

    public final synchronized List<Class<?>> d(Class<?> cls) {
        return this.a.f(cls);
    }

    public final synchronized <A> List<cap<A, ?>> e(Class<A> cls) {
        car<?> carVar = this.b.a.get(cls);
        List<cap<A, ?>> list = carVar == null ? null : (List<cap<A, ?>>) carVar.a;
        if (list == null) {
            List<cap<A, ?>> unmodifiableList = Collections.unmodifiableList(this.a.e(cls));
            if (this.b.a.put(cls, new car<>(unmodifiableList)) == null) {
                return unmodifiableList;
            }
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Already cached loaders for model: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return list;
    }
}
