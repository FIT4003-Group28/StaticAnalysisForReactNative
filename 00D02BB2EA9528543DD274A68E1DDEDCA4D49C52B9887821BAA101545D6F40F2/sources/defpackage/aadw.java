package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aadw  reason: default package */
/* loaded from: classes2.dex */
public final class aadw {
    public aacn a;
    private final aadv b;

    public aadw(aadv aadvVar, aacn aacnVar) {
        this.b = aadvVar;
        this.a = aacnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bsjm a(aaco aacoVar) {
        bsjm bsjmVar = new bsjm();
        if (aacoVar.a() && aacoVar.b().a()) {
            djnc djncVar = aacoVar.b().b().c;
            if (djncVar == null) {
                djncVar = djnc.b;
            }
            djnk djnkVar = djncVar.a;
            if (djnkVar == null) {
                djnkVar = djnk.f;
            }
            bsjmVar.a(djnkVar);
        }
        return bsjmVar;
    }

    public final void b(bsjm bsjmVar, cjqm cjqmVar) {
        dils a = this.a.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dilr dilrVar = (dilr) dsqpVar;
        djmw bZ = djmy.e.bZ();
        djmy djmyVar = ((dils) dilrVar.b).d;
        if (djmyVar == null) {
            djmyVar = djmy.e;
        }
        djna djnaVar = djmyVar.d;
        if (djnaVar == null) {
            djnaVar = djna.b;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmy djmyVar2 = (djmy) bZ.b;
        djnaVar.getClass();
        djmyVar2.d = djnaVar;
        djmyVar2.a |= 4;
        djmy djmyVar3 = (djmy) bZ.b;
        djmyVar3.c = 2;
        djmyVar3.a |= 2;
        djnk b = bsjmVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmy djmyVar4 = (djmy) bZ.b;
        b.getClass();
        djmyVar4.b = b;
        djmyVar4.a |= 1;
        djmy bK = bZ.bK();
        if (dilrVar.c) {
            dilrVar.bF();
            dilrVar.c = false;
        }
        dils dilsVar = (dils) dilrVar.b;
        bK.getClass();
        dilsVar.d = bK;
        dilsVar.a |= 4;
        dnqg bZ2 = dnqh.p.bZ();
        int i = ddda.cy.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ2.b;
            b2.getClass();
            dnqhVar2.a = 2 | dnqhVar2.a;
            dnqhVar2.c = b2;
            doeh bZ3 = doei.d.bZ();
            String b3 = cjqmVar.a().b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            doei doeiVar = (doei) bZ3.b;
            b3.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b3;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ2.b;
            doei bK2 = bZ3.bK();
            bK2.getClass();
            dnqhVar3.m = bK2;
            dnqhVar3.a |= 262144;
        }
        if (dilrVar.c) {
            dilrVar.bF();
            dilrVar.c = false;
        }
        dils dilsVar2 = (dils) dilrVar.b;
        dnqh bK3 = bZ2.bK();
        bK3.getClass();
        dilsVar2.g = bK3;
        dilsVar2.a |= 64;
        this.b.b(new aacn(dilrVar.bK()));
    }
}
