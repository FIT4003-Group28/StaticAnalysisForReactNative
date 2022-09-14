package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dxh  reason: default package */
/* loaded from: classes6.dex */
public final class dxh implements czx {
    private final dxk a;
    private final gga b;
    private final czh c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    @dzsi
    private czj g;
    @dzsi
    private arjq h;

    public dxh(dxk dxkVar, gga ggaVar, czh czhVar) {
        this.a = dxkVar;
        this.b = ggaVar;
        this.c = czhVar;
    }

    @Override // defpackage.czx
    public final czz a() {
        dxk dxkVar = this.a;
        gga ggaVar = this.b;
        arjq arjqVar = this.h;
        boolean z = this.d;
        boolean z2 = this.e;
        czj czjVar = this.g;
        boolean z3 = this.f;
        czh czhVar = this.c;
        dol a = dxkVar.b.a();
        dxk.a(a, 2);
        dve a2 = dxkVar.c.a();
        dxk.a(a2, 3);
        dvt a3 = dxkVar.d.a();
        dxk.a(a3, 4);
        Executor a4 = dxkVar.e.a();
        dxk.a(a4, 5);
        cqat a5 = dxkVar.f.a();
        dxk.a(a5, 6);
        duz a6 = dxkVar.g.a();
        dxk.a(a6, 7);
        der a7 = dxkVar.h.a();
        dxk.a(a7, 8);
        djs a8 = dxkVar.i.a();
        dxk.a(a8, 9);
        dxk.a(dxkVar.j.a(), 10);
        cjqy a9 = dxkVar.k.a();
        dxk.a(a9, 11);
        dkh a10 = dxkVar.l.a();
        dxk.a(a10, 12);
        dkn a11 = dxkVar.m.a();
        dxk.a(a11, 13);
        dxk.a(ggaVar, 14);
        dxk.a(czhVar, 20);
        return new dxj(dxkVar.a.a(), a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, ggaVar, arjqVar, z, z2, czjVar, z3, czhVar);
    }

    @Override // defpackage.czx
    public final void b(boolean z) {
        this.e = z;
    }

    @Override // defpackage.czx
    public final void c(boolean z) {
        this.d = z;
    }

    @Override // defpackage.czx
    public final void d(czj czjVar) {
        this.g = czjVar;
        this.f = true;
    }

    @Override // defpackage.czx
    public final void e(arjq arjqVar) {
        this.h = arjqVar;
    }
}
