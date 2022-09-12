package defpackage;
/* compiled from: PG */
/* renamed from: bu  reason: default package */
/* loaded from: classes4.dex */
final class bu implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bv b;

    public bu(bv bvVar, Runnable runnable) {
        this.b = bvVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
