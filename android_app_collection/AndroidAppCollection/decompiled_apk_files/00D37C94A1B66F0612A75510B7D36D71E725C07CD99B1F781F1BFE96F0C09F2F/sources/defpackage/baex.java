package defpackage;
/* compiled from: PG */
/* renamed from: baex  reason: default package */
/* loaded from: classes2.dex */
public final class baex implements Runnable {
    final /* synthetic */ bagu a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public baex(bagu baguVar, int i, long j, int i2) {
        this.a = baguVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onThroughputObservation(this.b, this.c, this.d);
    }
}
