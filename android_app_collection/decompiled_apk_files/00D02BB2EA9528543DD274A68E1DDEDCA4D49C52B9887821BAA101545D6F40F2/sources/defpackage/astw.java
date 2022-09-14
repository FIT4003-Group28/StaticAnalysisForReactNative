package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: astw  reason: default package */
/* loaded from: classes2.dex */
public class astw implements asur {
    private final afwo a;
    private final astv b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;

    public astw(afwo afwoVar, crem cremVar, astv astvVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        dbsk.s(afwoVar);
        this.a = afwoVar;
        dbsk.s(cremVar);
        this.b = astvVar;
        this.c = z2;
        boolean[] zArr = new boolean[3];
        boolean z6 = false;
        zArr[0] = z3;
        zArr[1] = z4;
        zArr[2] = i > 0;
        dbsk.a(deby.b(zArr) <= 1 ? true : z6);
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
    }

    @Override // defpackage.asur
    public Boolean a() {
        return Boolean.valueOf(this.a.d(afwm.TRAFFIC));
    }

    @Override // defpackage.asur
    public Boolean b() {
        return Boolean.valueOf(this.a.d(afwm.SATELLITE));
    }

    @Override // defpackage.asur
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.asur
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.asur
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.asur
    public Boolean f() {
        return Boolean.valueOf(this.g > 0);
    }

    @Override // defpackage.asur
    public Boolean g() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.asur
    public cqsn h() {
        return cqrt.l(R.string.MENU_REMOVE_NEXT_STOP);
    }

    @Override // defpackage.asur
    public cqkl i() {
        afwo afwoVar = this.a;
        afwoVar.i(!afwoVar.d(afwm.TRAFFIC));
        this.b.b();
        return cqkl.a;
    }

    @Override // defpackage.asur
    public cqkl j() {
        afwo afwoVar = this.a;
        afwoVar.g(!afwoVar.d(afwm.SATELLITE));
        this.b.b();
        return cqkl.a;
    }

    @Override // defpackage.asur
    public cqkl k() {
        asls aslsVar = (asls) this.b;
        aslsVar.a();
        aslt asltVar = aslsVar.b;
        if (((efh) asltVar.b).b) {
            asltVar.e.a().k();
        }
        return cqkl.a;
    }

    @Override // defpackage.asur
    public cqkl l() {
        asls aslsVar = (asls) this.b;
        aslsVar.a();
        aslt asltVar = aslsVar.b;
        if (((efh) asltVar.b).b) {
            asltVar.af.m();
        }
        return cqkl.a;
    }

    @Override // defpackage.asur
    public cqkl m() {
        asls aslsVar = (asls) this.b;
        aslsVar.a();
        aslt asltVar = aslsVar.b;
        if (((efh) asltVar.b).b) {
            asltVar.af.Qc();
        }
        return cqkl.a;
    }

    @Override // defpackage.asur
    public cqkl n() {
        asls aslsVar = (asls) this.b;
        aslsVar.a();
        aslt asltVar = aslsVar.b;
        if (((efh) asltVar.b).b) {
            asltVar.c.b(new crhv());
        }
        return cqkl.a;
    }
}
