package defpackage;
/* compiled from: PG */
/* renamed from: acnc  reason: default package */
/* loaded from: classes.dex */
public final class acnc implements Runnable {
    final /* synthetic */ acnf a;
    private final /* synthetic */ int b;

    public acnc(acnf acnfVar) {
        this.a = acnfVar;
    }

    public /* synthetic */ acnc(acnf acnfVar, int i) {
        this.b = i;
        this.a = acnfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            acnf acnfVar = this.a;
            synchronized (acnfVar.q) {
                if (acnfVar.p) {
                    return;
                }
                acnfVar.m.g(acnfVar.n.c);
                return;
            }
        }
        acnf acnfVar2 = this.a;
        abta abtaVar = acnfVar2.e;
        abry a = acnfVar2.d.a();
        synchronized (abtaVar.b) {
            abtaVar.a(a);
        }
    }
}
