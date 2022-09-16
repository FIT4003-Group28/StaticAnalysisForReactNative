package defpackage;
/* renamed from: thy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class thy implements dbrn {
    static final dbrn a = new thy();

    private thy() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqvh dqvhVar = (dqvh) obj;
        dpgr bZ = dpgs.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpgs dpgsVar = (dpgs) bZ.b;
        dpgsVar.b = dqvhVar.h;
        dpgsVar.a |= 1;
        return bZ.bK();
    }
}
