package defpackage;
/* compiled from: PG */
/* renamed from: cpca  reason: default package */
/* loaded from: classes5.dex */
final class cpca implements Runnable {
    final /* synthetic */ cpcb a;

    public cpca(cpcb cpcbVar) {
        this.a = cpcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            cpcc cpccVar = this.a.b;
            if (cpccVar != null) {
                cpccVar.e();
            }
        }
    }
}
