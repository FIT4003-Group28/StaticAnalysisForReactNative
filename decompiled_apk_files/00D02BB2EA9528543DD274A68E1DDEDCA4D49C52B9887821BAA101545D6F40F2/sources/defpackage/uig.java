package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uig  reason: default package */
/* loaded from: classes7.dex */
public final class uig extends ges implements ssr {
    public Executor a;
    @dzsi
    private cqkf<uik> ad;
    @dzsi
    private crzp<Boolean> ae;
    private final View.OnLayoutChangeListener af = new uif(this);
    @dzsi
    private uid ag;
    public efg b;
    public cqkj c;
    public tib d;
    public uic e;
    public uil f;
    @dzsi
    private cqkf<tjg> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<tjg> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.c().removeOnLayoutChangeListener(this.af);
            this.g = null;
        }
        this.ad = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<tjg> e = this.c.e(new til());
        this.g = e;
        e.c().addOnLayoutChangeListener(this.af);
        this.ad = this.c.e(new uij());
        return null;
    }

    @Override // defpackage.ssr
    public final ssq b() {
        return ssq.ZERO_STATE;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        final uic uicVar = this.e;
        uicVar.a().b();
        uicVar.e = new crzp(uicVar) { // from class: uia
            private final uic a;

            {
                this.a = uicVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                uic uicVar2 = this.a;
                uff uffVar = (uff) crzmVar.l();
                dbsk.s(uffVar);
                dcdc<amvh> a = uffVar.a();
                if (ufe.a(a)) {
                    return;
                }
                dbsg<Integer> d = uffVar.d();
                if (!d.a()) {
                    return;
                }
                bwnj a2 = uicVar2.c.a(a, d.b().intValue(), false);
                tmy a3 = uicVar2.a();
                dtja b = a2.b();
                dbsk.s(b);
                dtjs j = a2.j();
                dbsk.s(j);
                dtjt F = a2.F();
                dbsk.s(F);
                a3.f(b, j, F, a2.l());
                uicVar2.d.d(uib.a);
            }
        };
        uicVar.a.a().a(uicVar.e, uicVar.b);
        uid uidVar = new uid(this);
        this.ag = uidVar;
        uic uicVar2 = this.e;
        uicVar2.d.a(uidVar, this.a);
        this.d.b(true);
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        cqkf<tjg> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(this.d.a());
            egjVar.G(this.g.c(), 5);
            uil uilVar = this.f;
            dbsk.s(uilVar);
            cqkf<tjg> cqkfVar2 = this.g;
            dbsk.s(cqkfVar2);
            View c = cqkfVar2.c();
            c.measure(View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels, 1073741824), 0);
            uilVar.c(c.getMeasuredHeight());
            this.d.c(true ^ this.e.a().e().s().booleanValue());
        }
        cqkf<uik> cqkfVar3 = this.ad;
        if (cqkfVar3 != null) {
            uil uilVar2 = this.f;
            dbsk.s(uilVar2);
            cqkfVar3.e(uilVar2);
            egjVar.ag(this.ad.c());
            egjVar.ak(jkc.q, jkc.q);
            this.ae = new crzp(this) { // from class: uie
                private final uig a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    tib tibVar;
                    uig uigVar = this.a;
                    if (!crzmVar.k() || (tibVar = uigVar.d) == null) {
                        return;
                    }
                    Boolean bool = (Boolean) crzmVar.l();
                    dbsk.s(bool);
                    tibVar.c(!bool.booleanValue());
                }
            };
            crzm<Boolean> c2 = this.e.c();
            crzp<Boolean> crzpVar = this.ae;
            dbsk.s(crzpVar);
            c2.d(crzpVar, this.a);
        }
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        cqkf<tjg> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<uik> cqkfVar2 = this.ad;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        uic uicVar = this.e;
        uicVar.a().c();
        if (uicVar.e != null) {
            crzm<uff> a = uicVar.a.a();
            crzp<uff> crzpVar = uicVar.e;
            dbsk.s(crzpVar);
            a.c(crzpVar);
        }
        uid uidVar = this.ag;
        if (uidVar != null) {
            this.e.d.c(uidVar);
        }
        if (this.ae != null) {
            crzm<Boolean> c = this.e.c();
            crzp<Boolean> crzpVar2 = this.ae;
            dbsk.s(crzpVar2);
            c.c(crzpVar2);
            this.ae = null;
        }
    }
}
