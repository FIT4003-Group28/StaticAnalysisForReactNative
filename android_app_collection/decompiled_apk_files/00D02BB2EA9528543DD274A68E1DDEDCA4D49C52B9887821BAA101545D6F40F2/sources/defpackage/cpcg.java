package defpackage;
/* compiled from: PG */
/* renamed from: cpcg  reason: default package */
/* loaded from: classes5.dex */
final class cpcg implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpch b;

    public cpcg(cpch cpchVar, cpcq cpcqVar) {
        this.b = cpchVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            cpci cpciVar = this.b.b;
            if (cpciVar != null) {
                Exception e = this.a.e();
                cnwc.a(e);
                cpciVar.d(e);
            }
        }
    }
}
