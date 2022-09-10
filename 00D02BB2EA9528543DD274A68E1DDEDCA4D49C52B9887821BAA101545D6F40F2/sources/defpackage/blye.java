package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blye */
/* loaded from: classes3.dex */
public class blye extends blxc {
    public float d;
    public float e;
    public float f;
    public float g;
    private final Activity h;
    private CharSequence i = "";
    @dzsi
    private dcdc<dgkm> j = null;
    private CharSequence k = "";
    private CharSequence l = "";
    @dzsi
    private cqss m = null;
    @dzsi
    private cqtd n = null;
    private int o = -1;
    private boolean p;
    private boolean q;
    @dzsi
    private cqfc r;
    private boolean s;
    private int t;

    public blye(Activity activity) {
        this.h = activity;
    }

    public static /* synthetic */ void aq(blye blyeVar) {
        blyeVar.q = true;
    }

    public static /* synthetic */ void ar(blye blyeVar) {
        blyeVar.r = null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss B() {
        return this.m;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence C() {
        return this.k;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence D() {
        return this.l;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd H() {
        return this.n;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float L() {
        return Float.valueOf(ao());
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean N() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqtv O() {
        return cqrp.c(this.t);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float P() {
        return Float.valueOf(this.d);
    }

    @Override // defpackage.blxc
    public Boolean ab() {
        return true;
    }

    @dzsi
    public dgkm an(int i) {
        dcdc<dgkm> dcdcVar = this.j;
        if (dcdcVar == null || i < 0 || i >= dcdcVar.size()) {
            return null;
        }
        return this.j.get(i);
    }

    public final float ao() {
        float e = cqsz.c().e(this.h) * 1.1f;
        return bvox.b(this.h) ? e : -e;
    }

    public void ap(CharSequence charSequence, dcdc<dgkm> dcdcVar, CharSequence charSequence2, CharSequence charSequence3, cqss cqssVar, cqtd cqtdVar, int i, boolean z, int i2, float f, float f2, boolean z2, float f3, float f4) {
        this.i = charSequence;
        this.j = dcdcVar;
        this.k = charSequence2;
        this.l = charSequence3;
        this.m = cqssVar;
        this.n = cqtdVar;
        this.o = i;
        this.s = z;
        this.t = i2;
        this.d = f;
        this.e = f2;
        this.p = z2;
        this.f = f3;
        this.g = f4;
        this.q = false;
        this.r = null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public CharSequence b() {
        return this.i;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean c(Integer num) {
        dgkm an = an(num.intValue());
        boolean z = false;
        if (an != null && !an.d.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public CharSequence d(Integer num) {
        dgkm an = an(num.intValue());
        return an == null ? "" : an.d;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd f(Integer num) {
        dgkm an = an(num.intValue());
        if (an == null) {
            return null;
        }
        if (num.intValue() == this.o) {
            return blzn.b(an, this.m);
        }
        cqtd b = blzn.b(an, irg.b());
        if (b == null) {
            return null;
        }
        return new blxz(new Object[]{b}, b);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss l(Integer num) {
        if (an(num.intValue()) != null) {
            return num.intValue() == this.o ? this.m : irg.H();
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cjtd n() {
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cjtd o(Integer num) {
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl r(Integer num) {
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqfc I() {
        cqfc blydVar;
        if (this.q) {
            return null;
        }
        if (this.r == null) {
            if (!this.p) {
                blydVar = new blyd(this);
            } else {
                blydVar = new blyb(this);
            }
            this.r = blydVar;
        }
        return this.r;
    }
}
