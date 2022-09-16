package defpackage;
/* compiled from: PG */
/* renamed from: ayzj  reason: default package */
/* loaded from: classes2.dex */
final class ayzj implements Runnable {
    final bamf a;
    final long b;

    public ayzj(bamf bamfVar, long j) {
        this.a = bamfVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.sp(this.b);
    }
}
