package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cpsz  reason: default package */
/* loaded from: classes5.dex */
public final class cpsz<T, D> implements cppu<T, D> {
    public final cpss b;
    public final cpss c;
    private final cppq d = new cpsx(this);
    public final Set<cpvi<T, D>> a = cpwm.a();

    public cpsz(cpss cpssVar, cpss cpssVar2) {
        this.b = cpssVar;
        this.c = cpssVar2;
    }

    @Override // defpackage.cppu
    public final void a(cpoj<T, D> cpojVar) {
        cpojVar.t(this.d);
    }

    @Override // defpackage.cppu
    public final void b(cpoj<T, D> cpojVar) {
        cpojVar.u(this.d);
        c();
    }

    public final void c() {
        for (cpvi<T, D> cpviVar : this.a) {
            Object d = cpviVar.d(cpvf.e);
            if (d instanceof cpsy) {
                cpviVar.i(cpvf.e, (cpve<T, Integer>) ((cpsy) d).c);
            }
        }
        this.a.clear();
    }
}
