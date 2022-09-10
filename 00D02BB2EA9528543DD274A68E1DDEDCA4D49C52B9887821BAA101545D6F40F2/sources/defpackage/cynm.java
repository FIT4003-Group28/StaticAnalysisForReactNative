package defpackage;
/* renamed from: cynm  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cynm implements dbrn {
    static final dbrn a = new cynm();

    private cynm() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        duet duetVar = (duet) obj;
        cyji bZ = cyjo.g.bZ();
        String str = duetVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((cyjo) bZ.b).a = str;
        String a2 = cyez.a(duetVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a2.getClass();
        ((cyjo) bZ.b).b = a2;
        dufm dufmVar = duetVar.a;
        if (dufmVar == null) {
            dufmVar = dufm.g;
        }
        cyjt g = cyob.g(dufmVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        g.getClass();
        ((cyjo) bZ.b).d = g;
        dcbg s = dcbg.b(duetVar.c).s(cynr.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjo cyjoVar = (cyjo) bZ.b;
        dsrj<cyjn> dsrjVar = cyjoVar.e;
        if (!dsrjVar.a()) {
            cyjoVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, cyjoVar.e);
        dayn daynVar = duetVar.d;
        if (daynVar == null) {
            daynVar = dayn.c;
        }
        boolean z = daynVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjo) bZ.b).c = z;
        dayn daynVar2 = duetVar.d;
        if (daynVar2 == null) {
            daynVar2 = dayn.c;
        }
        boolean z2 = daynVar2.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjo) bZ.b).f = z2;
        return bZ.bK();
    }
}
