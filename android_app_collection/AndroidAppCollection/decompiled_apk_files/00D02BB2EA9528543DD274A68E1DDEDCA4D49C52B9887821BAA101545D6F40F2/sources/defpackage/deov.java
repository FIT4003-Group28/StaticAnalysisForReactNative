package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: deov  reason: default package */
/* loaded from: classes6.dex */
public final class deov<T> {
    public int a;
    private final Set<Class<? super T>> b;
    private final Set<depi> c;
    private int d;
    private depa<T> e;
    private Set<Class<?>> f;

    @SafeVarargs
    public deov(Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.a = 0;
        this.f = new HashSet();
        depp.checkNotNull(cls, "Null interface");
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            depp.checkNotNull(cls2, "Null interface");
        }
        Collections.addAll(this.b, clsArr);
    }

    public final deow<T> a() {
        depp.checkState(this.e != null, "Missing required property: factory.");
        return new deow<>(new HashSet(this.b), new HashSet(this.c), this.d, this.a, this.e, this.f);
    }

    public final void b(depi depiVar) {
        depp.checkNotNull(depiVar, "Null dependency");
        depp.checkArgument(!this.b.contains(depiVar.a), "Components are not allowed to depend on interfaces they themselves provide.");
        this.c.add(depiVar);
    }

    public final void c(depa<T> depaVar) {
        depp.checkNotNull(depaVar, "Null factory");
        this.e = depaVar;
    }

    public final void d(int i) {
        depp.checkState(this.d == 0, "Instantiation type has already been set.");
        this.d = i;
    }

    public final void e() {
        d(1);
    }
}
