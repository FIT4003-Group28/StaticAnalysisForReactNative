package defpackage;
/* compiled from: PG */
/* renamed from: adxk  reason: default package */
/* loaded from: classes2.dex */
public class adxk implements advn {
    public final dxio<adyg> a;
    private final advm b;
    private final adxe c;
    private final cjtd d;

    public adxk(abfa abfaVar, adxf adxfVar, dxio<adyg> dxioVar, ania aniaVar, absg absgVar, dlcx dlcxVar, dipk dipkVar, cjtd cjtdVar) {
        this.d = cjtdVar;
        this.a = dxioVar;
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b.g(dlcxVar.b);
        this.c = adxfVar.a(dvywVar, b.a(), !abfaVar.a.getPassiveAssistParameters().a().O);
        cjta b2 = cjtd.b();
        b2.d = absgVar == absg.AREA_EXPLORE ? dtxj.dh : dtxr.bF;
        b2.g(dipkVar.q);
        if (aniaVar.a()) {
            bgnf.a(b2, dipkVar);
        }
        ily ilyVar = new ily();
        dvyw dvywVar2 = dlcxVar.c;
        ilyVar.E(dvywVar2 == null ? dvyw.bv : dvywVar2);
        this.b = new adxj(this, dipkVar, ilyVar.d(), b2.a());
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.advn
    public advi b() {
        return this.c;
    }

    @Override // defpackage.advn
    public advm c() {
        return this.b;
    }

    @Override // defpackage.advn
    public cjtd d() {
        return this.d;
    }
}
