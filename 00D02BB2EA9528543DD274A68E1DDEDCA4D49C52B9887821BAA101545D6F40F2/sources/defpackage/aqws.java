package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqws  reason: default package */
/* loaded from: classes2.dex */
public class aqws extends dbrh<dgao, aqxp> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgao b(aqxp aqxpVar) {
        dgal bZ = dgao.c.bZ();
        dbrh<aqxo, dgan> k = aqwz.a.k();
        aqxo b = aqxo.b(aqxpVar.a);
        if (b == null) {
            b = aqxo.UNRECOGNIZED;
        }
        dgan NV = k.NV(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgao dgaoVar = (dgao) bZ.b;
        dgaoVar.b = NV.f;
        dgaoVar.a |= 1;
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxp c(dgao dgaoVar) {
        dgao dgaoVar2 = dgaoVar;
        aqxn bZ = aqxp.b.bZ();
        if ((dgaoVar2.a & 1) != 0) {
            dbrh<dgan, aqxo> dbrhVar = aqwz.a;
            dgan b = dgan.b(dgaoVar2.b);
            if (b == null) {
                b = dgan.STAGE_UNSPECIFIED;
            }
            aqxo NV = dbrhVar.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((aqxp) bZ.b).a = NV.a();
        }
        return bZ.bK();
    }
}
