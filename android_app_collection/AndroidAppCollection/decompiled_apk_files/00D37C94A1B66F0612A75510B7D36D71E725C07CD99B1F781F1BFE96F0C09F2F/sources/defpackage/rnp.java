package defpackage;
/* compiled from: PG */
/* renamed from: rnp  reason: default package */
/* loaded from: classes4.dex */
final class rnp implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rns b;

    public rnp(rns rnsVar, long j) {
        this.b = rnsVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g().e(this.a);
        this.b.d = null;
    }
}
