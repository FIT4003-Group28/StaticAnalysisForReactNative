package defpackage;
/* compiled from: PG */
/* renamed from: adxo  reason: default package */
/* loaded from: classes2.dex */
public class adxo implements advp {
    public final bkpi a;
    private final advo b;
    private final adxe c;
    private final cjtd d;

    public adxo(adxf adxfVar, bkpi bkpiVar, absg absgVar, dlcx dlcxVar, dlds dldsVar, @dzsi String str, cjtd cjtdVar) {
        this.a = bkpiVar;
        this.d = cjtdVar;
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b.g(dlcxVar.b);
        this.c = adxfVar.a(dvywVar, b.a(), false);
        ily ilyVar = new ily();
        dvyw dvywVar2 = dlcxVar.c;
        ilyVar.E(dvywVar2 == null ? dvyw.bv : dvywVar2);
        ilo d = ilyVar.d();
        cjta b2 = cjtd.b();
        b2.g(str);
        this.b = new adxn(this, dldsVar, d, b2.b(absgVar == absg.AREA_EXPLORE ? dtxj.dk : dtxr.bT));
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.advp
    public advi b() {
        return this.c;
    }

    @Override // defpackage.advp
    public advo c() {
        return this.b;
    }

    @Override // defpackage.advp
    public cjtd d() {
        return this.d;
    }
}
