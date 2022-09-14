package defpackage;
/* compiled from: PG */
/* renamed from: damy  reason: default package */
/* loaded from: classes5.dex */
final class damy implements Runnable {
    final /* synthetic */ danb a;
    final /* synthetic */ damz b;

    public damy(damz damzVar, danb danbVar) {
        this.b = damzVar;
        this.a = danbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            btcv btcvVar = this.b.b;
            danb danbVar = this.a;
            synchronized (((dani) danbVar).a) {
                dano.a(((dani) danbVar).c, "Task is not yet complete");
                Exception exc = ((dani) danbVar).e;
                if (exc != null) {
                    throw new dana(exc);
                }
            }
            btcvVar.a.a.d();
        }
    }
}
