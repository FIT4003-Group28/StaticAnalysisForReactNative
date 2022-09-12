package defpackage;
/* compiled from: PG */
/* renamed from: dcf  reason: default package */
/* loaded from: classes5.dex */
class dcf extends dbrh<dknu, dfih> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dknu b(dfih dfihVar) {
        dfih dfihVar2 = dfihVar;
        dknt bZ = dknu.f.bZ();
        if ((dfihVar2.a & 1) != 0) {
            float f = dfihVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dknu dknuVar = (dknu) bZ.b;
            dknuVar.a |= 1;
            dknuVar.b = f;
        }
        if ((dfihVar2.a & 2) != 0) {
            float f2 = dfihVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dknu dknuVar2 = (dknu) bZ.b;
            dknuVar2.a |= 2;
            dknuVar2.c = f2;
        }
        if ((dfihVar2.a & 4) != 0) {
            float f3 = dfihVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dknu dknuVar3 = (dknu) bZ.b;
            dknuVar3.a |= 4;
            dknuVar3.d = f3;
        }
        if ((dfihVar2.a & 8) != 0) {
            float f4 = dfihVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dknu dknuVar4 = (dknu) bZ.b;
            dknuVar4.a |= 8;
            dknuVar4.e = f4;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dfih c(dknu dknuVar) {
        dknu dknuVar2 = dknuVar;
        dfig bZ = dfih.f.bZ();
        if ((dknuVar2.a & 1) != 0) {
            float f = dknuVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfih dfihVar = (dfih) bZ.b;
            dfihVar.a |= 1;
            dfihVar.b = f;
        }
        if ((dknuVar2.a & 2) != 0) {
            float f2 = dknuVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfih dfihVar2 = (dfih) bZ.b;
            dfihVar2.a |= 2;
            dfihVar2.c = f2;
        }
        if ((dknuVar2.a & 4) != 0) {
            float f3 = dknuVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfih dfihVar3 = (dfih) bZ.b;
            dfihVar3.a |= 4;
            dfihVar3.d = f3;
        }
        if ((dknuVar2.a & 8) != 0) {
            float f4 = dknuVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfih dfihVar4 = (dfih) bZ.b;
            dfihVar4.a |= 8;
            dfihVar4.e = f4;
        }
        return bZ.bK();
    }
}
