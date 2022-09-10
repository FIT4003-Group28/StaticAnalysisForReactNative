package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bpdc  reason: default package */
/* loaded from: classes3.dex */
public class bpdc extends ges implements egq {
    public bpvy a;
    public dxio<abbl> ad;
    public bvrb ae;
    public awvy af;
    public dxio<akgd> ag;
    public bpsq ah;
    private cqkf<bpvy> ai;
    private cryz<awwb> aj;
    public boxb b;
    public bpvc c;
    public dxio<akox> d;
    public cqkj e;
    public efg f;
    public bpdr g;

    public static bpdc g(boxb boxbVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("MODEL_KEY", boxbVar);
        bpdc bpdcVar = new bpdc();
        bpdcVar.B(bundle);
        return bpdcVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.c.b();
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bpdh) {
            bpdh bpdhVar = (bpdh) obj;
            boxe boxeVar = this.b.a;
            boxeVar.b = bpdhVar.a();
            boxeVar.c = bpdhVar.b();
            boxeVar.d = bpdhVar.c();
            boxeVar.a = true;
            cqkx.p(this.a.a());
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.aD) {
            return;
        }
        this.c.a(bpuz.f(this.b.a(), this.b.c.h(bpda.a)));
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bpvy> c = this.e.c(new bplr(), null);
        this.ai = c;
        return c.c();
    }

    public final boolean i() {
        dnqb b = dnqb.b(this.b.b().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return b == dnqb.EXPERIENCE_STRUCTURED_FEEDBACK || b == dnqb.EXPERIENCE_EVENT_DISRUPTION_MODULE;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Serializable serializable = (bundle != null ? bundle : this.o).getSerializable("MODEL_KEY");
        dbsk.s(serializable);
        this.b = (boxb) serializable;
        this.ah.d(bundle);
        bpdr bpdrVar = this.g;
        boxb boxbVar = this.b;
        bpdr.a(this, 1);
        gga a = bpdrVar.a.a();
        bpdr.a(a, 2);
        cqhn a2 = bpdrVar.b.a();
        bpdr.a(a2, 3);
        bpdn a3 = bpdrVar.c.a();
        bpdr.a(a3, 4);
        booa a4 = bpdrVar.d.a();
        bpdr.a(a4, 5);
        bnyd a5 = bpdrVar.e.a();
        bpdr.a(a5, 6);
        bpto a6 = bpdrVar.f.a();
        bpdr.a(a6, 7);
        bptg a7 = bpdrVar.g.a();
        bpdr.a(a7, 8);
        bpsw a8 = bpdrVar.h.a();
        bpdr.a(a8, 9);
        bpdr.a(boxbVar, 10);
        this.a = new bpdq(this, a, a2, a3, a4, a5, a6, a7, a8, boxbVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cR;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ah.f();
        this.ai.e(this.a);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.J(this);
        egf a = egf.a();
        a.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        egjVar.A(a);
        this.f.a(egjVar.a());
        ditt c = this.b.c();
        dxio<abbl> dxioVar = this.ad;
        if (dxioVar != null && c != null) {
            abbj d = abbk.d();
            d.c(c.c);
            d.b(false);
            d.d(deic.a);
            dxioVar.a().a(d.a());
            this.ad.a().d(c);
        }
        cryz<awwb> cryzVar = this.aj;
        if (cryzVar != null) {
            cryzVar.c();
        }
        awws u = awwt.u();
        u.t(dcdc.f("report_road_closure"));
        u.e(awvv.e);
        awwt a2 = u.a();
        awvw f = awvx.f();
        f.e(a2);
        f.b(this.d.a().aa());
        dehn<awwb> b = this.af.b(f.a());
        cryz<awwb> cryzVar2 = new cryz<>(new bpdb(this));
        this.aj = cryzVar2;
        if (b != null) {
            deha.q(b, cryzVar2, this.ae.h());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ah.c(bundle);
        bundle.putSerializable("MODEL_KEY", this.b);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ah.b();
        dxio<abbl> dxioVar = this.ad;
        if (dxioVar != null) {
            dxioVar.a().b();
        }
        this.ai.e(null);
        super.u();
    }
}
