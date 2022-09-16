package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kub  reason: default package */
/* loaded from: classes7.dex */
public class kub extends dbrh<ddkv, dhmd> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddkv b(dhmd dhmdVar) {
        dhmd dhmdVar2 = dhmdVar;
        ddku bZ = ddkv.c.bZ();
        if ((dhmdVar2.a & 1) != 0) {
            dbrh<dhmb, ddkt> k = kuk.d().k();
            dhmb b = dhmb.b(dhmdVar2.b);
            if (b == null) {
                b = dhmb.UNKNOWN_ACTIVITY_TYPE;
            }
            ddkt NV = k.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkv ddkvVar = (ddkv) bZ.b;
            ddkvVar.b = NV.d;
            ddkvVar.a |= 1;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmd c(ddkv ddkvVar) {
        ddkv ddkvVar2 = ddkvVar;
        dhmc bZ = dhmd.c.bZ();
        if ((ddkvVar2.a & 1) != 0) {
            dbrh<ddkt, dhmb> d = kuk.d();
            ddkt b = ddkt.b(ddkvVar2.b);
            if (b == null) {
                b = ddkt.UNKNOWN_ACTIVITY_TYPE;
            }
            dhmb NV = d.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmd dhmdVar = (dhmd) bZ.b;
            dhmdVar.b = NV.d;
            dhmdVar.a |= 1;
        }
        return bZ.bK();
    }
}
