package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blxc  reason: default package */
/* loaded from: classes3.dex */
public class blxc implements blwp, bega, jkk {
    @dzsi
    private izl d;
    protected boolean a = false;
    protected boolean b = false;
    protected int c = 0;
    @dzsi
    private cqfc e = null;
    private final cqqw f = new blxa(this);

    @Override // defpackage.blwp
    public Integer A() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.blwp
    @dzsi
    public cqss B() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence C() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence D() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence E() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence F() {
        return null;
    }

    @Override // defpackage.blwp
    public Boolean G() {
        return false;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqtd H() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqfc I() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqfc J() {
        return null;
    }

    @Override // defpackage.blwp
    public Boolean K() {
        return false;
    }

    @Override // defpackage.blwp
    public Float L() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.blwp
    public Float M() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.blwp
    public Boolean N() {
        return false;
    }

    @Override // defpackage.blwp
    public cqtv O() {
        return cqrp.c(dcyn.a);
    }

    @Override // defpackage.blwp
    public Float P() {
        return Float.valueOf(1.0f);
    }

    @Override // defpackage.blwp
    public Boolean Q(int i) {
        return false;
    }

    @Override // defpackage.blwp
    public Boolean R() {
        return false;
    }

    @Override // defpackage.blwp
    public Boolean S() {
        return false;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence T() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence U() {
        return null;
    }

    @Override // defpackage.blwp
    public jez V() {
        return blwz.a;
    }

    @Override // defpackage.blwp
    public cqkl W() {
        return cqkl.a;
    }

    @Override // defpackage.blwp
    public cqkl X() {
        return cqkl.a;
    }

    @Override // defpackage.blwp
    public Boolean Y() {
        return false;
    }

    @Override // defpackage.blwp
    public Boolean Z() {
        izl izlVar = this.d;
        boolean z = false;
        if (izlVar != null && izlVar.a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwp
    public void a() {
    }

    @Override // defpackage.blwp
    public Boolean aa() {
        boolean z = false;
        if (ac().booleanValue() && ae().booleanValue() && ad().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean ab() {
        return false;
    }

    public Boolean ac() {
        return true;
    }

    public Boolean ad() {
        return false;
    }

    public Boolean ae() {
        boolean z = false;
        if (ab().booleanValue() && !this.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public cqqw af() {
        return this.f;
    }

    public void ag(btrm btrmVar) {
    }

    public void ah(btrm btrmVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqfc ai(blwo blwoVar, boolean z) {
        return new blxb(this, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aj() {
        this.e = null;
    }

    public void ak(int i, boolean z) {
        if (i > 0) {
            al(true);
        } else if (i >= 0) {
        } else {
            al(false);
        }
    }

    final void al(Boolean bool) {
        if (bool.booleanValue() != this.a) {
            this.a = bool.booleanValue();
            this.e = null;
            if (!ae().booleanValue()) {
                return;
            }
            cqkx.p(this);
        }
    }

    public void am(izl izlVar) {
        this.d = izlVar;
    }

    @Override // defpackage.blwp
    public CharSequence b() {
        return "";
    }

    @Override // defpackage.blwp
    public Boolean c(Integer num) {
        return false;
    }

    @Override // defpackage.blwp
    public CharSequence d(Integer num) {
        return "";
    }

    @Override // defpackage.blwp
    public Boolean e() {
        return false;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqtd f(Integer num) {
        return null;
    }

    @Override // defpackage.jkk
    public void g(int i) {
        int i2 = this.c;
        if (i != i2) {
            if (i < i2 || i == 0) {
                this.a = false;
            } else {
                this.a = true;
            }
            this.c = i;
            this.e = null;
            cqkx.p(this);
        }
    }

    @Override // defpackage.blwp
    public Boolean h(Integer num) {
        return false;
    }

    @Override // defpackage.blwp
    @dzsi
    public CharSequence i(Integer num) {
        return null;
    }

    @Override // defpackage.blwp
    public Boolean j(Integer num) {
        return false;
    }

    @Override // defpackage.blwp
    public Boolean k(Integer num) {
        return false;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqss l(Integer num) {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cqtd m() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cjtd n() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cjtd o(Integer num) {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public cjtd p() {
        return null;
    }

    @Override // defpackage.blwp
    public cqkl q() {
        return cqkl.a;
    }

    @Override // defpackage.blwp
    public cqkl r(Integer num) {
        return cqkl.a;
    }

    @Override // defpackage.blwp
    public cqkl s() {
        this.b = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.blwp
    public cqkl v() {
        return cqkl.a;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return ae();
    }

    @Override // defpackage.blwp
    @dzsi
    public View.OnTouchListener x() {
        return null;
    }

    @Override // defpackage.blwp
    @dzsi
    public View.OnTouchListener y() {
        return null;
    }

    @Override // defpackage.blwp
    public cqfc z(blwo blwoVar) {
        if (this.e == null) {
            this.e = ai(blwoVar, !this.a);
        }
        return this.e;
    }
}
