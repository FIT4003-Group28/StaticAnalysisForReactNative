package defpackage;
/* compiled from: PG */
/* renamed from: bskz  reason: default package */
/* loaded from: classes4.dex */
abstract class bskz implements dbrn<djmr, dfpk> {
    public abstract void b(djmr djmrVar, dfpf dfpfVar);

    @Override // defpackage.dbrn
    /* renamed from: c */
    public final dfpk a(djmr djmrVar) {
        djmq djmqVar;
        dfpf bZ = dfpk.c.bZ();
        if (djmrVar.a == 1 && djmo.a(1) == 2) {
            dbrn<djmq, dfpj> dbrnVar = bslv.a;
            if (djmrVar.a == 1) {
                djmqVar = djmq.b(((Integer) djmrVar.b).intValue());
                if (djmqVar == null) {
                    djmqVar = djmq.UNKNOWN_SEMANTIC_LEVEL;
                }
            } else {
                djmqVar = djmq.UNKNOWN_SEMANTIC_LEVEL;
            }
            dfpj a = dbrnVar.a(djmqVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfpk dfpkVar = (dfpk) bZ.b;
            dfpkVar.b = Integer.valueOf(a.d);
            dfpkVar.a = 1;
        }
        if (djmrVar.a == 2 && djmo.a(2) == 3) {
            b(djmrVar, bZ);
        }
        return bZ.bK();
    }
}
