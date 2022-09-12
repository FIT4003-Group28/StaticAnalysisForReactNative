package defpackage;
/* compiled from: PG */
/* renamed from: wjz  reason: default package */
/* loaded from: classes7.dex */
class wjz implements dbrn<dopa, djyu> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ djyu a(dopa dopaVar) {
        dopa dopaVar2 = dopaVar;
        djyt bZ = djyu.c.bZ();
        if ((dopaVar2.a & 1) != 0) {
            int i = dopaVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyu djyuVar = (djyu) bZ.b;
            djyuVar.a |= 1;
            djyuVar.b = i;
        }
        return bZ.bK();
    }
}
