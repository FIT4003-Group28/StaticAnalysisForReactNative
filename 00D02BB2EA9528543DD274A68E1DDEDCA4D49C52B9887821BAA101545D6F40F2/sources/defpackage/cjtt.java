package defpackage;
/* compiled from: PG */
/* renamed from: cjtt  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjtt extends cjtk {
    private final dcdc<dtaq> a;

    public cjtt(cqat cqatVar) {
        super(cqatVar.e());
        this.a = dcdc.e();
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dvfx bZ = dvfy.f.bZ();
        dcdc<dtaq> dcdcVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfy dvfyVar = (dvfy) bZ.b;
        dsrj<dtaq> dsrjVar = dvfyVar.e;
        if (!dsrjVar.a()) {
            dvfyVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(dcdcVar, dvfyVar.e);
        dvfy bK = bZ.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.r = bK;
        dwunVar.a |= 8192;
        dvfy a = a();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar3 = (dwun) dwumVar.b;
        a.getClass();
        dvfy dvfyVar2 = dwunVar3.r;
        if (dvfyVar2 != null && dvfyVar2 != dvfy.f) {
            dvfx ca = dvfy.f.ca(dwunVar3.r);
            ca.bC(a);
            a = ca.bJ();
        }
        dwunVar3.r = a;
        dwunVar3.a |= 8192;
    }

    protected abstract dvfy a();

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }

    public cjtt(cqat cqatVar, dcdc<dtaq> dcdcVar) {
        super(cqatVar.e());
        this.a = dcdcVar;
    }
}
