package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: chhr  reason: default package */
/* loaded from: classes4.dex */
public final class chhr {
    public final gga a;
    public final bwqv b;
    public final chix c;
    public final chlt d;
    public final btvo e;
    private final bhhf f;

    public chhr(gga ggaVar, bwqv bwqvVar, chix chixVar, chlt chltVar, btvo btvoVar, bhhf bhhfVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = chixVar;
        this.d = chltVar;
        this.e = btvoVar;
        this.f = bhhfVar;
    }

    @Deprecated
    public final void a(djgl djglVar, ddho ddhoVar, ddho ddhoVar2) {
        b(djglVar, ddhoVar, ddhoVar2, null);
    }

    @Deprecated
    public final void b(djgl djglVar, ddho ddhoVar, ddho ddhoVar2, @dzsi ilo iloVar) {
        ggg gggVar;
        if (!c(iloVar)) {
            return;
        }
        gga ggaVar = this.a;
        dbsg<chit> b = chix.b(djglVar);
        if (b.a()) {
            chit b2 = b.b();
            chin bZ = chir.c.bZ();
            if (dtyc.aG.equals(ddhoVar) || dtyc.aE.equals(ddhoVar) || dtxy.oZ.equals(ddhoVar)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chir chirVar = (chir) bZ.b;
                chirVar.b = 0;
                chirVar.a |= 1;
            }
            dsqp dsqpVar = (dsqp) b2.cu(5);
            dsqpVar.bC(b2);
            chis chisVar = (chis) dsqpVar;
            if (chisVar.c) {
                chisVar.bF();
                chisVar.c = false;
            }
            chit chitVar = (chit) chisVar.b;
            chir bK = bZ.bK();
            chit chitVar2 = chit.i;
            bK.getClass();
            chitVar.f = bK;
            chitVar.a |= 8;
            gggVar = chbx.g(chisVar.bK(), this.b, bwrs.a(iloVar));
        } else {
            chbw chbwVar = new chbw();
            Bundle bundle = new Bundle();
            chbw.g(bundle, djglVar, ddhoVar, ddhoVar2, iloVar);
            chbwVar.B(bundle);
            gggVar = chbwVar;
        }
        ggaVar.D(gggVar);
    }

    @Deprecated
    public final boolean c(@dzsi ilo iloVar) {
        return !this.a.isFinishing() && !this.f.a(iloVar);
    }
}
