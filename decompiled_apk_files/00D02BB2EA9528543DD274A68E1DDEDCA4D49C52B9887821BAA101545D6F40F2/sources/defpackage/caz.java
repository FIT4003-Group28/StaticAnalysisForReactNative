package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: caz  reason: default package */
/* loaded from: classes.dex */
public final class caz {
    private static final cay a = new cay();
    private static final cap<Object, Object> b = new caw();
    private final List<cax<?, ?>> c = new ArrayList();
    private final Set<cax<?, ?>> d = new HashSet();
    private final my<List<Throwable>> e;

    public caz(my<List<Throwable>> myVar) {
        this.e = myVar;
    }

    private final <Model, Data> void h(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar, boolean z) {
        cax<?, ?> caxVar = new cax<>(cls, cls2, caqVar);
        List<cax<?, ?>> list = this.c;
        list.add(z ? list.size() : 0, caxVar);
    }

    private final <Model, Data> cap<Model, Data> i(cax caxVar) {
        cap capVar = (cap<? extends Model, ? extends Data>) caxVar.b.a(this);
        cjn.b(capVar);
        return capVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        h(cls, cls2, caqVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        h(cls, cls2, caqVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model, Data> List<caq<? extends Model, ? extends Data>> c(Class<Model> cls, Class<Data> cls2, caq<? extends Model, ? extends Data> caqVar) {
        List<caq<? extends Model, ? extends Data>> d;
        d = d(cls, cls2);
        a(cls, cls2, caqVar);
        return d;
    }

    final synchronized <Model, Data> List<caq<? extends Model, ? extends Data>> d(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<cax<?, ?>> it = this.c.iterator();
        while (it.hasNext()) {
            cax<?, ?> next = it.next();
            if (next.a(cls, cls2)) {
                it.remove();
                arrayList.add(next.b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model> List<cap<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (cax<?, ?> caxVar : this.c) {
                if (!this.d.contains(caxVar) && caxVar.b(cls)) {
                    this.d.add(caxVar);
                    arrayList.add(i(caxVar));
                    this.d.remove(caxVar);
                }
            }
        } catch (Throwable th) {
            this.d.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List<Class<?>> f(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (cax<?, ?> caxVar : this.c) {
            if (!arrayList.contains(caxVar.a) && caxVar.b(cls)) {
                arrayList.add(caxVar.a);
            }
        }
        return arrayList;
    }

    public final synchronized <Model, Data> cap<Model, Data> g(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (cax<?, ?> caxVar : this.c) {
                if (this.d.contains(caxVar)) {
                    z = true;
                } else if (caxVar.a(cls, cls2)) {
                    this.d.add(caxVar);
                    arrayList.add(i(caxVar));
                    this.d.remove(caxVar);
                }
            }
            if (arrayList.size() > 1) {
                return new cav(arrayList, this.e);
            } else if (arrayList.size() == 1) {
                return (cap) arrayList.get(0);
            } else if (!z) {
                throw new brr((Class<?>) cls, (Class<?>) cls2);
            } else {
                return (cap<Model, Data>) b;
            }
        } catch (Throwable th) {
            this.d.clear();
            throw th;
        }
    }
}
