package defpackage;
/* compiled from: PG */
/* renamed from: bskx  reason: default package */
/* loaded from: classes4.dex */
abstract class bskx implements dbrn<djmb, dfpb> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpb a(djmb djmbVar) {
        djlz djlzVar;
        dpol dpolVar;
        djmb djmbVar2 = djmbVar;
        dfoy bZ = dfpb.e.bZ();
        if (djmbVar2.a == 1 && djlx.a(1) == 2) {
            duha a = bslr.b.a(djmbVar2.a == 1 ? (djjv) djmbVar2.b : djjv.e);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpb dfpbVar = (dfpb) bZ.b;
            a.getClass();
            dfpbVar.b = a;
            dfpbVar.a = 1;
        }
        if (djmbVar2.a == 2 && djlx.a(2) == 3) {
            dbrn<dpol, duhc> dbrnVar = bslr.c;
            if (djmbVar2.a != 2 || (dpolVar = dpol.b(((Integer) djmbVar2.b).intValue())) == null) {
                dpolVar = dpol.DAY_OF_WEEK_UNSPECIFIED;
            }
            duhc a2 = dbrnVar.a(dpolVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpb dfpbVar2 = (dfpb) bZ.b;
            dfpbVar2.b = Integer.valueOf(a2.a());
            dfpbVar2.a = 2;
        }
        if (djmbVar2.c == 3 && djma.a(3) == 4) {
            dbrn<djlz, dfpa> dbrnVar2 = bslr.a;
            if (djmbVar2.c != 3 || (djlzVar = djlz.b(((Integer) djmbVar2.d).intValue())) == null) {
                djlzVar = djlz.UNKNOWN_SEMANTIC_TIME;
            }
            dfpa a3 = dbrnVar2.a(djlzVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpb dfpbVar3 = (dfpb) bZ.b;
            dfpbVar3.d = Integer.valueOf(a3.c);
            dfpbVar3.c = 3;
        }
        if (djmbVar2.c == 4 && djma.a(4) == 5) {
            b(djmbVar2, bZ);
        }
        return bZ.bK();
    }

    public abstract void b(djmb djmbVar, dfoy dfoyVar);
}
