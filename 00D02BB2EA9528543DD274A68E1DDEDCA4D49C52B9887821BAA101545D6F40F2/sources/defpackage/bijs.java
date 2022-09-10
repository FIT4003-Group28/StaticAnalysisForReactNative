package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijs  reason: default package */
/* loaded from: classes3.dex */
public class bijs implements bijb {
    public final dxio<bvvw> a;
    public final cjtd b;
    public final boolean c;
    public final cklf d;
    public final gga e;
    private final dqbe f;
    private final btvo g;
    private final cjtd h;
    private final cjtd i;
    @dzsi
    private jad j;
    @dzsi
    private jht k;

    public bijs(gga ggaVar, dxio<bvvw> dxioVar, cklf cklfVar, btvo btvoVar, dqbe dqbeVar, ilo iloVar, boolean z) {
        this.f = dqbeVar;
        this.a = dxioVar;
        this.g = btvoVar;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = z ? dtxy.dA : dtxy.kL;
        c.g(dqbeVar.b);
        this.b = c.a();
        cjta c2 = cjtd.c(iloVar.bZ());
        c2.d = z ? dtxy.dz : dtxy.kK;
        c2.g(dqbeVar.b);
        this.h = c2.a();
        cjta c3 = cjtd.c(iloVar.bZ());
        c3.d = z ? dtxy.dC : dtxy.kN;
        c3.g(dqbeVar.b);
        this.i = c3.a();
        this.c = z;
        this.j = null;
        this.d = cklfVar;
        this.e = ggaVar;
    }

    @Override // defpackage.bijb
    public Boolean a() {
        boolean z = false;
        if ((this.g.getPlaceSheetParameters().h() || this.g.getPlaceSheetParameters().i()) && (this.f.a & 16) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bijb
    public String b() {
        return this.f.d;
    }

    @Override // defpackage.bijb
    @dzsi
    public String c() {
        dqbe dqbeVar = this.f;
        if ((dqbeVar.a & 32) != 0) {
            return dqbeVar.e;
        }
        return null;
    }

    @Override // defpackage.bijb
    public jad d() {
        if (this.j == null) {
            this.j = new bijr(this);
        }
        jad jadVar = this.j;
        dbsk.s(jadVar);
        return jadVar;
    }

    @Override // defpackage.bijb
    public jic e() {
        return new jic(this.f.f, ckqc.FULLY_QUALIFIED, (cqtd) null, 250);
    }

    @Override // defpackage.bijb
    public cjtd f() {
        return this.h;
    }

    @Override // defpackage.bijb
    public cjtd g() {
        return this.i;
    }

    @Override // defpackage.bijb
    public jht i() {
        if (this.k == null) {
            jhu h = jhv.h();
            jhm a = jhm.a();
            a.a = this.e.getString(R.string.LEARN_MORE);
            a.l = R.string.LEARN_MORE;
            h.d(a.c());
            jhi jhiVar = (jhi) h;
            jhiVar.b = new jhr(this) { // from class: bijq
                private final bijs a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhr
                public final void a(int i) {
                    bijs bijsVar = this.a;
                    if (i == R.string.LEARN_MORE) {
                        bijsVar.d.a("find_purchases");
                    }
                }
            };
            jhiVar.e = this.e.getString(R.string.LEARN_MORE_ACCESSIBILITY_OVERFLOW_MENU);
            this.k = h.b();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final dqba j() {
        if (!this.f.g.isEmpty()) {
            return this.f.g.get(0);
        }
        return null;
    }

    @Override // defpackage.bijb
    @dzsi
    public cqtd h() {
        int a = dqbc.a(this.f.c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                return cqrt.g(2131232437, ibm.x());
            }
            return null;
        }
        return cqrt.g(2131232220, ibm.x());
    }
}
