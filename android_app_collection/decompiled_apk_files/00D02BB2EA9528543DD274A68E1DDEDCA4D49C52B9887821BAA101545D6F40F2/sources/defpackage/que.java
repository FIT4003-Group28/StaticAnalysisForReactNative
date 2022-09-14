package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: que  reason: default package */
/* loaded from: classes7.dex */
public final class que extends ges implements qur {
    public quv a;
    public gga ad;
    public acyp ae;
    public cjxo af;
    public dxio<ixr> ag;
    @dzsi
    public qup ah;
    @dzsi
    public quy ai;
    @dzsi
    public rbm aj;
    @dzsi
    private qut ak;
    @dzsi
    private cqkf<rbf> al;
    @dzsi
    private cqkf<rbc> am;
    private final View.OnLayoutChangeListener an = new View.OnLayoutChangeListener(this) { // from class: qty
        private final que a;

        {
            this.a = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            rbm rbmVar = this.a.aj;
            if (i9 == i8 - i6 || rbmVar == null) {
                return;
            }
            rbmVar.g(i9);
        }
    };
    public qus b;
    public cqkj c;
    public efg d;
    public rbn e;
    public byex f;
    public gfq g;

    @dzsi
    private final quq g() {
        qup qupVar = this.ah;
        if (qupVar == null) {
            return null;
        }
        return qupVar.d();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.am = null;
        cqkf<rbf> cqkfVar = this.al;
        if (cqkfVar != null) {
            cqkfVar.c().removeOnLayoutChangeListener(this.an);
            this.al = null;
        }
        qut qutVar = this.ak;
        dbsk.s(qutVar);
        qutVar.d();
    }

    @Override // defpackage.qur
    @dzsi
    public final quy aJ() {
        return this.ai;
    }

    @Override // defpackage.qur
    public final void aR() {
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.am = this.c.d(new qzc(), viewGroup, false);
        if (!this.ae.d() && !this.ae.f()) {
            cqkf<rbf> d = this.c.d(new qzz(), viewGroup, false);
            this.al = d;
            d.c().addOnLayoutChangeListener(this.an);
        }
        mw<Integer> mwVar = this.al != null ? null : new mw(this) { // from class: qtz
            private final que a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                rbm rbmVar = this.a.aj;
                dbsk.s(rbmVar);
                rbmVar.g(((Integer) obj).intValue());
            }
        };
        qut qutVar = this.ak;
        dbsk.s(qutVar);
        qutVar.a(viewGroup, null, new mw(this) { // from class: qua
            private final que a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                rbm rbmVar = this.a.aj;
                dbsk.s(rbmVar);
                rbmVar.f(((Integer) obj).intValue());
            }
        }, mwVar);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getBundle("commute_hub_directive") != null) {
            this.ah = qup.i(bundle2.getBundle("commute_hub_directive"));
        }
        this.ai = (quy) bundle2.getSerializable("commute_hub_state");
        quq g = bundle2.getBoolean("use_error_layout") ? g() : null;
        rbn rbnVar = this.e;
        qud qudVar = new qud(this, bundle2.getBoolean("dismiss_option"));
        Activity activity = (Activity) ((dxjd) rbnVar.a).a;
        rbn.a(activity, 1);
        rbn.a(rbnVar.b.a(), 2);
        Executor a = rbnVar.c.a();
        rbn.a(a, 3);
        acyp a2 = rbnVar.d.a();
        rbn.a(a2, 4);
        iwl a3 = rbnVar.e.a();
        rbn.a(a3, 5);
        rby a4 = rbnVar.f.a();
        rbn.a(a4, 6);
        rbv a5 = rbnVar.g.a();
        rbn.a(a5, 7);
        rbn.a(qudVar, 8);
        this.aj = new rbm(activity, a, a2, a3, a4, a5, qudVar, g);
        this.ak = this.b.a(this, null);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        quq g = g();
        if (g == null) {
            return dtxl.av;
        }
        int ordinal = g.ordinal();
        return ordinal != 1 ? (ordinal == 2 || ordinal == 3) ? dtxl.aQ : dtxl.av : dtxl.aw;
    }

    @Override // defpackage.qur
    public final qux q() {
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.ae.d()) {
            this.af.a(1);
        }
        qut qutVar = this.ak;
        dbsk.s(qutVar);
        qutVar.b();
        cqkf<rbc> cqkfVar = this.am;
        dbsk.s(cqkfVar);
        rbm rbmVar = this.aj;
        dbsk.s(rbmVar);
        cqkfVar.e(rbmVar);
        egj egjVar = new egj(this);
        cqkf<rbc> cqkfVar2 = this.am;
        dbsk.s(cqkfVar2);
        egjVar.w(cqkfVar2.c());
        egjVar.ag(null);
        egjVar.Y(true);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.J(new egq(this) { // from class: qub
            private final que a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.a.b(quu.ZERO_STATE);
            }
        });
        egjVar.A(egf.h());
        cqkf<rbf> cqkfVar3 = this.al;
        if (cqkfVar3 != null) {
            rbm rbmVar2 = this.aj;
            dbsk.s(rbmVar2);
            cqkfVar3.e(rbmVar2.e());
            cqkf<rbf> cqkfVar4 = this.al;
            dbsk.s(cqkfVar4);
            egjVar.F(cqkfVar4.c());
            qut qutVar2 = this.ak;
            dbsk.s(qutVar2);
            egjVar.av(qutVar2.h());
        } else if (this.ae.f()) {
            dxio<ixr> dxioVar = this.ag;
            dbsk.s(dxioVar);
            ixr a = dxioVar.a();
            a.o(false);
            a.ak(false);
            a.al(true);
            egjVar.Z();
            egjVar.W(a);
            qut qutVar3 = this.ak;
            dbsk.s(qutVar3);
            egjVar.av(qutVar3.h());
        } else {
            qut qutVar4 = this.ak;
            dbsk.s(qutVar4);
            qutVar4.e(egjVar);
        }
        if (this.ae.g()) {
            egjVar.h();
        }
        this.d.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        qut qutVar = this.ak;
        dbsk.s(qutVar);
        qutVar.c();
        cqkf<rbf> cqkfVar = this.al;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<rbc> cqkfVar2 = this.am;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
        if (this.ae.d()) {
            this.af.b();
        }
        super.u();
    }

    @Override // defpackage.qur
    @dzsi
    public final qup w() {
        return this.ah;
    }
}
