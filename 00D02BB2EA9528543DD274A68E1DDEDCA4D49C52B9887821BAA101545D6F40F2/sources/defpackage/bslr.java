package defpackage;
/* compiled from: PG */
/* renamed from: bslr  reason: default package */
/* loaded from: classes4.dex */
final class bslr extends bskx {
    static final dbrn<djlz, dfpa> a = new bslq();
    static final dbrn<djjv, duha> b = new bslo();
    static final dbrn<dpol, duhc> c = new bslp();

    @Override // defpackage.bskx
    public final void b(djmb djmbVar, dfoy dfoyVar) {
        duhj bZ = duhk.e.bZ();
        int intValue = djmbVar.c == 4 ? ((Integer) djmbVar.d).intValue() : 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((duhk) bZ.b).a = intValue;
        if (dfoyVar.c) {
            dfoyVar.bF();
            dfoyVar.c = false;
        }
        dfpb dfpbVar = (dfpb) dfoyVar.b;
        duhk bK = bZ.bK();
        dfpb dfpbVar2 = dfpb.e;
        bK.getClass();
        dfpbVar.d = bK;
        dfpbVar.c = 4;
    }
}
