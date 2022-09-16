package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rnw  reason: default package */
/* loaded from: classes7.dex */
public final class rnw extends ges {
    public efg a;
    public cqkj b;
    public scp c;
    private sco d;
    private cqkf<sag> e;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof rmk) {
            this.d.y();
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.e = this.b.d(new rrl(), viewGroup, false);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        scp scpVar = this.c;
        Application a = scpVar.a.a();
        scp.a(a, 1);
        btvo a2 = scpVar.b.a();
        scp.a(a2, 2);
        qjk a3 = scpVar.c.a();
        scp.a(a3, 3);
        axvy a4 = scpVar.d.a();
        scp.a(a4, 4);
        cqhn a5 = scpVar.e.a();
        scp.a(a5, 5);
        sic a6 = scpVar.f.a();
        scp.a(a6, 6);
        ros a7 = scpVar.g.a();
        scp.a(a7, 7);
        sbz a8 = scpVar.h.a();
        scp.a(a8, 8);
        dxio a9 = ((dxjh) scpVar.i).a();
        scp.a(a9, 9);
        Executor a10 = scpVar.j.a();
        scp.a(a10, 10);
        Executor a11 = scpVar.k.a();
        scp.a(a11, 11);
        saf a12 = scpVar.l.a();
        scp.a(a12, 12);
        axwq a13 = scpVar.m.a();
        scp.a(a13, 13);
        wbx a14 = scpVar.n.a();
        Activity activity = (Activity) ((dxjd) scpVar.o).a;
        scp.a(activity, 15);
        scp.a(this, 16);
        this.d = new sco(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, activity, this);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.ds;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d.h();
        this.e.e(this.d);
        egj egjVar = new egj(this);
        egjVar.w(this.e.c());
        egjVar.ag(null);
        this.a.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.e.e(null);
        super.u();
    }
}
