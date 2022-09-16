package defpackage;
/* renamed from: cynr  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cynr implements dbrn {
    static final dbrn a = new cynr();

    private cynr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dues duesVar = (dues) obj;
        cyjj bZ = cyjn.d.bZ();
        dufm dufmVar = duesVar.a;
        if (dufmVar == null) {
            dufmVar = dufm.g;
        }
        cyjt g = cyob.g(dufmVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        g.getClass();
        ((cyjn) bZ.b).a = g;
        cyjk bZ2 = cyjm.c.bZ();
        duer duerVar = duesVar.b;
        if (duerVar == null) {
            duerVar = duer.c;
        }
        long j = duerVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyjm) bZ2.b).a = j;
        duer duerVar2 = duesVar.b;
        if (duerVar2 == null) {
            duerVar2 = duer.c;
        }
        int a2 = dueq.a(duerVar2.b);
        if (a2 == 0) {
            a2 = 1;
        }
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        int i = a2 - 1;
        int i2 = 4;
        if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 2 : 6 : 5;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyjm) bZ2.b).b = cyjl.a(i2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjm bK = bZ2.bK();
        bK.getClass();
        ((cyjn) bZ.b).b = bK;
        String str = duesVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((cyjn) bZ.b).c = str;
        return bZ.bK();
    }
}
