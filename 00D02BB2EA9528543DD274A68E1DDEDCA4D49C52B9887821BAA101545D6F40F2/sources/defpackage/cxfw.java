package defpackage;
/* compiled from: PG */
/* renamed from: cxfw  reason: default package */
/* loaded from: classes5.dex */
final class cxfw implements cxfz<eacc> {
    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void a(eacc eaccVar, Long l) {
        eacc eaccVar2 = eaccVar;
        if (l == null) {
            if (eaccVar2.c) {
                eaccVar2.bF();
                eaccVar2.c = false;
            }
            eacd eacdVar = (eacd) eaccVar2.b;
            eacd eacdVar2 = eacd.u;
            eacdVar.a &= -3;
            eacdVar.c = 0L;
            return;
        }
        long longValue = l.longValue();
        if (eaccVar2.c) {
            eaccVar2.bF();
            eaccVar2.c = false;
        }
        eacd eacdVar3 = (eacd) eaccVar2.b;
        eacd eacdVar4 = eacd.u;
        eacdVar3.a |= 2;
        eacdVar3.c = longValue;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String b(eacc eaccVar) {
        return ((eacd) eaccVar.b).d;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String c(eacc eaccVar) {
        return ((eacd) eaccVar.b).o;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void d(eacc eaccVar) {
        eacc eaccVar2 = eaccVar;
        if (eaccVar2.c) {
            eaccVar2.bF();
            eaccVar2.c = false;
        }
        eacd eacdVar = (eacd) eaccVar2.b;
        eacd eacdVar2 = eacd.u;
        eacdVar.a &= -5;
        eacdVar.d = eacd.u.d;
    }
}
