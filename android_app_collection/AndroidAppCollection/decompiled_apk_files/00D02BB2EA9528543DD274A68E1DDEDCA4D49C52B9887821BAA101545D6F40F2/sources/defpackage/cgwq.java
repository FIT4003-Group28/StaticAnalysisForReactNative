package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cgwq  reason: default package */
/* loaded from: classes4.dex */
public class cgwq implements cgux, chaj {
    private final dcdc<chal> a;
    private final chal b;
    @dzsi
    private chal c;
    private chal d;
    private boolean e = false;
    private boolean f = false;

    public cgwq(chal chalVar, dcdc<chal> dcdcVar) {
        this.b = chalVar;
        this.d = chalVar;
        this.a = dcdcVar;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            chal chalVar2 = dcdcVar.get(i);
            if (chalVar2 instanceof chal) {
                chalVar2.al(this);
            }
        }
    }

    @Override // defpackage.cgwg
    public void A(ilo iloVar) {
        dcdc<chal> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).A(iloVar);
        }
    }

    @Override // defpackage.cgwg
    public void B() {
        this.d.B();
    }

    @Override // defpackage.cgwg
    public Boolean C() {
        return this.d.C();
    }

    @Override // defpackage.cgwg
    @dzsi
    public Serializable D() {
        return this.d.D();
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        this.d.E(obj);
    }

    @Override // defpackage.cgwg
    public dwpc F() {
        return this.d.F();
    }

    @Override // defpackage.cgwg
    public boolean G() {
        return this.d.G();
    }

    @Override // defpackage.cgwg
    public boolean H() {
        return this.d.I().booleanValue();
    }

    @Override // defpackage.cgwg
    public Boolean I() {
        throw null;
    }

    @Override // defpackage.cgwg
    public Boolean J() {
        throw null;
    }

    @Override // defpackage.cgwg
    public void K() {
        this.d.K();
    }

    @Override // defpackage.cgwg
    public boolean L() {
        return this.d.L();
    }

    @Override // defpackage.cgwg
    public Boolean M() {
        return this.d.M();
    }

    @Override // defpackage.cgwg
    public cqkl N() {
        return this.d.N();
    }

    @Override // defpackage.cgwg
    public Boolean O() {
        return this.d.O();
    }

    @Override // defpackage.cgwg
    public Boolean P() {
        return this.d.P();
    }

    @Override // defpackage.cgwg
    public cqkl Q() {
        return this.d.Q();
    }

    @Override // defpackage.cgwg
    public cqkl R() {
        return this.d.R();
    }

    @Override // defpackage.cgwg
    public cjtd S() {
        return this.d.S();
    }

    @Override // defpackage.cgwg
    public cjtd T() {
        return this.d.T();
    }

    @Override // defpackage.cgwg
    public cjtd U() {
        return this.d.U();
    }

    @Override // defpackage.cgwg
    public String V() {
        throw null;
    }

    @Override // defpackage.cgwg
    public List<dwpp> W() {
        throw null;
    }

    @Override // defpackage.cgwg
    public Boolean X() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cgwg
    public void Y(boolean z) {
        this.e = false;
    }

    @Override // defpackage.cgwg
    public List<dwpc> Z() {
        return dcbg.b(this.a).t(cgwp.a).z();
    }

    @Override // defpackage.cgux
    public void a() {
        if (!this.d.equals(this.b)) {
            this.f = true;
        }
    }

    @Override // defpackage.cgwg
    public View.OnAttachStateChangeListener aa() {
        return this.d.aa();
    }

    @Override // defpackage.cgwj
    public void ab(doab doabVar) {
        this.d.ab(doabVar);
    }

    @Override // defpackage.chaj
    public void b(cgwg cgwgVar) {
        dwpk b;
        chal chalVar;
        if (cgwgVar.equals(this.d) && cgwgVar.t() == cgwf.EDIT_COMPLETED) {
            this.c = this.d;
            if ((cgwgVar instanceof cgvm) && (b = ((cgvm) cgwgVar).b()) != null) {
                dwpo bZ = dwpp.d.bZ();
                dwpc F = cgwgVar.F();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwpp dwppVar = (dwpp) bZ.b;
                F.getClass();
                dwppVar.b = F;
                dwppVar.a |= 1;
                dwpg dwpgVar = b.c;
                if (dwpgVar == null) {
                    dwpgVar = dwpg.c;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwpp dwppVar2 = (dwpp) bZ.b;
                dwpgVar.getClass();
                dwppVar2.c = dwpgVar;
                dwppVar2.a |= 2;
                final dwpp bK = bZ.bK();
                chalVar = (chal) dcbg.b(this.a).r(new dbsl(bK) { // from class: cgwo
                    private final dwpp a;

                    {
                        this.a = bK;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        chal chalVar2 = (chal) obj;
                        return chalVar2.w().booleanValue() && chalVar2.G() && chalVar2.W().contains(this.a);
                    }
                }).f();
            } else {
                chalVar = null;
            }
            if (chalVar != null) {
                this.d = chalVar;
                this.e = true;
            }
        }
        if (cgwgVar.equals(this.c) && cgwgVar.t() == cgwf.EDITABLE) {
            chal chalVar2 = this.c;
            if (chalVar2 != null) {
                this.d = chalVar2;
                this.e = true;
            }
            this.c = null;
            this.f = false;
        }
        cqkx.p(this);
    }

    @Override // defpackage.cgwg
    public cgwf t() {
        return this.f ? cgwf.POSTED : this.d.t();
    }

    @Override // defpackage.cgwg
    public void u(cgwf cgwfVar) {
        this.d.u(cgwfVar);
    }

    @Override // defpackage.cgwg
    public Boolean v() {
        boolean z = true;
        if (!this.f && !this.d.v().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public Boolean w() {
        boolean z = false;
        if (!this.f && this.d.w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public Boolean x(Set<dspd> set) {
        return this.d.x(set);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        this.d.y(cqivVar);
    }

    @Override // defpackage.cgwg
    public void z(boolean z) {
        this.d.z(true);
    }
}
