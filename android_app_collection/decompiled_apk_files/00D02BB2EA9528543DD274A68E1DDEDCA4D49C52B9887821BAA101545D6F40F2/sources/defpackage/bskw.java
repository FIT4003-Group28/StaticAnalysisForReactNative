package defpackage;
/* compiled from: PG */
/* renamed from: bskw  reason: default package */
/* loaded from: classes4.dex */
class bskw implements dbrn<djmf, dfpe> {
    public static final dfpe b(djmf djmfVar) {
        djmb djmbVar;
        djme djmeVar;
        dfox bZ = dfpe.c.bZ();
        if (djmfVar.a == 1 && djmc.a(1) == 2) {
            dbrn<djme, dfpd> dbrnVar = bslt.a;
            if (djmfVar.a == 1) {
                djmeVar = djme.b(((Integer) djmfVar.b).intValue());
                if (djmeVar == null) {
                    djmeVar = djme.UNKNOWN_SEMANTIC_CONSTRAINT;
                }
            } else {
                djmeVar = djme.UNKNOWN_SEMANTIC_CONSTRAINT;
            }
            dfpd a = dbrnVar.a(djmeVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpe dfpeVar = (dfpe) bZ.b;
            dfpeVar.b = Integer.valueOf(a.d);
            dfpeVar.a = 1;
        }
        if (djmfVar.a == 4 && djmc.a(4) == 5) {
            dbrn<djmb, dfpb> dbrnVar2 = bslt.b;
            if (djmfVar.a == 4) {
                djmbVar = (djmb) djmfVar.b;
            } else {
                djmbVar = djmb.e;
            }
            dfpb a2 = dbrnVar2.a(djmbVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpe dfpeVar2 = (dfpe) bZ.b;
            a2.getClass();
            dfpeVar2.b = a2;
            dfpeVar2.a = 2;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpe a(djmf djmfVar) {
        throw null;
    }
}
