package defpackage;
/* compiled from: PG */
/* renamed from: dyjf  reason: default package */
/* loaded from: classes6.dex */
final class dyjf implements Runnable {
    final /* synthetic */ dyjg a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ dyji c;

    public dyjf(dyji dyjiVar, dyjg dyjgVar, Runnable runnable) {
        this.c = dyjiVar;
        this.a = dyjgVar;
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
