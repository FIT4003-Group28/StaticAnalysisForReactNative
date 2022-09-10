package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bycp  reason: default package */
/* loaded from: classes4.dex */
public final class bycp extends awnw {
    static boolean a = false;
    public cqkj b;
    public ckcw c;
    public bydb d;
    @dzsi
    byda e;

    @Override // defpackage.awnw
    protected final boolean aR() {
        return true;
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.gfo
    public final boolean e() {
        ((ckco) this.c.a(ckid.a)).a(ckib.a(4));
        return super.e();
    }

    @Override // defpackage.awnw
    protected final View i() {
        cqkf c = this.b.c(btpf.b(J()) ? new hst() : new hsr(), (ViewGroup) this.P);
        bydb bydbVar = this.d;
        gga a2 = bydbVar.a.a();
        bydb.a(a2, 1);
        cklf a3 = bydbVar.b.a();
        bydb.a(a3, 2);
        buka a4 = bydbVar.c.a();
        bydb.a(a4, 3);
        cqat a5 = bydbVar.d.a();
        bydb.a(a5, 4);
        bvjj a6 = bydbVar.e.a();
        bydb.a(a6, 5);
        bttf a7 = bydbVar.f.a();
        bydb.a(a7, 6);
        cjqy a8 = bydbVar.g.a();
        bydb.a(a8, 7);
        cjxl a9 = bydbVar.h.a();
        bydb.a(a9, 8);
        dxio a10 = ((dxjh) bydbVar.i).a();
        bydb.a(a10, 9);
        dxio a11 = ((dxjh) bydbVar.j).a();
        bydb.a(a11, 10);
        ckcw a12 = bydbVar.k.a();
        bydb.a(a12, 11);
        dxio a13 = ((dxjh) bydbVar.l).a();
        bydb.a(a13, 12);
        cqhn a14 = bydbVar.m.a();
        bydb.a(a14, 13);
        Executor a15 = bydbVar.n.a();
        bydb.a(a15, 14);
        Executor a16 = bydbVar.o.a();
        bydb.a(a16, 15);
        bydb.a(this, 16);
        byda bydaVar = new byda(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, this);
        this.e = bydaVar;
        if (bydaVar != null) {
            c.e(bydaVar);
        }
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.b;
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        byda bydaVar = this.e;
        if (bydaVar != null) {
            bydaVar.m();
        }
        if (!a) {
            a = true;
            ((ckco) this.c.a(ckid.a)).a(ckib.a(1));
        }
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.fd
    public final void u() {
        byda bydaVar = this.e;
        if (bydaVar != null) {
            bydaVar.n();
        }
        super.u();
    }
}
