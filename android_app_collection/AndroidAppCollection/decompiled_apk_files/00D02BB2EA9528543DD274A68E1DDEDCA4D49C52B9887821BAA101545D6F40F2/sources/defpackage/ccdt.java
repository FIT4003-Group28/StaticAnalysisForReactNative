package defpackage;
/* compiled from: PG */
/* renamed from: ccdt  reason: default package */
/* loaded from: classes4.dex */
public final class ccdt implements ccct {
    private final dxio<ccdy> a;
    private final dxio<ccds> b;

    public ccdt(dxio<ccdy> dxioVar, dxio<ccds> dxioVar2) {
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    @Override // defpackage.ccct
    public final ccby a() {
        bvpe a = this.b.a().a.a();
        ccds.a(a);
        return new ccdr(a);
    }

    @Override // defpackage.ccct
    public final cqix<cccu> b(drnp drnpVar) {
        ccco cccoVar;
        ccdx a;
        drnx drnxVar = drnpVar.d;
        if (drnxVar == null) {
            drnxVar = drnx.c;
        }
        if (drnxVar.a != 3) {
            cccoVar = new ccco(true, true, true);
            a = this.a.a().a(drnpVar);
        } else {
            cccoVar = new ccco(false, false, false);
            a = this.a.a().a(drnpVar);
            a.i(true);
        }
        return cqgr.fT(cccoVar, a);
    }
}
