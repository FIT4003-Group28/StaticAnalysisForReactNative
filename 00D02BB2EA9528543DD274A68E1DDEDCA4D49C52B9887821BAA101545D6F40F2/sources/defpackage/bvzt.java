package defpackage;
/* renamed from: bvzt  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bvzt implements dbrn {
    static final dbrn a = new bvzt();

    private bvzt() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cora coraVar = (cora) obj;
        if (coraVar == null) {
            return dmfe.e;
        }
        dmfd bZ = dmfe.e.bZ();
        boolean e = coraVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfe dmfeVar = (dmfe) bZ.b;
        dmfeVar.a |= 1;
        dmfeVar.b = e;
        boolean h = coraVar.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfe dmfeVar2 = (dmfe) bZ.b;
        dmfeVar2.a |= 2;
        dmfeVar2.c = h;
        boolean g = coraVar.g();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfe dmfeVar3 = (dmfe) bZ.b;
        dmfeVar3.a |= 4;
        dmfeVar3.d = g;
        return bZ.bK();
    }
}
