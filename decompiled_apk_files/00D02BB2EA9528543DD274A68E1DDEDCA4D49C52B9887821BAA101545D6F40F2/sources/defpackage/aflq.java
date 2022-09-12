package defpackage;
/* compiled from: PG */
/* renamed from: aflq  reason: default package */
/* loaded from: classes2.dex */
public final class aflq implements Runnable {
    final /* synthetic */ duqr a;
    final /* synthetic */ aflr b;

    public aflq(aflr aflrVar, duqr duqrVar) {
        this.b = aflrVar;
        this.a = duqrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afwo l = this.b.b.a().l();
        duqr duqrVar = this.a;
        if ((duqrVar.a & 16) != 0) {
            l.g(duqrVar.f);
        }
        duqr duqrVar2 = this.a;
        if ((duqrVar2.a & 2) != 0) {
            l.i(duqrVar2.c);
        }
        duqr duqrVar3 = this.a;
        if ((duqrVar3.a & 4) != 0) {
            l.j(duqrVar3.d);
        }
        duqr duqrVar4 = this.a;
        if ((duqrVar4.a & 8) != 0) {
            l.f(duqrVar4.e);
        }
        duqr duqrVar5 = this.a;
        if ((duqrVar5.a & 1) != 0) {
            akpm akpmVar = this.b.a;
            dhjx dhjxVar = duqrVar5.b;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            alao.d(akpmVar, alad.c(dhjxVar));
        }
    }
}
