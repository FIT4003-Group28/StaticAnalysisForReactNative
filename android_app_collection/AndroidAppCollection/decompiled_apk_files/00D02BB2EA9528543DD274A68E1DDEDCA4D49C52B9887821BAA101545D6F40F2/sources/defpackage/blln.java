package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: blln  reason: default package */
/* loaded from: classes3.dex */
public class blln implements blkz, begs {
    public final dxio<aesb> a;
    public final dzsj<bqji> b;
    public final boolean c;
    @dzsi
    public Class<? extends bqld> e;
    private final dxio<cafi> g;
    private final dxio<cdjj> h;
    private final dxio<akfa> i;
    private final String k;
    private final String l;
    private final ddho m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    @dzsi
    private jic s;
    private boolean u;
    private final bllm j = new bllm(this);
    public bwrs<ilo> d = bwrs.a(null);
    private String q = "";
    private String r = "";
    private boolean t = false;
    public Float f = Float.valueOf(0.0f);

    public blln(Activity activity, btvo btvoVar, cebr cebrVar, cqhn cqhnVar, dxio<cafi> dxioVar, dxio<cdjj> dxioVar2, dxio<aesb> dxioVar3, dxio<akfa> dxioVar4, dxio<cchz> dxioVar5, dzsj<bqji> dzsjVar, boolean z, cdjk cdjkVar, ddho ddhoVar) {
        boolean z2;
        boolean z3 = false;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.a = dxioVar3;
        this.b = dzsjVar;
        this.i = dxioVar4;
        this.k = activity.getString(R.string.UGC_TASKS_ADD_REVIEW_TITLE);
        this.l = activity.getString(R.string.UGC_TASKS_ADD_REVIEW_DESCRIPTION);
        activity.getString(R.string.TODAY);
        this.c = btvoVar.getEnableFeatureParameters().bb;
        if (cebrVar.a()) {
            cdjkVar.equals(cdjk.PLACESHEET_REVIEWS);
            z2 = true;
        } else {
            z2 = false;
        }
        this.n = z2;
        this.o = z && cebrVar.a() && cebrVar.a.getUgcParameters().bd();
        if (z && btvoVar.getUgcParameters().bc()) {
            z3 = true;
        }
        this.p = z3;
        this.m = ddhoVar;
    }

    @dzsi
    private final String u() {
        ilo c = this.d.c();
        if (c == null || c.a() == null) {
            return null;
        }
        return c.a().e;
    }

    @Override // defpackage.jbc
    public Float a() {
        return this.f;
    }

    @Override // defpackage.jbc
    public jez b() {
        return new jez(this) { // from class: blll
            private final blln a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                blln bllnVar = this.a;
                bllnVar.f = Float.valueOf(f);
                cqkx.p(bllnVar);
                dnqh c = bzwi.c(blpk.PLACE_PAGE);
                if (cjqmVar.a().a()) {
                    dsqp dsqpVar = (dsqp) c.cu(5);
                    dsqpVar.bC(c);
                    dnqg dnqgVar = (dnqg) dsqpVar;
                    String b = cjqmVar.a().b();
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    dnqh dnqhVar2 = dnqh.p;
                    b.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b;
                    c = dnqgVar.bK();
                }
                bqjf r = bqjh.r();
                r.f(c);
                r.g(!bllnVar.c);
                r.j((int) f);
                r.n(chbv.ALWAYS_SHOW);
                ((bqir) r).e = bllnVar.e;
                bllnVar.b.a().b(bllnVar.d, r.o());
                bllnVar.a.a().D((ilo) bwrs.b(bllnVar.d), 8, dtxy.hg);
            }
        };
    }

    @Override // defpackage.jbc
    public cjtd c() {
        cjta b = cjtd.b();
        b.b = u();
        ilo c = this.d.c();
        dbsk.s(c);
        b.g = decs.a(c.ai().c);
        b.d = dtxy.hg;
        return b.a();
    }

    @Override // defpackage.blkz
    public String d() {
        return TextUtils.isEmpty(this.q) ? this.k : this.q;
    }

    @Override // defpackage.blkz
    public String e() {
        return TextUtils.isEmpty(this.r) ? this.l : this.r;
    }

    @Override // defpackage.blkz
    public jic f() {
        jic jicVar = this.s;
        dbsk.s(jicVar);
        return jicVar;
    }

    @Override // defpackage.blkz
    public cjtd g() {
        cjta b = cjtd.b();
        b.b = u();
        ilo c = this.d.c();
        dbsk.s(c);
        b.g = decs.a(c.ai().c);
        b.d = dtxy.hf;
        return b.a();
    }

    @Override // defpackage.blkz
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = this.m;
        ilo c = this.d.c();
        dbsk.s(c);
        b.g = decs.a(c.ai().c);
        return b.a();
    }

    @Override // defpackage.blkz
    public cqkl i() {
        this.g.a().k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.blkz
    public Boolean j() {
        return Boolean.valueOf(btlu.i(this.i.a().j()).equals(btlt.INCOGNITO));
    }

    @Override // defpackage.blkz
    public cqkl k(cjqm cjqmVar) {
        if (!this.n) {
            return cqkl.a;
        }
        dnqg bZ = dnqh.p.bZ();
        int i = ((dtxi) this.m).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ.b;
        dnqhVar2.l = dnmuVar.ap;
        dnqhVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar3.a |= 2;
            dnqhVar3.c = b;
        }
        cdje e = cdjf.e();
        e.b(bZ.bK());
        this.h.a().c(this.d, e.a());
        return cqkl.a;
    }

    @Override // defpackage.blkz
    public Boolean l() {
        boolean z = false;
        if (this.n && !this.o) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        if (!this.u) {
            bllm bllmVar = this.j;
            dceq a = dcet.a();
            a.b(bqje.class, new bllp(0, bqje.class, bllmVar, bvrj.UI_THREAD));
            a.b(ccih.class, new bllp(1, ccih.class, bllmVar, bvrj.UI_THREAD));
            a.b(blpj.class, new bllp(2, blpj.class, bllmVar, bvrj.UI_THREAD));
            btrmVar.g(bllmVar, a.a());
            this.u = true;
        }
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        if (this.u) {
            btrmVar.a(this.j);
            this.u = false;
        }
    }

    @Override // defpackage.blkz
    public Boolean o() {
        boolean z = false;
        if (this.n && this.o) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blkz
    public Boolean p() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.blkz
    public Boolean q() {
        ilo c = this.d.c();
        dbsk.s(c);
        boolean z = true;
        if (this.n) {
            if (((cdqb) c.bn()).b.d().d || c.br()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (c.bq().q != 0.0f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void r(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        docm bv = c.bv();
        this.q = bv.b;
        this.r = bv.c;
        s(c.cC().e, false);
        this.f = Float.valueOf(c.bq().q);
    }

    public final void s(String str, boolean z) {
        if (!this.t || z) {
            jic jicVar = this.s;
            if (jicVar != null && str.equals(jicVar.a)) {
                return;
            }
            this.s = new jic(str, ckqc.FIFE_MERGE, 2131232998);
            this.t = z;
        }
    }

    public void t(@dzsi Class<? extends bqld> cls) {
        this.e = cls;
    }
}
