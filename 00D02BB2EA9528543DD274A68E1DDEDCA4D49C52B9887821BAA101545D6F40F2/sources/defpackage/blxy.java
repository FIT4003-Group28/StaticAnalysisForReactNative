package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blxy  reason: default package */
/* loaded from: classes3.dex */
public class blxy extends blxc {
    @dzsi
    public cqfc d;
    public final Activity e;
    private boolean f;
    private CharSequence g = "";
    @dzsi
    private blvt h;
    @dzsi
    private dcdc<dgkm> i;
    @dzsi
    private CharSequence j;
    @dzsi
    private CharSequence k;
    @dzsi
    private cqss l;
    @dzsi
    private cqtd m;
    private final blyv n;

    public blxy(Activity activity, blyv blyvVar) {
        this.n = blyvVar;
        this.e = activity;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss B() {
        return this.l;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence C() {
        return this.j;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence D() {
        return this.k;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd H() {
        return this.m;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqfc I() {
        return this.d;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean K() {
        return this.n.K();
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float L() {
        return blzn.c(this.e, this.n.L().floatValue());
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean R() {
        return Boolean.valueOf(this.h == blvt.RATING);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean S() {
        return Boolean.valueOf(this.h == blvt.REVIEW);
    }

    @Override // defpackage.blxc
    public Boolean ab() {
        return Boolean.valueOf(this.f);
    }

    public void an(CharSequence charSequence, blvt blvtVar, dcdc<dgkm> dcdcVar, CharSequence charSequence2, CharSequence charSequence3, cqss cqssVar, cqtd cqtdVar, boolean z, boolean z2) {
        this.f = true;
        this.g = charSequence;
        this.h = blvtVar;
        this.i = dcdcVar;
        this.j = charSequence2;
        this.k = charSequence3;
        this.l = cqssVar;
        this.m = cqtdVar;
        this.d = new blxv(this, z2, z);
    }

    public void ao() {
        this.f = false;
    }

    public void ap() {
        this.d = new blxx(this);
    }

    public void aq() {
        this.d = new blxw();
    }

    @dzsi
    public dgkm ar(int i) {
        dcdc<dgkm> dcdcVar = this.i;
        if (dcdcVar == null || i < 0 || i >= dcdcVar.size()) {
            return null;
        }
        return this.i.get(i);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean c(Integer num) {
        dgkm ar = ar(num.intValue());
        boolean z = false;
        if (ar != null && !dbsj.d(ar.d)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public CharSequence d(Integer num) {
        dgkm ar = ar(num.intValue());
        return ar == null ? "" : ar.d;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd f(Integer num) {
        dgkm ar = ar(num.intValue());
        if (ar == null) {
            return null;
        }
        return blzn.b(ar, null);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss l(Integer num) {
        return irg.H();
    }
}
