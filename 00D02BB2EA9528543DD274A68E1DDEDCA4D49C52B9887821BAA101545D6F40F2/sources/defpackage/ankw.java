package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ankw  reason: default package */
/* loaded from: classes2.dex */
public final class ankw implements anhp {
    private static final dnqh a;
    private final buxv b;
    private final ckcw c;
    private final Executor d;

    static {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.aB.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        a = bZ.bK();
    }

    public ankw(buxv buxvVar, ckcw ckcwVar, Executor executor) {
        this.b = buxvVar;
        this.c = ckcwVar;
        this.d = executor;
    }

    @Override // defpackage.anhp
    public final void a(dwjd dwjdVar, akqq akqqVar, int i, btzi<dwjd, dwjf> btziVar) {
        ((ckco) this.c.a(ckkc.e)).a(i - 1);
        if ((dwjdVar.a & 32) == 0) {
            dwjc ca = dwjd.i.ca(dwjdVar);
            dnqh dnqhVar = a;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwjd dwjdVar2 = (dwjd) ca.b;
            dnqhVar.getClass();
            dwjdVar2.e = dnqhVar;
            dwjdVar2.a |= 32;
            dwjdVar = ca.bK();
        }
        buac buacVar = ((buxw) this.b).c;
        btyq btyqVar = buacVar.a().a;
        dsqp dsqpVar = (dsqp) btyqVar.cu(5);
        dsqpVar.bC(btyqVar);
        btyp btypVar = (btyp) dsqpVar;
        if (btypVar.c) {
            btypVar.bF();
            btypVar.c = false;
        }
        btyq btyqVar2 = (btyq) btypVar.b;
        btyqVar2.a |= 2;
        btyqVar2.c = false;
        buacVar.a = btypVar.bK();
        buacVar.f = new ankv(akqqVar);
        ((buxw) this.b).b().b(dwjdVar, btziVar, this.d);
    }
}
