package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnpb  reason: default package */
/* loaded from: classes3.dex */
public final class bnpb extends ges implements bnqu {
    private static final dcqe am = dcqe.c("bnpb");
    public bnqv a;
    public akpm ad;
    public dxio<akzh> ae;
    public gll af;
    public efg ag;
    public cqkj ah;
    public braw ai;
    public jkf aj;
    public cjqy ak;
    public dbty<Boolean> al;
    private String ao;
    private dbsg<Integer> ap;
    private alad aq;
    private cqkf<bnqo> ar;
    private cqkf<bnqo> as;
    private cqkf<bnqo> at;
    private gek au;
    public dpjn b;
    public List<dpca> c;
    public btrm d;
    public bwqv e;
    public gfq f;
    public efc g;
    private List<ilo> an = dcdc.e();
    private final jkh av = new bnoz(this);

    private final boolean aR() {
        return Rn().getConfiguration().orientation == 2;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((bnpc) btsx.b(bnpc.class, this)).cX(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        super.Qd();
        this.ai.b();
    }

    public final void aJ(boolean z) {
        alad aladVar;
        if (!z) {
            aladVar = this.aq;
        } else if (aR()) {
            aladVar = null;
        } else {
            alad a = isx.a(this.ae.a(), this.af, this.aq, this.an);
            Rect f = this.af.f();
            alaa b = alad.b(a);
            b.f = alae.a(f.exactCenterX(), f.exactCenterY(), this.ae.a().y(), this.ae.a().z());
            aladVar = b.a();
        }
        if (aladVar == null || this.ad.n().equals(aladVar)) {
            return;
        }
        akyc e = akyt.e(aladVar);
        e.b = 250;
        this.ad.p(e);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        dbsg<Integer> dbsgVar;
        Bundle bundle2 = this.o;
        try {
            ArrayList arrayList = new ArrayList();
            bvrt.g((ArrayList) this.e.d(ArrayList.class, bundle2, "REFINEMENT_REF_KEY"), arrayList, (dssr) dpca.e.cu(7), dpca.e);
            this.c = arrayList;
            dpjn dpjnVar = (dpjn) bvrt.f((bvrt) this.e.d(bvrt.class, bundle2, "WAYPOINT_REF_KEY"), (dssr) dpjn.m.cu(7), dpjn.m);
            dbsk.s(dpjnVar);
            this.b = dpjnVar;
            String string = bundle2.getString("SERVER_EI_REF_KEY");
            dbsk.s(string);
            this.ao = string;
            int i = bundle2.getInt("WAYPOINT_INDEX_REF_KEY", -1);
            if (i != -1) {
                dbsgVar = dbsg.i(Integer.valueOf(i));
            } else {
                dbsgVar = dbpy.a;
            }
            this.ap = dbsgVar;
            this.a = new bnqv(J(), this.aj, this.b, this.c, this.ao, this);
            this.ar = this.ah.c(new bnqm(), null);
            this.as = this.ah.c(new bnpn(), null);
            this.at = this.ah.c(new bnpj(), null);
            this.ar.e(this.a);
            this.at.e(this.a);
            this.as.e(this.a);
            ArrayList arrayList2 = new ArrayList(this.c.size());
            for (dpca dpcaVar : this.c) {
                ily ilyVar = new ily();
                dpjx dpjxVar = dpcaVar.c;
                if (dpjxVar == null) {
                    dpjxVar = dpjx.n;
                }
                ilyVar.I(amvh.M(dpjxVar, J()));
                ilyVar.i = true;
                arrayList2.add(ilyVar.d());
            }
            this.an = arrayList2;
            dhjx dhjxVar = this.b.f;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            alad c = alad.c(dhjxVar);
            dbsk.s(c);
            this.aq = c;
            return this.ar.c();
        } catch (IOException unused) {
            bvoo.h("Exception deserializing waypoint or refinements from  bundle", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        i();
        return true;
    }

    @Override // defpackage.bnqq
    public final void g(dpjx dpjxVar, dpjx dpjxVar2, cjqm cjqmVar, boolean z) {
        if (this.aD) {
            Nw(new bnpf(this.ap, amvh.M(dpjxVar, J()), amvh.M(dpjxVar2, J()), cjqmVar, z));
            gfq.m(this);
        }
    }

    @Override // defpackage.bnqu
    public final void i() {
        if (this.aD) {
            jjn L = this.aj.l().L();
            jjn w = w();
            if (L == w) {
                gn gnVar = this.A;
                dbsk.s(gnVar);
                gnVar.f();
                return;
            }
            boolean z = true;
            this.aj.setExpandingState(w, true);
            if (w != jjn.EXPANDED) {
                z = false;
            }
            aJ(z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.au = new gek(J(), this, this.aj);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.l;
    }

    public final void q(jjn jjnVar) {
        egj egjVar = new egj(this);
        egjVar.av(jjnVar == jjn.HIDDEN ? this.at.c() : null);
        egjVar.ai(jjnVar);
        egjVar.aj(egn.TWO_FIFTHS_EXPANDED_MAP);
        egjVar.ak(jkc.d, jkc.j);
        egjVar.t(this.av);
        egjVar.k(true);
        egjVar.ah(gwu.a);
        egjVar.w(null);
        egjVar.e(this);
        brau d = brav.d();
        d.d(this.an);
        egjVar.S(d.a());
        egjVar.ay(this.ar.c(), bnqm.a);
        egjVar.r(this.as.c());
        egjVar.J(new bnpa(this));
        this.ag.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(alho.class, new bnpd(alho.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        q(w());
        this.ak.r(aP());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.d.a(this);
        super.u();
    }

    public final jjn w() {
        jjn jjnVar = this.au.c;
        return jjnVar == null ? aR() ? jjn.FULLY_EXPANDED : jjn.EXPANDED : jjnVar;
    }
}
