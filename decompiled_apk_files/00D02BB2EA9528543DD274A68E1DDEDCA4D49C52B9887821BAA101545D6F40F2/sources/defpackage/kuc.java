package defpackage;
/* compiled from: PG */
/* renamed from: kuc  reason: default package */
/* loaded from: classes7.dex */
class kuc extends dbrh<ddkx, dhmf> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddkx b(dhmf dhmfVar) {
        dhmf dhmfVar2 = dhmfVar;
        ddkw bZ = ddkx.e.bZ();
        if ((dhmfVar2.a & 1) != 0) {
            boolean z = dhmfVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkx ddkxVar = (ddkx) bZ.b;
            ddkxVar.a |= 1;
            ddkxVar.b = z;
        }
        bZ.a(dhmfVar2.c);
        if ((dhmfVar2.a & 2) != 0) {
            boolean z2 = dhmfVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkx ddkxVar2 = (ddkx) bZ.b;
            ddkxVar2.a |= 2;
            ddkxVar2.d = z2;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmf c(ddkx ddkxVar) {
        ddkx ddkxVar2 = ddkxVar;
        dhme bZ = dhmf.e.bZ();
        if ((ddkxVar2.a & 1) != 0) {
            boolean z = ddkxVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmf dhmfVar = (dhmf) bZ.b;
            dhmfVar.a |= 1;
            dhmfVar.b = z;
        }
        dsrf dsrfVar = ddkxVar2.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhmf dhmfVar2 = (dhmf) bZ.b;
        dsrf dsrfVar2 = dhmfVar2.c;
        if (!dsrfVar2.a()) {
            dhmfVar2.c = dsqw.cg(dsrfVar2);
        }
        dsod.bv(dsrfVar, dhmfVar2.c);
        if ((ddkxVar2.a & 2) != 0) {
            boolean z2 = ddkxVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmf dhmfVar3 = (dhmf) bZ.b;
            dhmfVar3.a |= 2;
            dhmfVar3.d = z2;
        }
        return bZ.bK();
    }
}
