package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckmx  reason: default package */
/* loaded from: classes4.dex */
public class ckmx extends dbrh<dfwp, dggg> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dfwp b(dggg dgggVar) {
        dggg dgggVar2 = dgggVar;
        dfwo bZ = dfwp.d.bZ();
        if ((dgggVar2.a & 1) != 0) {
            dbrh<dgge, dfwn> k = cknh.d().k();
            dgge b = dgge.b(dgggVar2.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            dfwn NV = k.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwp dfwpVar = (dfwp) bZ.b;
            dfwpVar.b = NV.l;
            dfwpVar.a |= 1;
        }
        if ((dgggVar2.a & 2) != 0) {
            String str = dgggVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfwp dfwpVar2 = (dfwp) bZ.b;
            str.getClass();
            dfwpVar2.a |= 2;
            dfwpVar2.c = str;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dggg c(dfwp dfwpVar) {
        dfwp dfwpVar2 = dfwpVar;
        dggf bZ = dggg.d.bZ();
        if ((dfwpVar2.a & 1) != 0) {
            dbrh<dfwn, dgge> d = cknh.d();
            dfwn b = dfwn.b(dfwpVar2.b);
            if (b == null) {
                b = dfwn.IMAGE_UNKNOWN;
            }
            dgge NV = d.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar = (dggg) bZ.b;
            dgggVar.b = NV.l;
            dgggVar.a |= 1;
        }
        if ((dfwpVar2.a & 2) != 0) {
            String str = dfwpVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar2 = (dggg) bZ.b;
            str.getClass();
            dgggVar2.a |= 2;
            dgggVar2.c = str;
        }
        return bZ.bK();
    }
}
