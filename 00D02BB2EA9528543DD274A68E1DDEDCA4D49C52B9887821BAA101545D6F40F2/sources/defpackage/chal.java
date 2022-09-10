package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: chal  reason: default package */
/* loaded from: classes4.dex */
public abstract class chal implements cgwg {
    protected cgsk i;
    protected bwrs<ilo> k;
    protected chak l;
    protected String m;
    protected dwql n;
    protected final cgul o;
    protected chaj q;
    protected int r;
    protected final HashSet<doab> p = new HashSet<>();
    protected cgwf j = cgwf.EDITABLE;

    public chal(cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, cgum cgumVar) {
        int i = 1;
        this.r = 1;
        this.i = cgskVar;
        this.k = bwrsVar;
        this.l = chakVar;
        this.m = cgskVar.a().e;
        this.n = dwqlVar;
        String str = this.m;
        cqat a = cgumVar.a.a();
        cgum.a(a, 1);
        cjqy a2 = cgumVar.b.a();
        cgum.a(a2, 2);
        cgum.a(str, 3);
        this.o = new cgul(a, a2, str);
        for (dwrg dwrgVar : list) {
            dwpc dwpcVar = cgskVar.a().b;
            dwpcVar = dwpcVar == null ? dwpc.e : dwpcVar;
            dwpc dwpcVar2 = dwrgVar.b;
            if (dwpcVar.equals(dwpcVar2 == null ? dwpc.e : dwpcVar2)) {
                int a3 = dwrf.a(dwrgVar.c);
                this.r = a3 != 0 ? a3 : i;
                return;
            }
        }
    }

    @Override // defpackage.cgwg
    public void A(ilo iloVar) {
    }

    @Override // defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(D() != null);
    }

    @Override // defpackage.cgwg
    public dwpc F() {
        dwpc dwpcVar = this.i.a().b;
        return dwpcVar == null ? dwpc.e : dwpcVar;
    }

    @Override // defpackage.cgwg
    public boolean G() {
        return true;
    }

    @Override // defpackage.cgwg
    public boolean H() {
        return this.r == 3;
    }

    @Override // defpackage.cgwg
    public Boolean I() {
        boolean z = false;
        if (this.n.a && J().booleanValue() && this.j == cgwf.EDITABLE && C().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public Boolean J() {
        return false;
    }

    @Override // defpackage.cgwg
    public boolean L() {
        int i = this.r;
        return i == 3 || i == 2;
    }

    @Override // defpackage.cgwg
    public Boolean M() {
        return false;
    }

    @Override // defpackage.cgwg
    public cqkl N() {
        return cqkl.a;
    }

    @Override // defpackage.cgwg
    public Boolean O() {
        return false;
    }

    @Override // defpackage.cgwg
    public Boolean P() {
        boolean z = false;
        if (this.n.a && !O().booleanValue() && !J().booleanValue() && this.j == cgwf.EDITABLE && C().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public cqkl Q() {
        u(cgwf.EDIT_COMPLETED);
        return cqkl.a;
    }

    @Override // defpackage.cgwg
    public cqkl R() {
        B();
        cqkx.p(this);
        z(false);
        return cqkl.a;
    }

    @Override // defpackage.cgwg
    public cjtd S() {
        cjta b = cjtd.b();
        b.d = dtyd.aE;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.cgwg
    public cjtd T() {
        cjta b = cjtd.b();
        b.d = dtyd.aL;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.cgwg
    public cjtd U() {
        cjta b = cjtd.b();
        b.d = dtyd.aI;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.cgwg
    public String V() {
        return this.m;
    }

    @Override // defpackage.cgwg
    public List<dwpp> W() {
        dwqf dwqfVar = this.i.a().c;
        if (dwqfVar == null) {
            dwqfVar = dwqf.g;
        }
        return dwqfVar.f;
    }

    @Override // defpackage.cgwg
    public Boolean X() {
        return false;
    }

    @Override // defpackage.cgwg
    public void Y(boolean z) {
    }

    @Override // defpackage.cgwg
    public List<dwpc> Z() {
        return v().booleanValue() ? dchl.b(F()) : dchl.a();
    }

    @Override // defpackage.cgwg
    public View.OnAttachStateChangeListener aa() {
        return this.o;
    }

    @Override // defpackage.cgwj
    public void ab(doab doabVar) {
        this.p.add(doabVar);
    }

    public void al(chaj chajVar) {
        this.q = chajVar;
    }

    @Override // defpackage.cgwg
    public cgwf t() {
        return this.j;
    }

    @Override // defpackage.cgwg
    public void u(cgwf cgwfVar) {
        this.j = cgwfVar;
        chaj chajVar = this.q;
        if (chajVar != null) {
            chajVar.b(this);
        }
        this.l.G(this);
        cqkx.p(this);
    }

    @Override // defpackage.cgwg
    public Boolean v() {
        return Boolean.valueOf(this.j == cgwf.POSTED);
    }

    @Override // defpackage.cgwg
    public Boolean x(Set<dspd> set) {
        boolean z = true;
        if (!set.isEmpty() && !this.i.d(2, set)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public void z(boolean z) {
        cqkx.p(this);
        this.l.I(this);
    }

    @Override // defpackage.cgwg
    public Boolean w() {
        boolean z = true;
        if (!this.n.a) {
            return true;
        }
        if (this.j != cgwf.EDITABLE) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
