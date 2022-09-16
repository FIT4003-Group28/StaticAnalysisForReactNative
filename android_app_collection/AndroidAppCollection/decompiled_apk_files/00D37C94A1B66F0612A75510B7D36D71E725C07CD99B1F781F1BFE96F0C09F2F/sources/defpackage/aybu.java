package defpackage;
/* compiled from: PG */
/* renamed from: aybu  reason: default package */
/* loaded from: classes2.dex */
final class aybu implements Runnable {
    final /* synthetic */ aybv a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ aybx c;

    public aybu(aybx aybxVar, aybv aybvVar, Runnable runnable) {
        this.c = aybxVar;
        this.a = aybvVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
