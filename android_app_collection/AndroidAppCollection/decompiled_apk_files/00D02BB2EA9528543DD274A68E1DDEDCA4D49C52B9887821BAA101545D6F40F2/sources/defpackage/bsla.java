package defpackage;
/* compiled from: PG */
/* renamed from: bsla  reason: default package */
/* loaded from: classes4.dex */
class bsla implements dbrn<djny, dfpu> {
    public static final dfpu b(djny djnyVar) {
        djnu djnuVar;
        djnx djnxVar;
        dfpp bZ = dfpu.c.bZ();
        if (djnyVar.a == 1 && djnv.a(1) == 2) {
            dbrn<djnx, dfpt> dbrnVar = bsly.a;
            if (djnyVar.a == 1) {
                djnxVar = djnx.b(((Integer) djnyVar.b).intValue());
                if (djnxVar == null) {
                    djnxVar = djnx.UNKNOWN_SEMANTIC_RATING;
                }
            } else {
                djnxVar = djnx.UNKNOWN_SEMANTIC_RATING;
            }
            dfpt a = dbrnVar.a(djnxVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpu dfpuVar = (dfpu) bZ.b;
            dfpuVar.b = Integer.valueOf(a.c);
            dfpuVar.a = 1;
        }
        if (djnyVar.a == 2 && djnv.a(2) == 3) {
            dbrn<djnu, dfpr> dbrnVar2 = bsly.b;
            if (djnyVar.a == 2) {
                djnuVar = djnu.b(((Integer) djnyVar.b).intValue());
                if (djnuVar == null) {
                    djnuVar = djnu.UNKNOWN_NUMERIC_RATING;
                }
            } else {
                djnuVar = djnu.UNKNOWN_NUMERIC_RATING;
            }
            dfpr a2 = dbrnVar2.a(djnuVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpu dfpuVar2 = (dfpu) bZ.b;
            dfpuVar2.b = Integer.valueOf(a2.l);
            dfpuVar2.a = 2;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpu a(djny djnyVar) {
        throw null;
    }
}
