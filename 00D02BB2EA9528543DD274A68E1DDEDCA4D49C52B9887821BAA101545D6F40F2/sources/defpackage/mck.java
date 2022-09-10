package defpackage;
/* compiled from: PG */
/* renamed from: mck  reason: default package */
/* loaded from: classes7.dex */
public final class mck {
    public final ldm a;
    public final aryr b;
    public final akra c;

    public mck(ldm ldmVar, aryr aryrVar, akra akraVar) {
        this.a = ldmVar;
        this.b = aryrVar;
        dbsk.s(akraVar);
        this.c = akraVar;
    }

    public static mck a(ilo iloVar, akra akraVar, cqat cqatVar, aluu aluuVar, boolean z, aryq aryqVar) {
        dbsg<Integer> dbsgVar;
        ldm a = ldm.a(iloVar);
        if (iloVar.cu()) {
            dbsgVar = dbsg.i(Integer.valueOf(iloVar.cv()));
        } else {
            dbsgVar = dbpy.a;
        }
        aryo k = aryr.k();
        k.a = iloVar.q();
        k.c = iloVar.B();
        dvxz dvxzVar = iloVar.h().s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        k.d = dvxzVar;
        k.e = akraVar;
        k.f = dbsgVar;
        k.g = iloVar.ai();
        k.h = aryp.SMALL;
        k.k = iloVar.al().b(cqatVar);
        k.l = iloVar.ab();
        k.m = iloVar.aa();
        k.n = iloVar.ae() ? Float.valueOf(iloVar.af()) : null;
        k.o = iloVar.as();
        k.p = iloVar.bY();
        k.b();
        k.r = iloVar.cz();
        k.s = aluuVar;
        k.j = z;
        k.t = aryqVar;
        return new mck(a, k.a(), akraVar);
    }
}
