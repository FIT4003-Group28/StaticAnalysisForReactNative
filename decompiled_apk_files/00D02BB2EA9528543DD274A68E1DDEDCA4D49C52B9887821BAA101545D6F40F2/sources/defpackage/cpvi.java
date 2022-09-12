package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cpvi  reason: default package */
/* loaded from: classes5.dex */
public class cpvi<T, D> {
    public final List<T> e;
    public String f;
    public String g;
    public cpvv h = new cpvv();
    public cpvr<T> i = new cpvr<>();

    public cpvi(String str, List<T> list) {
        cpwl.h(str, "name");
        this.f = str;
        this.e = list;
    }

    public final cpvi<T, D> b() {
        cpvi<T, D> cpviVar = new cpvi<>(this.f, this.e);
        cpviVar.g = this.g;
        cpvv cpvvVar = this.h;
        cpvv cpvvVar2 = new cpvv();
        cpvvVar2.a.putAll(cpvvVar.a);
        cpviVar.h = cpvvVar2;
        cpvr<T> cpvrVar = this.i;
        cpvr<T> cpvrVar2 = new cpvr<>();
        cpvrVar2.a.putAll(cpvrVar.a);
        cpviVar.i = cpvrVar2;
        return cpviVar;
    }

    public final int c() {
        return this.e.size();
    }

    public final <R> cpve<T, R> d(cpvf<R> cpvfVar) {
        return this.i.a(cpvfVar);
    }

    public final <R> cpve<T, R> e(cpvf<R> cpvfVar, R r) {
        cpvr<T> cpvrVar = this.i;
        cpwl.a(r);
        cpve cpveVar = (cpve<T, ?>) cpvrVar.a.get(cpvfVar);
        return cpveVar != null ? cpveVar : new cpvq(r);
    }

    public final cpve<T, String> f(cpvf<String> cpvfVar, cpvf<?> cpvfVar2) {
        cpve<T, R> a;
        cpve<T, String> cpveVar = (cpve<T, String>) this.i.a(cpvfVar);
        return (cpveVar != null || (a = this.i.a(cpvfVar2)) == 0) ? cpveVar : new cpvh(a);
    }

    public final <T> T g(cpvj<T> cpvjVar) {
        return (T) this.h.a.get(cpvjVar);
    }

    public final <T> T h(cpvj<T> cpvjVar, T t) {
        T t2 = (T) this.h.a.get(cpvjVar);
        return t2 != null ? t2 : t;
    }

    public final <R> void i(cpvf<R> cpvfVar, cpve<T, R> cpveVar) {
        this.i.a.put(cpvfVar, cpveVar);
    }

    public final <R> void j(cpvf<R> cpvfVar, R r) {
        cpvr<T> cpvrVar = this.i;
        cpvrVar.a.put(cpvfVar, new cpvp(r));
    }
}
