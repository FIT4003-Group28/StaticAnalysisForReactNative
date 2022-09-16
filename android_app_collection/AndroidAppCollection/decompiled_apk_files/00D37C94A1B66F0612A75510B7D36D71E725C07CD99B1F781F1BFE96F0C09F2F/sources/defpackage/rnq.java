package defpackage;
/* compiled from: PG */
/* renamed from: rnq  reason: default package */
/* loaded from: classes4.dex */
final class rnq implements Runnable {
    final /* synthetic */ rnm a;
    final /* synthetic */ long b;
    final /* synthetic */ rns c;

    public rnq(rns rnsVar, rnm rnmVar, long j) {
        this.c = rnsVar;
        this.a = rnmVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.s(this.a, false, this.b);
        rns rnsVar = this.c;
        rnsVar.d = null;
        rnsVar.l().w(null);
    }
}
