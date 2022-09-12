package defpackage;
/* compiled from: PG */
/* renamed from: kug  reason: default package */
/* loaded from: classes7.dex */
class kug extends dbrh<ddli, dhmq> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddli b(dhmq dhmqVar) {
        dhmq dhmqVar2 = dhmqVar;
        ddlh bZ = ddli.c.bZ();
        if ((dhmqVar2.a & 1) != 0) {
            boolean z = dhmqVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddli ddliVar = (ddli) bZ.b;
            ddliVar.a |= 1;
            ddliVar.b = z;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmq c(ddli ddliVar) {
        ddli ddliVar2 = ddliVar;
        dhmp bZ = dhmq.c.bZ();
        if ((ddliVar2.a & 1) != 0) {
            boolean z = ddliVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmq dhmqVar = (dhmq) bZ.b;
            dhmqVar.a |= 1;
            dhmqVar.b = z;
        }
        return bZ.bK();
    }
}
