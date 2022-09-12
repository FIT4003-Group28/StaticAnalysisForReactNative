package defpackage;
/* compiled from: PG */
/* renamed from: adxg  reason: default package */
/* loaded from: classes2.dex */
public class adxg implements advj {
    private final agzj a;
    private final adxe b;
    private final cjtd c;

    public adxg(adxf adxfVar, ahds ahdsVar, absg absgVar, dspd dspdVar, dlcx dlcxVar, dlbw dlbwVar, cjtd cjtdVar) {
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b.g(dlcxVar.b);
        this.b = adxfVar.a(dvywVar, b.a(), false);
        this.a = ahdsVar.a(dlbwVar, dspdVar, false, false, ddzg.t);
        this.c = cjtdVar;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.advj
    public advi b() {
        return this.b;
    }

    @Override // defpackage.advj
    public agzj c() {
        return this.a;
    }

    @Override // defpackage.advj
    public cjtd d() {
        return this.c;
    }
}
