package defpackage;

import defpackage.cpqu;
/* compiled from: PG */
/* renamed from: cppn  reason: default package */
/* loaded from: classes5.dex */
public class cppn<T, D, S extends cpqu<T, D>> {
    public cpvi<T, D> a;
    public int b;
    public S c;
    public boolean d = false;

    public cppn(S s) {
        this.c = s;
    }

    public final synchronized void a(float f) {
        this.c.h(f);
        c();
    }

    public synchronized void b(cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpvi<T, D> cpviVar, cpve<T, D> cpveVar, boolean z) {
        this.a = cpviVar;
        this.c.z(cpsoVar, cpsoVar2, cpveVar, cpviVar);
        c();
    }

    protected final void c() {
        this.d = true;
    }
}
