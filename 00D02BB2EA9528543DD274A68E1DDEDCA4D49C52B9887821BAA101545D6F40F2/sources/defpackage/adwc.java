package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adwc  reason: default package */
/* loaded from: classes2.dex */
public class adwc extends adyp {
    public boolean a;
    dqhj b;
    private final dxio<adyg> c;
    private final dlbw d;
    private final cjtd e;
    private final CharSequence f;
    private final jic q;
    private final CharSequence r;
    private final cjta s;
    private final CharSequence t;
    private final CharSequence u;
    private jic v;
    private final String w;
    private final adxe x;

    public adwc(gga ggaVar, abfa abfaVar, adxf adxfVar, adyo adyoVar, dxio<adyg> dxioVar, absg absgVar, String str, dlbw dlbwVar, dlcx dlcxVar, cjtd cjtdVar, View.OnAttachStateChangeListener onAttachStateChangeListener, btlu btluVar, dqhj dqhjVar, dspd dspdVar) {
        super(adyoVar, onAttachStateChangeListener, str, dspdVar, btluVar);
        jic jicVar;
        this.a = true;
        this.c = dxioVar;
        this.d = dlbwVar;
        this.e = cjtdVar;
        this.b = dqhjVar;
        dlcs dlcsVar = dlbwVar.e;
        dlcsVar = dlcsVar == null ? dlcs.f : dlcsVar;
        this.f = dlcsVar.e;
        if ((dlcsVar.a & 4) != 0) {
            dwfl dwflVar = dlcsVar.d;
            jicVar = new jic((dwflVar == null ? dwfl.w : dwflVar).h, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, cqrt.g(2131232856, ibm.x()), 0);
        } else {
            jicVar = null;
        }
        this.q = jicVar;
        this.r = dlcsVar.b;
        this.t = dlbwVar.b;
        this.u = dlbwVar.c;
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b.g(dlcxVar.b);
        adxe a = adxfVar.a(dvywVar, b.a(), abfaVar.x());
        this.x = a;
        cjta b2 = cjtd.b();
        b2.d = dtxr.by;
        b2.g(dlbwVar.a);
        this.s = b2;
        this.w = ggaVar.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_PHOTO_OF_PLACE, a.a());
    }

    private final cqkl T() {
        adyg a = this.c.a();
        dlcs dlcsVar = this.d.e;
        if (dlcsVar == null) {
            dlcsVar = dlcs.f;
        }
        a.b(dlcsVar.c);
        return cqkl.a;
    }

    @Override // defpackage.adyp
    protected final jic O() {
        return this.q;
    }

    @Override // defpackage.adyp
    protected final jic P() {
        if (this.v == null && !this.d.d.isEmpty()) {
            dwfl dwflVar = this.d.d.get(0);
            if (!dwflVar.h.isEmpty()) {
                this.v = adyg.c(dwflVar.h, jfv.b(dwflVar), new adwa(this));
            }
        }
        return this.v;
    }

    @Override // defpackage.adyp
    public dqhj Q() {
        return this.b;
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
        return T();
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd g() {
        cjta cjtaVar = this.s;
        cjtaVar.i(0);
        return cjtaVar.a();
    }

    @Override // defpackage.adyp, defpackage.advs
    public String j() {
        return super.y();
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence o() {
        return this.t;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence p() {
        return this.u;
    }

    @Override // defpackage.adyp, defpackage.advs
    public Boolean r() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.adyp, defpackage.advs
    public String s() {
        return this.w;
    }

    @Override // defpackage.adyp, defpackage.advs
    public int u() {
        return 204;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl v() {
        return T();
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd w() {
        cjta cjtaVar = this.s;
        cjtaVar.i(0);
        return cjtaVar.a();
    }

    @Override // defpackage.adyp, defpackage.advs
    public advi z() {
        return this.x;
    }
}
