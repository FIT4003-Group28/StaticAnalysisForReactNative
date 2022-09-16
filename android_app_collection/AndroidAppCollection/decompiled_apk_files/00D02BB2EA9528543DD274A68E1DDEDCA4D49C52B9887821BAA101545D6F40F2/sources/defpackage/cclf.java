package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cclf  reason: default package */
/* loaded from: classes4.dex */
public final class cclf extends ges implements gfw, ccyx {
    public ccyz a;
    public ccsk ad;
    public ccsj ae;
    public ccyy af;
    @dzsi
    private cqkf<ccxe> ai;
    public cqkj b;
    public gga c;
    public efg d;
    public dxio<cclq> e;
    public dxio<bbut> f;
    public bwqv g;
    private final ccsf ah = new ccle(this);
    public bwrs<ilo> ag = bwrs.a(null);

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<ccxe> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.ai = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bbuf) {
            this.af.l(((bbuf) obj).a());
        } else if (!(obj instanceof ccwy)) {
        } else {
            ccwy ccwyVar = (ccwy) obj;
            ccyy ccyyVar = this.af;
            ccwu ccwuVar = ccwyVar.b;
            if (ccwuVar == null) {
                ccwuVar = ccwu.d;
            }
            String str = ccwuVar.b;
            dgfg dgfgVar = ccwyVar.c;
            if (dgfgVar == null) {
                dgfgVar = dgfg.d;
            }
            ccyyVar.m(str, dgfgVar);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<ccxe> d = this.b.d(new ccoh(), viewGroup, false);
        this.ai = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        g();
        return true;
    }

    @Override // defpackage.ccyx
    public final void g() {
        if (this.af.k().booleanValue() || this.af.j().booleanValue() || this.af.c().booleanValue() || !this.af.f().isEmpty()) {
            iii iiiVar = new iii();
            iiiVar.a = this.c.getResources().getString(R.string.OFFERING_EDITOR_CANCEL_DIALOG_TITLE);
            iiiVar.d(this.c.getResources().getString(R.string.OFFERING_EDITOR_CANCEL_DIALOG_POSITIVE_BUTTON), new View.OnClickListener(this) { // from class: cclb
                private final cclf a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i();
                }
            }, cjtd.a(dtxx.S));
            iiiVar.c(this.c.getResources().getString(R.string.OFFERING_EDITOR_CANCEL_DIALOG_NEGATIVE_BUTTON), cclc.a, cjtd.a(dtxx.R));
            iiiVar.a(this.c, this.b).k();
            return;
        }
        i();
    }

    public final void i() {
        if (this.aD) {
            this.c.g().f();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        ccwo ccwoVar = (ccwo) bvrs.f(bundle, "fragment_state", (dssr) ccwo.c.cu(7));
        dbsk.s(ccwoVar);
        this.ag = cctq.b(bundle, this.g);
        ccsj a = this.ad.a(this.ah);
        this.ae = a;
        a.e = this.ag;
        cqhn a2 = this.a.a.a();
        ccyz.a(a2, 1);
        ccyz.a(this, 2);
        ccyy ccyyVar = new ccyy(a2, this);
        this.af = ccyyVar;
        ccwk ccwkVar = ccwoVar.b;
        if (ccwkVar == null) {
            ccwkVar = ccwk.m;
        }
        ccyyVar.h(ccwkVar);
        jmw.d(this.c, null);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.V;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ccxe> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.af);
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.J(new egq(this) { // from class: ccla
            private final cclf a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.ae.a();
            }
        });
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        ccwn bZ = ccwo.c.bZ();
        ccwk i = this.af.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwo ccwoVar = (ccwo) bZ.b;
        i.getClass();
        ccwoVar.b = i;
        ccwoVar.a |= 1;
        cctq.a(bundle, this.g, this.ag);
        bvrs.k(bundle, "fragment_state", bZ.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<ccxe> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }
}
