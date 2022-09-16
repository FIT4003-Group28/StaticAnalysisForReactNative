package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anzy  reason: default package */
/* loaded from: classes2.dex */
public final class anzy extends anns {
    public acyp a;
    private cqkf<cqkp> ad;
    private cqkf<jbk> ae;
    private iyl af;
    public apjv b;
    public efg c;
    public cqkj d;
    public anhg e;
    anzx f = anzx.PENDING;
    @dzsi
    anhy g = null;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<cqkp> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<jbk> cqkfVar2 = this.ae;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ad = this.d.c(new anzw(), viewGroup);
        cqkf<jbk> c = this.d.c(new hxj(), viewGroup);
        this.ae = c;
        c.e(this.af);
        return this.ad.c();
    }

    public final void g(anhy anhyVar) {
        this.f = anzx.DAY_RESOLVED;
        this.g = anhyVar;
        if (this.aD) {
            J().g().e();
            this.e.D(anhyVar);
        }
    }

    public final void i(anhy anhyVar) {
        this.f = anzx.DAY_NOT_FOUND;
        this.g = anhyVar;
        if (this.aD) {
            J().g().e();
            this.e.D(anhyVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ff J = J();
        apjv apjvVar = this.b;
        jhz a = jhz.a();
        a.x = false;
        a.j = cqrt.l(R.string.NAVIGATE_UP);
        a.f(apjvVar.g());
        a.i = cqrt.g(2131231591, irg.a());
        a.a = J.getString(R.string.YOUR_TIMELINE);
        this.af = new iyl(a.b());
        if (bundle != null) {
            this.f = (anzx) bundle.get("key_state");
            this.g = anhy.q((aoum) dsuv.c(bundle, "key_params", aoum.k, dsqa.c()));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        anhy anhyVar;
        super.s();
        if (this.f == anzx.PENDING) {
            egj egjVar = new egj(this);
            egjVar.k(false);
            egjVar.Y(true);
            egjVar.w(null);
            egjVar.G(this.ae.c(), 6);
            egjVar.ag(this.P);
            egjVar.ai(jjn.EXPANDED);
            if (this.a.c()) {
                egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
            }
            this.c.a(egjVar.a());
        } else if (this.f == anzx.DAY_RESOLVED) {
            anhy anhyVar2 = this.g;
            if (anhyVar2 == null) {
                return;
            }
            g(anhyVar2);
        } else if (this.f != anzx.DAY_NOT_FOUND || (anhyVar = this.g) == null) {
        } else {
            i(anhyVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("key_state", this.f);
        anhy anhyVar = this.g;
        if (anhyVar != null) {
            dsuv.d(bundle, "key_params", anhyVar.r());
        }
    }
}
