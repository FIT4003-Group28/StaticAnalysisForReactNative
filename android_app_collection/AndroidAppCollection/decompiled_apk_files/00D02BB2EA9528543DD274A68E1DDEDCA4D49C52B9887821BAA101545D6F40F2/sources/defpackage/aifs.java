package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifs  reason: default package */
/* loaded from: classes2.dex */
public final class aifs implements Runnable {
    final /* synthetic */ aifu a;

    public aifs(aifu aifuVar) {
        this.a = aifuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aifw aifwVar;
        alfa alfaVar;
        bvrj.UI_THREAD.c();
        synchronized (this.a.a) {
            aifwVar = this.a.g;
        }
        if (aifwVar == null) {
            this.a.c.a().d();
            aifu aifuVar = this.a;
            vtw vtwVar = aifuVar.e;
            if (vtwVar != null) {
                aifuVar.b.R(vtwVar);
                this.a.e = null;
            }
            aifu aifuVar2 = this.a;
            vue vueVar = aifuVar2.f;
            if (vueVar == null) {
                return;
            }
            aifuVar2.b.R(vueVar);
            this.a.f = null;
            return;
        }
        aifu aifuVar3 = this.a;
        vue vueVar2 = aifuVar3.f;
        if (vueVar2 != null) {
            vueVar2.b(aifuVar3.b.r.b());
        }
        vut I = vuv.I();
        I.A(amuh.d(aifwVar.a()));
        I.o(aifwVar.a().ag());
        I.H(albo.a);
        I.E(false);
        if (aifwVar.b()) {
            alfaVar = alfa.SHOW_ALL;
        } else {
            alfaVar = alfa.SHOW_NONE;
        }
        I.Q(alfaVar);
        I.F(false);
        I.J(aifwVar.d());
        this.a.c.a().c(I.O(), this.a.h);
    }
}
