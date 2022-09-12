package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aexs  reason: default package */
/* loaded from: classes2.dex */
public class aexs implements aexp {
    public boolean a = false;
    private final gga b;
    private final araj c;
    private final begg d;
    private final awre e;
    private final ache f;
    private final aesb g;
    private final aeuv h;
    private final bvjj i;
    private final dzsj<akfa> j;
    private final cjqy k;
    private final dbsg<ddv> l;
    private final ClipboardManager m;
    private aexv n;
    private final boolean o;
    private aexo p;
    private aexo q;
    private aexo r;
    private aexo s;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r2 == null ? defpackage.dkhv.g : r2).b != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aexs(defpackage.gga r1, defpackage.araj r2, defpackage.awre r3, defpackage.ache r4, defpackage.aesb r5, defpackage.begg r6, defpackage.bvjj r7, defpackage.dzsj<defpackage.akfa> r8, defpackage.bwqv r9, defpackage.cjqy r10, defpackage.btvo r11, defpackage.dbsg<defpackage.ddv> r12, defpackage.cqhn r13, defpackage.aeuv r14, defpackage.aexv r15) {
        /*
            r0 = this;
            r0.<init>()
            r9 = 0
            r0.a = r9
            r0.b = r1
            r0.c = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            r0.d = r6
            r0.i = r7
            r0.j = r8
            r0.k = r10
            r0.l = r12
            java.lang.String r2 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            r0.m = r1
            dkiy r1 = r11.getEnableFeatureParameters()
            boolean r1 = r1.z
            r0.o = r1
            r0.h = r14
            r0.n = r15
            boolean r1 = r12.a()
            if (r1 != 0) goto L37
            goto L59
        L37:
            java.lang.Object r1 = r12.b()
            ddv r1 = (defpackage.ddv) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L51
            dkgx r2 = r11.getAugmentedRealityParameters()
            dkhv r2 = r2.b
            if (r2 != 0) goto L4d
            dkhv r2 = defpackage.dkhv.g
        L4d:
            boolean r2 = r2.b
            if (r2 == 0) goto L59
        L51:
            aexq r2 = new aexq
            r2.<init>(r0)
            r1.b(r2)
        L59:
            aexo r1 = r0.A()
            r0.p = r1
            aexo r1 = r0.B()
            r0.q = r1
            aexo r1 = r0.C()
            r0.r = r1
            aexo r1 = r0.D()
            r0.s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexs.<init>(gga, araj, awre, ache, aesb, begg, bvjj, dzsj, bwqv, cjqy, btvo, dbsg, cqhn, aeuv, aexv):void");
    }

    private final aexo A() {
        return new aexr(this, k().booleanValue(), false, cqrt.f(2131232670), 2, Integer.valueOf((int) R.string.SUPERBLUE_NEAR_YOU), cjtd.a(dtxk.A));
    }

    private final aexo B() {
        return new aexr(this, k().booleanValue(), true, cqrt.f(2131231568), 4, Integer.valueOf((int) R.string.SUPERBLUE_SHARE_LOCATION_TITLE), cjtd.a(dtxk.F));
    }

    private final aexo C() {
        return new aexr(this, k().booleanValue(), true, cqrt.f(R.drawable.ic_qu_local_parking), 3, Integer.valueOf((int) R.string.SUPERBLUE_SAVE_PARKING), cjtd.a(dtxk.E));
    }

    private final aexo D() {
        return new aexr(this, k().booleanValue(), false, cqrt.f(2131232776), 1, Integer.valueOf((int) R.string.SUPERBLUE_CAMERA_CALIBRATION), cjtd.a(dtxk.B));
    }

    public static cqss y(boolean z, boolean z2) {
        return z2 ? z ? ibl.c() : ibl.b() : z ? ibm.f() : ibm.b();
    }

    @Override // defpackage.aexp
    public cqkl a() {
        if (!this.h.aD) {
            return cqkl.a;
        }
        this.b.g().f();
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public Boolean b() {
        return Boolean.valueOf(((aeup) this.n).a != null);
    }

    @Override // defpackage.aexp
    public String c() {
        aexv aexvVar = this.n;
        ilo b = aexvVar.b();
        if (b == null) {
            aeuk a = aexvVar.a();
            return a != null ? a.a() : "";
        }
        return b.n();
    }

    @Override // defpackage.aexp
    public String d() {
        aexv aexvVar = this.n;
        ilo b = aexvVar.b();
        if (b == null) {
            aeuk a = aexvVar.a();
            return a != null ? a.b() : "";
        }
        return b.B();
    }

    @Override // defpackage.aexp
    public String e() {
        aexv aexvVar = this.n;
        ilo b = aexvVar.b();
        if (b == null || (b.h().a & 16384) == 0) {
            aeuk a = aexvVar.a();
            return a != null ? a.c() : "";
        }
        dvyn dvynVar = b.h().t;
        if (dvynVar == null) {
            dvynVar = dvyn.d;
        }
        return dvynVar.a;
    }

    @Override // defpackage.aexp
    public aexo f() {
        if (Boolean.compare(this.p.a().booleanValue(), k().booleanValue()) != 0) {
            this.p = A();
        }
        return this.p;
    }

    @Override // defpackage.aexp
    public aexo g() {
        if (Boolean.compare(this.q.a().booleanValue(), k().booleanValue()) != 0) {
            this.q = B();
        }
        return this.q;
    }

    @Override // defpackage.aexp
    public aexo h() {
        if (Boolean.compare(this.r.a().booleanValue(), k().booleanValue()) != 0) {
            this.r = C();
        }
        return this.r;
    }

    @Override // defpackage.aexp
    public aexo i() {
        if (Boolean.compare(this.s.a().booleanValue(), k().booleanValue()) != 0) {
            this.s = D();
        }
        return this.s;
    }

    @Override // defpackage.aexp
    public cqkl j() {
        this.g.k();
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public Boolean k() {
        return Boolean.valueOf(this.j.a().j().m());
    }

    @Override // defpackage.aexp
    public cqss l(boolean z) {
        return y(false, k().booleanValue());
    }

    @Override // defpackage.aexp
    public cqkl m() {
        this.h.g();
        this.c.q();
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public cqkl n() {
        this.h.g();
        this.f.n();
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public cqkl o() {
        ilo iloVar = ((aeup) this.n).a;
        if (iloVar != null) {
            this.k.u(cjtx.c(5, iloVar, true));
            begg beggVar = this.d;
            begj begjVar = new begj();
            begjVar.b(iloVar);
            begjVar.x = true;
            begjVar.c = jjn.FULLY_EXPANDED;
            begjVar.q = true;
            beggVar.o(begjVar, true, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public cqkl p() {
        String e = e();
        if (e != null) {
            this.m.setPrimaryClip(ClipData.newPlainText(this.h.Rn().getString(R.string.COPIED_OPEN_LOCATION_CODE_LABEL), e));
            Toast.makeText(this.b, this.h.Rn().getString(R.string.COPIED_OPEN_LOCATION_CODE_TOAST), 1).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public cqkl q() {
        cjwv cjwvVar = (cjwv) cjxj.a(e());
        this.b.D(bilo.g(cjwvVar.a, cjwvVar.b.isEmpty() ? null : cjwvVar.b, null));
        return cqkl.a;
    }

    @Override // defpackage.aexp
    public Boolean r() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.aexp
    public Boolean s() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.aexp
    public Boolean t() {
        boolean z = false;
        if (this.g.s() && !k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public cqkl u() {
        this.h.g();
        this.g.k();
        return cqkl.a;
    }

    public cqkl v() {
        aeuv aeuvVar = this.h;
        aeuvVar.ah = true;
        aeuvVar.g();
        return cqkl.a;
    }

    public cqkl w() {
        this.h.g();
        if (this.l.a()) {
            this.l.b().c(false);
        }
        return cqkl.a;
    }

    public cqkl x() {
        this.h.g();
        this.i.S(bvjk.hq, true);
        this.e.f(true);
        return cqkl.a;
    }

    public void z(aexv aexvVar) {
        this.n = aexvVar;
        cqkx.p(this);
    }
}
