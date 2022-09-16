package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: baat  reason: default package */
/* loaded from: classes3.dex */
public final class baat extends ges {
    public acyp a;
    public bafy b;
    public efg c;
    public cqkj d;
    private bafx e;
    private cqkf<baen> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.f.e(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<baen> e = this.d.e(new babg());
        this.f = e;
        dbsk.s(e);
        return e.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ag;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bafy bafyVar = this.b;
        bayv a = bafyVar.a.a();
        bafy.a(a, 1);
        bayy a2 = bafyVar.b.a();
        bafy.a(a2, 2);
        bazx a3 = bafyVar.c.a();
        bafy.a(a3, 3);
        bafy.a(bafyVar.d.a(), 4);
        Executor a4 = bafyVar.e.a();
        bafy.a(a4, 5);
        Executor a5 = bafyVar.f.a();
        bafy.a(a5, 6);
        btrm a6 = bafyVar.g.a();
        bafy.a(a6, 7);
        gga a7 = bafyVar.h.a();
        bafy.a(a7, 8);
        ahjq a8 = bafyVar.i.a();
        bafy.a(a8, 9);
        dxio a9 = ((dxjh) bafyVar.j).a();
        bafy.a(a9, 10);
        axwq a10 = bafyVar.k.a();
        bafy.a(a10, 11);
        bafx bafxVar = new bafx(a, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        this.e = bafxVar;
        bafxVar.f();
        this.f.e(this.e);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a11 = egf.a();
        a11.s = true;
        egjVar.A(a11);
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.c.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.e.g();
    }
}
