package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abup  reason: default package */
/* loaded from: classes2.dex */
public class abup implements abnb {
    static final jic a = new jic((String) null, ckqc.FULLY_QUALIFIED, ibm.j(), 250);
    private final gga b;
    private final gll c;
    private final akpm d;
    private final bvsl e;
    private final djcw f;
    private final ilo g;
    private final jba h;
    private final cjtd i;
    private final dxio<abfa> j;
    private final dxio<begg> k;

    public abup(gga ggaVar, ahjq ahjqVar, bnjv bnjvVar, gll gllVar, akpm akpmVar, bvsl bvslVar, dxio<abfa> dxioVar, dxio<begg> dxioVar2, djcw djcwVar) {
        this.b = ggaVar;
        this.c = gllVar;
        this.d = akpmVar;
        this.e = bvslVar;
        this.f = djcwVar;
        this.j = dxioVar;
        this.k = dxioVar2;
        dvyw dvywVar = djcwVar.b;
        akqi b = akqi.b((dvywVar == null ? dvyw.bv : dvywVar).g);
        cjta b2 = cjtd.b();
        b2.d = dtxo.cF;
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = b.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b2.s(bZ.bK());
        this.i = b2.a();
        ily ilyVar = new ily();
        dvyw dvywVar2 = djcwVar.b;
        ilyVar.E(dvywVar2 == null ? dvyw.bv : dvywVar2);
        ilo d = ilyVar.d();
        this.g = d;
        bnjs a2 = bnjvVar.a(d);
        a2.c = ahjqVar.a();
        this.h = a2.a();
    }

    @Override // defpackage.abnb
    public String a() {
        return this.h.g();
    }

    @Override // defpackage.abnb
    @dzsi
    public String b() {
        return this.h.h();
    }

    @Override // defpackage.abnb
    @dzsi
    public String c() {
        djcw djcwVar = this.f;
        if ((djcwVar.a & 4) != 0) {
            int i = djcwVar.d;
            if (i >= 620000.0d) {
                return null;
            }
            if (i == 0) {
                return this.b.getString(R.string.EXPLORE_POPULAR_AREAS_CURRENTLY_HERE);
            }
            return this.e.c(i, null, true, true);
        }
        return null;
    }

    @Override // defpackage.abnb
    public jic d() {
        jic e = this.h.e();
        return e != null ? e : a;
    }

    @Override // defpackage.abnb
    public cqkl e() {
        akqq j;
        if (!this.j.a().a.getPassiveAssistParameters().a().ap) {
            this.b.g().f();
            Rect e = this.c.e();
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            djcw djcwVar = this.f;
            if ((djcwVar.a & 2) != 0) {
                dpuq dpuqVar = djcwVar.c;
                if (dpuqVar == null) {
                    dpuqVar = dpuq.d;
                }
                j = new akqs(dpuqVar).c();
            } else {
                dvyw dvywVar = djcwVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                dhjz dhjzVar = dvywVar.e;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                j = akqq.j(dhjzVar);
                dbsk.s(j);
            }
            djcw djcwVar2 = this.f;
            float f = 16.0f;
            if ((djcwVar2.a & 2) != 0 && !e.isEmpty()) {
                dpuq dpuqVar2 = djcwVar2.c;
                if (dpuqVar2 == null) {
                    dpuqVar2 = dpuq.d;
                }
                f = dece.c((float) akqo.l(new akqs(dpuqVar2), e.height(), e.width(), displayMetrics.density), 11.0f, 18.0f);
            }
            this.d.p(akyt.i(j, f));
        } else {
            ilo iloVar = this.g;
            begj begjVar = new begj();
            begjVar.b(iloVar);
            begjVar.n = true;
            begjVar.c = jjn.EXPANDED;
            this.k.a().n(begjVar, false, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.abnb
    public cjtd f() {
        return this.i;
    }
}
