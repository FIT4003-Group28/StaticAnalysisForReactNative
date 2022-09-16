package defpackage;
/* compiled from: PG */
/* renamed from: rit  reason: default package */
/* loaded from: classes4.dex */
final class rit implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ riu b;

    public rit(riu riuVar, long j) {
        this.b = riuVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a);
    }
}
