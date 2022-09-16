package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adwl  reason: default package */
/* loaded from: classes2.dex */
public class adwl extends adyp {
    private final dqhj A;
    final ilo a;
    private final dxio<adyg> b;
    private final cjtd c;
    private final cjtd d;
    private final cjtd e;
    private final CharSequence f;
    private final jic q;
    private final CharSequence r;
    private final CharSequence s;
    private final CharSequence t;
    private final jic u;
    private final String v;
    private final String w;
    private final adxe x;
    private final adwk y;
    private final adwf z;

    public adwl(gga ggaVar, abfa abfaVar, dxio<adyg> dxioVar, dxio<apyz> dxioVar2, adxf adxfVar, bfcn bfcnVar, final adwg adwgVar, ania aniaVar, adyo adyoVar, absg absgVar, String str, dipk dipkVar, dlbd dlbdVar, dlcx dlcxVar, cjtd cjtdVar, View.OnAttachStateChangeListener onAttachStateChangeListener, btlu btluVar, dqhj dqhjVar, dspd dspdVar, String str2) {
        super(adyoVar, onAttachStateChangeListener, str, dspdVar, btluVar);
        adwk adwkVar;
        diov diovVar;
        this.b = dxioVar;
        this.e = cjtdVar;
        this.A = dqhjVar;
        this.f = dlbdVar.b;
        this.q = (dlbdVar.a & 2) != 0 ? new jic(dlbdVar.c, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0) : null;
        this.r = ggaVar.getString(R.string.YOUR_EXPLORE_MERCHANT_POST_ATTRIBUTION_SUBTITLE);
        this.s = dipkVar.g;
        dipf dipfVar = dipkVar.h;
        this.t = dbrz.f(' ').g(dcbg.b((dipfVar == null ? dipf.b : dipfVar).a).s(adwh.a));
        this.u = (dipkVar.m.isEmpty() || (diovVar = dipkVar.m.get(0)) == null || diovVar.b.isEmpty()) ? null : adyg.c(diovVar.b, ckqc.FIFE, null);
        this.w = dipkVar.o;
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b.g(dlcxVar.b);
        this.x = adxfVar.a(dvywVar, b.a(), abfaVar.x());
        ily ilyVar = new ily();
        dvyw dvywVar2 = dlcxVar.c;
        ilyVar.E(dvywVar2 == null ? dvyw.bv : dvywVar2);
        ilo d = ilyVar.d();
        this.a = d;
        bwrs a = bwrs.a(d);
        bfby bfbyVar = bfby.YOUR_EXPLORE_FEED;
        ilo iloVar = (ilo) a.c();
        dizx cM = iloVar == null ? null : iloVar.cM();
        dbsg i = (cM == null || !cM.a) ? dbpy.a : dbsg.i(new bfco(bfcnVar.a, bfcnVar.c, bfcnVar.d, bfcnVar.e, bfcnVar.f, bfcnVar.g, bfcnVar.h, bfcnVar.i, bfcnVar.j, a, bfbyVar, str2));
        adwgVar.getClass();
        this.z = (adwf) i.h(new dbrn(adwgVar) { // from class: adwi
            private final adwg a;

            {
                this.a = adwgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bfco bfcoVar = (bfco) obj;
                cqhn a2 = this.a.a.a();
                adwg.a(a2, 1);
                adwg.a(bfcoVar, 2);
                return new adwf(a2, bfcoVar);
            }
        }).f();
        if (dxioVar2.a().p(d)) {
            cjta b2 = cjtd.b();
            b2.g(dlcxVar.b);
            adwkVar = new adwk(ggaVar, dxioVar2, d, b2);
        } else {
            adwkVar = null;
        }
        this.y = adwkVar;
        cjta b3 = cjtd.b();
        b3.d = absgVar == absg.AREA_EXPLORE ? dtxj.dh : dtxr.bF;
        b3.g(dipkVar.q);
        if (aniaVar.a()) {
            bgnf.a(b3, dipkVar);
        }
        this.c = b3.a();
        cjta b4 = cjtd.b();
        b4.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b4.g(dlcxVar.b);
        this.d = b4.a();
        this.v = ggaVar.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_PHOTO_OF_PLACE, dlbdVar.b);
    }

    @Override // defpackage.adyp, defpackage.advs
    public jad I() {
        return this.y;
    }

    @Override // defpackage.adyp
    protected final jic O() {
        return this.q;
    }

    @Override // defpackage.adyp
    protected final jic P() {
        return this.u;
    }

    @Override // defpackage.adyp
    public dqhj Q() {
        return this.A;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence a() {
        return this.f;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence b() {
        return this.r;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.e;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl f() {
        this.b.a().a(this.a, jjn.EXPANDED, null);
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd g() {
        return this.d;
    }

    @Override // defpackage.adyp, defpackage.advs
    public Boolean m() {
        return Boolean.valueOf(this.q != null);
    }

    @Override // defpackage.adyp, defpackage.advs
    public advr n() {
        adwf adwfVar = this.z;
        if (adwfVar == null || !adwfVar.k()) {
            return null;
        }
        return this.z;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence o() {
        return this.s;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence p() {
        return this.t;
    }

    @Override // defpackage.adyp, defpackage.advs
    public String s() {
        return this.v;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl v() {
        if (!this.w.isEmpty()) {
            this.b.a().b(this.w);
        } else {
            this.b.a().a(this.a, jjn.EXPANDED, bege.UPDATES);
        }
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd w() {
        return this.c;
    }

    @Override // defpackage.adyp, defpackage.advs
    public advi z() {
        return this.x;
    }
}
