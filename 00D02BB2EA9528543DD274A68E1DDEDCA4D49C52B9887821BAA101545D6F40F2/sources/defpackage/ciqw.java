package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ciqw  reason: default package */
/* loaded from: classes4.dex */
class ciqw extends cibj implements ciqt, chyv {
    private final chxg a;
    private final chxr b;
    private final String c;
    private final chrx d;
    private final int e;
    private final boolean f;
    private final chyy g;
    private final btvo h;
    private chyu i;

    public ciqw(chxg chxgVar, chxl chxlVar, chrx chrxVar, int i, chyy chyyVar, btvo btvoVar) {
        super(chxlVar);
        this.i = chyu.VISIBLE;
        this.a = chxgVar;
        this.d = chrxVar;
        chxr chxrVar = chxlVar.b;
        this.b = chxrVar == null ? chxr.e : chxrVar;
        dwlh dwlhVar = chxlVar.d;
        this.c = (dwlhVar == null ? dwlh.n : dwlhVar).c;
        this.e = i;
        chxp chxpVar = chxlVar.i;
        this.f = (chxpVar == null ? chxp.k : chxpVar).g;
        this.g = chyyVar;
        this.h = btvoVar;
        boolean p = p(chxgVar);
        cjta b = cjtd.b();
        b.d = dtxl.gn;
        if (p) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        b.a();
        boolean p2 = p(chxgVar);
        cjta b2 = cjtd.b();
        b2.d = dtxl.go;
        if (p2) {
            b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        b2.a();
    }

    private static boolean p(chxg chxgVar) {
        chxf chxfVar = chxgVar.d;
        if (chxfVar == null) {
            chxfVar = chxf.e;
        }
        chxe chxeVar = chxfVar.c;
        if (chxeVar == null) {
            chxeVar = chxe.f;
        }
        String str = chxeVar.d;
        chxf chxfVar2 = chxgVar.d;
        if (chxfVar2 == null) {
            chxfVar2 = chxf.e;
        }
        return dbsj.d(str) && chxfVar2.b.size() > 0;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.i;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.TAGGABLE_PHOTO;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.ciqt
    public String e() {
        return this.c;
    }

    @Override // defpackage.ciqt
    public String f() {
        dwfl dwflVar = this.a.b;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        return dwflVar.h;
    }

    @Override // defpackage.ciqt
    public cqkl g() {
        this.i = chyu.COMPLETED;
        this.d.ae(this.b, this.a, "");
        return cqkl.a;
    }

    @Override // defpackage.ciqt
    public cqkl h() {
        if (this.g.a()) {
            return cqkl.a;
        }
        this.i = chyu.DISMISSED;
        this.d.L(this.b, dcep.B(this.a));
        return cqkl.a;
    }

    @Override // defpackage.ciqt
    public cqkl i() {
        if (this.g.a()) {
            return cqkl.a;
        }
        chrx chrxVar = this.d;
        dwfl dwflVar = this.a.b;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        chrxVar.am(dcdc.f(dwflVar));
        return cqkl.a;
    }

    @Override // defpackage.ciqt
    @dzsi
    public Integer j() {
        dwfl dwflVar = this.a.b;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dizp dizpVar = dizhVar.h;
        if (dizpVar == null) {
            dizpVar = dizp.c;
        }
        Long valueOf = Long.valueOf(dizpVar.b);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    @Override // defpackage.ciqt
    public String k() {
        return String.valueOf(this.e);
    }

    @Override // defpackage.ciqt
    public Boolean l() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.ciqt
    public Boolean m() {
        dhpt dhptVar = this.h.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return Boolean.valueOf(dhptVar.g);
    }

    @Override // defpackage.ciqt
    public cqsn n() {
        if (m().booleanValue()) {
            return cqrt.l(R.string.TAG_PUBLISHED_PHOTOS_TASK_PHOTO_RICH_DISH_CHIP_TEXT);
        }
        return cqrt.l(R.string.TAG_PUBLISHED_PHOTOS_TASK_DISH_CHIP_TEXT);
    }

    @Override // defpackage.ciqt
    public String o() {
        return "";
    }
}
