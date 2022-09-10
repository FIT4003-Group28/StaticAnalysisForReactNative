package defpackage;
/* compiled from: PG */
/* renamed from: axjm  reason: default package */
/* loaded from: classes3.dex */
public final class axjm {
    public final dzgn<axjk> a;
    public final dyzu<axjk> b;
    private final axis c;

    public axjm(axis axisVar) {
        this.c = axisVar;
        dzgn<axjk> a = dzgn.a();
        this.a = a;
        dyzu<axjk> SU = a.SU();
        dzvx.b(SU, "successfulResponsesSubject.hide()");
        this.b = SU;
    }

    public final dzaa<dimq> a(dimm dimmVar) {
        dzvx.c(dimmVar, "request");
        dzgq i = dzgq.i();
        axis axisVar = this.c;
        deig d = deig.d();
        dsqp dsqpVar = (dsqp) dimmVar.cu(5);
        dsqpVar.bC(dimmVar);
        dimj dimjVar = (dimj) dsqpVar;
        dnwb a = axisVar.b.a();
        if (dimjVar.c) {
            dimjVar.bF();
            dimjVar.c = false;
        }
        dimm dimmVar2 = (dimm) dimjVar.b;
        dimm dimmVar3 = dimm.h;
        a.getClass();
        dimmVar2.g = a;
        dimmVar2.a |= 512;
        ((buty) axisVar.e).c.e = axisVar.a.a().j();
        axisVar.b(((buty) axisVar.e).b(), (dimm) dimjVar.bK(), d, axii.a);
        dzaa.d(d, dzgh.a()).e(new axjl(this, dimmVar)).f(i);
        return i;
    }
}
