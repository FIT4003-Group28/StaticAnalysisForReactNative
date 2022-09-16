package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aret  reason: default package */
/* loaded from: classes2.dex */
public final class aret extends ges implements gfn {
    public efg a;
    public jkf ad;
    public alhv ae;
    public gek af;
    bdwp ag;
    cqkf<izl> ah;
    @dzsi
    arad ai;
    arem aj;
    begc ak;
    arep al;
    public bdwf am;
    public butt an;
    private alar ao;
    private arja ap;
    private final alht aq = new ares(this);
    public arjb b;
    public aren c;
    public dxio<arfm> d;
    public bwqv e;
    public arab f;
    public cqkj g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((areu) btsx.b(areu.class, this)).cj(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ak.a();
        cqkf<izl> cqkfVar = this.ah;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ag.l.e(null);
        super.Qe();
    }

    @Override // defpackage.gfn
    public final boolean a() {
        return true;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bdwp bdwpVar = new bdwp(J(), null);
        this.ag = bdwpVar;
        bdwpVar.setViewModel(this.ap, iln.MY_MAPS_FEATURE);
        this.ag.l.e(this.ap);
        this.ah.e(this.ap.aq());
        aren arenVar = this.c;
        bdwp bdwpVar2 = this.ag;
        Activity activity = (Activity) ((dxjd) arenVar.a).a;
        aren.a(activity, 1);
        gll a = arenVar.b.a();
        aren.a(a, 2);
        akox a2 = arenVar.c.a();
        aren.a(a2, 3);
        hwe a3 = arenVar.d.a();
        aren.a(a3, 4);
        dxio a4 = ((dxjh) arenVar.e).a();
        aren.a(a4, 5);
        bvrb a5 = arenVar.f.a();
        aren.a(a5, 6);
        jkf a6 = arenVar.g.a();
        aren.a(a6, 7);
        fd fdVar = (fd) ((dxjd) arenVar.h).a;
        aren.a(fdVar, 8);
        aren.a(bdwpVar2, 9);
        this.aj = new arem(activity, a, a2, a3, a4, a5, a6, fdVar, bdwpVar2);
        bdwf bdwfVar = this.am;
        cqss B = irg.B();
        Activity activity2 = (Activity) ((dxjd) bdwfVar.a).a;
        bdwf.a(activity2, 1);
        cqkj a7 = bdwfVar.b.a();
        bdwf.a(a7, 2);
        jkf a8 = bdwfVar.c.a();
        bdwf.a(a8, 3);
        dzsj<glj> dzsjVar = bdwfVar.d;
        bdwf.a(B, 5);
        bdwe bdweVar = new bdwe(activity2, a7, a8, dzsjVar, B, false);
        this.ak = bdweVar;
        bdweVar.c(this.ap.i());
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        alar alarVar = (alar) (bundle == null ? this.o : bundle).getSerializable("clickable");
        this.ao = alarVar;
        arjb arjbVar = this.b;
        boolean a = alarVar.a();
        Activity activity = (Activity) ((dxjd) arjbVar.a).a;
        arjb.a(activity, 1);
        bfld a2 = arjbVar.b.a();
        arjb.a(a2, 2);
        arin a3 = arjbVar.c.a();
        arjb.a(a3, 3);
        jkf a4 = arjbVar.d.a();
        arjb.a(a4, 4);
        behx a5 = arjbVar.e.a();
        arjb.a(a5, 5);
        bniv a6 = arjbVar.f.a();
        arjb.a(a6, 6);
        bfhx a7 = arjbVar.g.a();
        arjb.a(a7, 7);
        bniy a8 = arjbVar.h.a();
        arjb.a(a8, 8);
        cqhn a9 = arjbVar.i.a();
        arjb.a(a9, 9);
        vwv a10 = arjbVar.j.a();
        arjb.a(a10, 11);
        cpv a11 = arjbVar.k.a();
        arjb.a(a11, 12);
        this.ap = new arja(activity, a2, a3, a4, a5, a6, a7, a8, a9, a, a10, a11);
        arep arepVar = new arep(J(), this.e, this.an, this.ao, this.ap, this.d.a().C(), null);
        this.al = arepVar;
        if (bundle != null) {
            arepVar.h = (arhf) bundle.getSerializable(arepVar.e(arepVar.c));
        }
        this.ah = this.g.c(new gyf(), null);
        this.af = new gek(J(), this, this.ad);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.eA;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.ai == null) {
            this.ai = this.f.d(null);
            if (this.ao.a()) {
                this.ai.a(new arhf(this.ao.r, null));
                this.ai.b(this.ap.ap());
            }
            this.al.f = this.ai;
        }
        if (this.ao.a()) {
            this.ai.c();
        }
        arep arepVar = this.al;
        arepVar.b.g(arepVar.e, arepVar.i);
        arepVar.c();
        arep arepVar2 = this.al;
        Runnable runnable = new Runnable(this) { // from class: areq
            private final aret a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aret aretVar = this.a;
                jjn jjnVar = aretVar.af.c;
                if (jjnVar == null) {
                    jjnVar = jjn.COLLAPSED;
                }
                egj egjVar = new egj(aretVar);
                egjVar.w(null);
                egjVar.ay(aretVar.ag, R.id.header);
                egjVar.ai(jjnVar);
                egjVar.Q(null);
                egjVar.G(((bdwe) aretVar.ak).a, 5);
                egjVar.aw(aretVar.ah.c(), false);
                egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
                egjVar.as(null);
                egjVar.t(aretVar.aj);
                aretVar.getClass();
                egjVar.J(new egq(aretVar) { // from class: arer
                    private final aret a;

                    {
                        this.a = aretVar;
                    }

                    @Override // defpackage.egq
                    public final void Qs(egu eguVar) {
                        this.a.af.c();
                    }
                });
                egjVar.B(false);
                egjVar.f(true);
                egjVar.ak(jkc.c, jkc.l);
                aretVar.a.a(egjVar.a());
            }
        };
        if (arepVar2.d()) {
            arhf arhfVar = arepVar2.h;
            if (arhfVar == null) {
                btzc btzcVar = arepVar2.g;
                if (btzcVar != null) {
                    btzcVar.a();
                }
                arepVar2.g = arepVar2.j.a(arepVar2.c, arepVar2, bvrj.UI_THREAD);
            } else {
                arepVar2.d.b(arhfVar);
            }
            runnable.run();
        } else {
            arepVar2.a.g().e();
        }
        this.ag.b(this.aj.b);
        this.aj.a(this.ao);
        this.ae.b(this.aq);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("clickable", this.ao);
        arep arepVar = this.al;
        if (arepVar.h != null) {
            bundle.putSerializable(arepVar.e(arepVar.c), arepVar.h);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.c(this.aq);
        arep arepVar = this.al;
        bwqv bwqvVar = arepVar.b;
        bwqv.t(arepVar.e, arepVar.i);
        this.aj.a(null);
        if (this.ao.a()) {
            this.ai.d();
        }
        super.u();
    }
}
