package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygx  reason: default package */
/* loaded from: classes2.dex */
public final class aygx extends azqj {
    final /* synthetic */ axym a;
    final /* synthetic */ axyo b;
    final azqj c;
    volatile azqj d;

    public aygx() {
    }

    public aygx(axym axymVar, axyo axyoVar) {
        this.a = axymVar;
        this.b = axyoVar;
        azqj azqjVar = new azqj();
        this.c = azqjVar;
        this.d = azqjVar;
    }

    @Override // defpackage.azqj
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.azqj
    public final void b(int i) {
        this.d.b(i);
    }

    @Override // defpackage.azqj
    public final void c(int i, long j, long j2) {
        this.d.c(i, j, j2);
    }

    @Override // defpackage.azqj
    public final void d(ayat ayatVar) {
        this.d.d(ayatVar);
    }

    @Override // defpackage.azqj
    public final void e(long j) {
        this.d.e(j);
    }

    @Override // defpackage.azqj
    public final void f(long j) {
        this.d.f(j);
    }

    @Override // defpackage.azqj
    public final void g() {
        this.d.g();
    }

    @Override // defpackage.azqj
    public final void h(int i) {
        this.d.h(i);
    }

    @Override // defpackage.azqj
    public final void i(int i, long j, long j2) {
        this.d.i(i, j, j2);
    }

    @Override // defpackage.azqj
    public final void j(long j) {
        this.d.j(j);
    }

    @Override // defpackage.azqj
    public final void k(long j) {
        this.d.k(j);
    }

    @Override // defpackage.azqj
    public final void l(Status status) {
        n();
        this.d.l(status);
    }

    @Override // defpackage.azqj
    public final void m(axyb axybVar, ayat ayatVar) {
        axyo axyoVar = this.b;
        axyn axynVar = new axyn();
        axynVar.b(axyoVar.b);
        axynVar.c(axyoVar.a);
        axynVar.a = axyoVar.c;
        axynVar.b = axyoVar.d;
        axynVar.c(axybVar);
        axynVar.a();
        n();
        this.d.m(axybVar, ayatVar);
    }

    public final void n() {
        if (this.d != this.c) {
            return;
        }
        synchronized (this) {
            if (this.d == this.c) {
                this.d = this.a.a();
            }
        }
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", this.d);
        return c.toString();
    }
}
