package defpackage;
/* compiled from: PG */
/* renamed from: rnr  reason: default package */
/* loaded from: classes4.dex */
final class rnr implements Runnable {
    final /* synthetic */ rns a;
    private final /* synthetic */ int b;

    public rnr(rns rnsVar) {
        this.a = rnsVar;
    }

    public rnr(rns rnsVar, int i) {
        this.b = i;
        this.a = rnsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.i = null;
            return;
        }
        rns rnsVar = this.a;
        rnsVar.d = rnsVar.i;
    }
}
