package defpackage;
/* compiled from: PG */
/* renamed from: cxfy  reason: default package */
/* loaded from: classes5.dex */
final class cxfy implements cxfz<eaak> {
    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void a(eaak eaakVar, Long l) {
        eaak eaakVar2 = eaakVar;
        if (l == null) {
            if (eaakVar2.c) {
                eaakVar2.bF();
                eaakVar2.c = false;
            }
            eaam eaamVar = (eaam) eaakVar2.b;
            eaam eaamVar2 = eaam.k;
            eaamVar.a &= -3;
            eaamVar.c = 0L;
            return;
        }
        long longValue = l.longValue();
        if (eaakVar2.c) {
            eaakVar2.bF();
            eaakVar2.c = false;
        }
        eaam eaamVar3 = (eaam) eaakVar2.b;
        eaam eaamVar4 = eaam.k;
        eaamVar3.a |= 2;
        eaamVar3.c = longValue;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String b(eaak eaakVar) {
        return ((eaam) eaakVar.b).d;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String c(eaak eaakVar) {
        return ((eaam) eaakVar.b).b;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void d(eaak eaakVar) {
        eaak eaakVar2 = eaakVar;
        if (eaakVar2.c) {
            eaakVar2.bF();
            eaakVar2.c = false;
        }
        eaam eaamVar = (eaam) eaakVar2.b;
        eaam eaamVar2 = eaam.k;
        eaamVar.a &= -5;
        eaamVar.d = eaam.k.d;
    }
}
