package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypl  reason: default package */
/* loaded from: classes6.dex */
public final class dypl implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dypz b;

    public dypl(dypz dypzVar, dyjb dyjbVar) {
        this.b = dypzVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.p.a == dyfk.SHUTDOWN) {
            return;
        }
        dypz dypzVar = this.b;
        dypzVar.q = this.a;
        dysm dysmVar = dypzVar.o;
        dypz dypzVar2 = this.b;
        dymc dymcVar = dypzVar2.n;
        dypzVar2.o = null;
        this.b.n = null;
        this.b.c(dyfk.SHUTDOWN);
        this.b.f.a();
        if (this.b.l.isEmpty()) {
            this.b.f();
        }
        dypz dypzVar3 = this.b;
        dypzVar3.e.c();
        dyjh dyjhVar = dypzVar3.i;
        if (dyjhVar != null) {
            dyjhVar.a();
            dypzVar3.i = null;
            dypzVar3.r = null;
        }
        dyjh dyjhVar2 = this.b.j;
        if (dyjhVar2 != null) {
            dyjhVar2.a();
            this.b.k.e(this.a);
            dypz dypzVar4 = this.b;
            dypzVar4.j = null;
            dypzVar4.k = null;
        }
        if (dysmVar != null) {
            dysmVar.e(this.a);
        }
        if (dymcVar == null) {
            return;
        }
        dymcVar.e(this.a);
    }
}
