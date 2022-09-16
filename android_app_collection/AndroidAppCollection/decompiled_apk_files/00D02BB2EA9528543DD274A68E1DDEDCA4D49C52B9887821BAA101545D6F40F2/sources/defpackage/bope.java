package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bope  reason: default package */
/* loaded from: classes3.dex */
public class bope implements boqn {
    private final bows a;
    private final ges b;
    private final gga c;
    private final int d;
    private final ddho e;
    private final dosc f;
    private final boolean g;
    private boolean h = false;

    public bope(bows bowsVar, ges gesVar, int i, ddho ddhoVar, boolean z, boolean z2, boolean z3, dosc doscVar) {
        this.a = bowsVar;
        this.b = gesVar;
        this.d = i;
        gga ggaVar = gesVar.aE;
        dbsk.s(ggaVar);
        this.c = ggaVar;
        this.e = ddhoVar;
        this.g = z3;
        this.f = doscVar;
    }

    @Override // defpackage.boqn
    public Boolean a() {
        return false;
    }

    @Override // defpackage.boqn
    public cjtd b() {
        return cjtd.a(this.e);
    }

    @Override // defpackage.boqn
    public cqkl c() {
        if (this.b.aD) {
            d();
        }
        return cqkl.a;
    }

    @Override // defpackage.boqn
    public void d() {
        String string = this.c.getString(R.string.RAP_PANNABLE_TITLE);
        aneb z = anee.z();
        z.r(string);
        z.j(4);
        z.q("");
        this.b.aZ(andr.bt(g(), this.g, false, this.f, z.a()));
    }

    @Override // defpackage.boqn
    public CharSequence e() {
        return this.c.getString(this.d);
    }

    public void f(@dzsi akqq akqqVar, boolean z, dory doryVar) {
        akqq akqqVar2;
        this.h = z;
        akqq akqqVar3 = this.a.b;
        if (akqqVar3 == null || akqqVar == null || !akqqVar3.equals(akqqVar)) {
            this.a.f = doryVar;
        }
        boolean z2 = false;
        if (akqqVar != null) {
            bows bowsVar = this.a;
            bowsVar.h = "";
            bowsVar.g = false;
        }
        bows bowsVar2 = this.a;
        bowsVar2.b = akqqVar;
        if (bowsVar2.c != null && doryVar != dory.FEEDBACK_SERVICE) {
            this.a.c = null;
        }
        if (akqqVar != null ? (akqqVar2 = this.a.a) == null || !akqqVar.equals(akqqVar2) : this.a.a != null) {
            z2 = true;
        }
        this.a.e = Boolean.valueOf(z2);
        cqkx.p(this);
    }

    @Override // defpackage.boqn
    @dzsi
    public akqq g() {
        return this.a.a() ? this.a.b : this.a.a;
    }

    public Boolean h() {
        return this.a.e;
    }

    @Override // defpackage.boqn
    public Boolean i() {
        boolean z = true;
        if (g() != null && this.a.a()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boqn
    public Boolean j() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.boqn
    public Boolean k() {
        return this.a.g;
    }

    @Override // defpackage.boqn
    @dzsi
    public String l() {
        return this.a.h;
    }

    public void m(boolean z) {
        this.a.g = true;
    }

    public void n(String str) {
        this.a.h = str;
    }

    public dory o() {
        return this.a.f;
    }

    public dhjx p(akpm akpmVar) {
        dhjx aa = akpmVar.aa();
        akqq g = g();
        if (g == null) {
            return aa;
        }
        dnoh g2 = g.g();
        dhjw ca = dhjx.f.ca(aa);
        dhjy bZ = dhjz.e.bZ();
        dhjz dhjzVar = aa.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        double d = dhjzVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ.b;
        int i = dhjzVar2.a | 4;
        dhjzVar2.a = i;
        dhjzVar2.d = d;
        double d2 = g2.b;
        int i2 = i | 2;
        dhjzVar2.a = i2;
        dhjzVar2.c = d2;
        double d3 = g2.c;
        dhjzVar2.a = i2 | 1;
        dhjzVar2.b = d3;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dhjx dhjxVar = (dhjx) ca.b;
        dhjz bK = bZ.bK();
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        return ca.bK();
    }
}
