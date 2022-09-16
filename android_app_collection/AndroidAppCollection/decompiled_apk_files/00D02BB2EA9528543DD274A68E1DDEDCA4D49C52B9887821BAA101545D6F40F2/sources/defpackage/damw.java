package defpackage;
/* compiled from: PG */
/* renamed from: damw  reason: default package */
/* loaded from: classes5.dex */
final class damw implements Runnable {
    final /* synthetic */ danb a;
    final /* synthetic */ damx b;

    public damw(damx damxVar, danb danbVar) {
        this.b = damxVar;
        this.a = danbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            synchronized (((dani) this.a).a) {
            }
        }
    }
}
