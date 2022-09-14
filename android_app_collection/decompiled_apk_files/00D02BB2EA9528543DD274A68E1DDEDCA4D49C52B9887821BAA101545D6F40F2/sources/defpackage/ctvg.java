package defpackage;
/* renamed from: ctvg  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctvg implements dbrn {
    static final dbrn a = new ctvg();

    private ctvg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhi cuhiVar = (cuhi) obj;
        dxsf bZ = dxsg.d.bZ();
        int a2 = cuhiVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxsg) bZ.b).a = a2;
        int b = cuhiVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxsg) bZ.b).b = b;
        dcdc a3 = cstr.a(cuhiVar.c(), ctvi.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxsg dxsgVar = (dxsg) bZ.b;
        dsrj<dxss> dsrjVar = dxsgVar.c;
        if (!dsrjVar.a()) {
            dxsgVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(a3, dxsgVar.c);
        return bZ.bK();
    }
}
