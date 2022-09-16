package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: caba  reason: default package */
/* loaded from: classes4.dex */
public class caba implements cafa, bzyv {
    private static final jic d = new jic((String) null, ckqc.FIFE, (int) R.color.qu_google_blue_700, 250);
    private CharSequence A;
    private Boolean B;
    private Boolean C;
    private Boolean D;
    private final Resources E;
    public final ff a;
    public final Runnable b;
    private final cafi e;
    private final cavs f;
    private final dzsj<akfa> g;
    private final caff h;
    private final bzyv i;
    private final cabl j;
    private final bzyq k;
    private final ech l;
    @dzsi
    private cabk n;
    @dzsi
    private bzym o;
    @dzsi
    private ecg p;
    @dzsi
    private dioi q;
    @dzsi
    private dioi r;
    @dzsi
    private dinw s;
    @dzsi
    private String t;
    private jib u;
    private dwul v;
    private jic w;
    private jic x;
    private jic y;
    private CharSequence z;
    public int c = 2;
    private bzyx m = bzyr.m();

    public caba(Resources resources, ff ffVar, cafi cafiVar, cavs cavsVar, dzsj<akfa> dzsjVar, cabl cablVar, bzyq bzyqVar, ech echVar, jib jibVar, caff caffVar, bzyv bzyvVar, Runnable runnable) {
        this.E = resources;
        this.a = ffVar;
        this.e = cafiVar;
        this.f = cavsVar;
        this.g = dzsjVar;
        this.h = caffVar;
        this.i = bzyvVar;
        this.b = runnable;
        this.u = jibVar;
        this.j = cablVar;
        this.k = bzyqVar;
        this.l = echVar;
        E();
    }

    private final void E() {
        this.v = dwul.t;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        cavo.c(0);
        this.t = "";
        jic jicVar = d;
        this.w = jicVar;
        this.x = jicVar;
        this.y = jicVar;
        this.z = "";
        this.A = "";
        this.B = false;
        this.C = false;
        this.D = false;
    }

    private final jic F(@dzsi String str, boolean z) {
        if (dbsj.d(str)) {
            str = this.t;
        }
        return new jic(str, z ? ckqc.FIFE_BLUR_AND_LIGHTEN : ckqc.FIFE, (int) R.color.qu_google_blue_700, 250);
    }

    @Override // defpackage.cafa
    public Boolean A() {
        ecg ecgVar;
        boolean z = false;
        if (this.e.p() && (ecgVar = this.p) != null && !ecgVar.b().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafa
    @dzsi
    public ebm B() {
        return this.p;
    }

    @Override // defpackage.bzyv
    public void a() {
        this.q = null;
        cqkx.p(this);
        this.i.a();
    }

    public void b() {
        this.c = 2;
        E();
        cqkx.p(this);
    }

    public void c() {
        this.c = 3;
        E();
        cqkx.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.dwul r11) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caba.d(dwul):void");
    }

    public void e(jib jibVar) {
        this.u = jibVar;
    }

    @Override // defpackage.cafa
    public jic f() {
        return this.w;
    }

    @Override // defpackage.cafa
    public jic g() {
        return this.x;
    }

    @Override // defpackage.cafa
    public jic h() {
        return this.y;
    }

    @Override // defpackage.cafa
    public CharSequence i() {
        dori doriVar = this.v.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        return doriVar.d;
    }

    @Override // defpackage.cafa
    public CharSequence j() {
        return this.z;
    }

    @Override // defpackage.cafa
    @dzsi
    /* renamed from: k */
    public cabk D() {
        return this.n;
    }

    @Override // defpackage.cafa
    public Boolean l() {
        return Boolean.valueOf(this.c == 2);
    }

    @Override // defpackage.cafa
    public jam m() {
        return new caaz(this);
    }

    @Override // defpackage.cafa
    public Boolean n() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafa
    public Boolean o() {
        return this.B;
    }

    @Override // defpackage.cafa
    public Boolean p() {
        boolean z = false;
        if (this.q != null && this.o != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafa
    public CharSequence q() {
        return this.A;
    }

    @Override // defpackage.cafa
    public bzyx r() {
        return this.m;
    }

    @Override // defpackage.cafa
    public cqkl s() {
        if (this.C.booleanValue()) {
            this.f.f(cawz.a(this.v));
            return cqkl.a;
        }
        if (this.r != null) {
            dori doriVar = this.v.b;
            if (doriVar == null) {
                doriVar = dori.l;
            }
            if (doriVar.g) {
                ccgu.g(this.s).aJ(this.a);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.cafa
    public jib t() {
        return this.u;
    }

    @Override // defpackage.cafa
    @dzsi
    public cjtd u() {
        if (this.c != 1) {
            return null;
        }
        dori doriVar = this.v.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        dqwa dqwaVar = doriVar.j;
        if (dqwaVar == null) {
            dqwaVar = dqwa.g;
        }
        dqvy dqvyVar = dqwaVar.c;
        if (dqvyVar == null) {
            dqvyVar = dqvy.h;
        }
        if ((dqvyVar.a & 16) == 0) {
            dori doriVar2 = this.v.b;
            if (doriVar2 == null) {
                doriVar2 = dori.l;
            }
            if (!doriVar2.h) {
                return cjtd.a(this.v.i ? dtyd.bR : dtxy.oK);
            }
        }
        return cjtd.a(this.v.i ? dtyd.bO : dtxy.oI);
    }

    public void v(dkcp dkcpVar) {
        cabk cabkVar = this.n;
        if (cabkVar == null) {
            return;
        }
        cabkVar.d(dkcpVar);
        cqkx.p(this);
    }

    @Override // defpackage.cafa
    /* renamed from: w */
    public String C() {
        cafg c;
        if (!n().booleanValue()) {
            return "";
        }
        cabk cabkVar = this.n;
        String str = null;
        if (cabkVar != null && (c = cabkVar.c()) != null) {
            str = c.e();
        }
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.c(i());
        bvsiVar.c(j());
        if (!j().toString().contains(q())) {
            bvsiVar.c(q());
        }
        bvsiVar.c(str);
        bvsiVar.e();
        return bvsiVar.toString();
    }

    public Boolean x() {
        return Boolean.valueOf(this.v.i);
    }

    @Override // defpackage.cafa
    @dzsi
    public bzyw y() {
        return this.o;
    }

    @Override // defpackage.cafa
    public Boolean z() {
        return this.D;
    }
}
