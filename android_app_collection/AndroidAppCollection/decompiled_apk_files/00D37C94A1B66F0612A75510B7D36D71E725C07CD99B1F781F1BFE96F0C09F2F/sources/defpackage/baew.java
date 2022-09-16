package defpackage;
/* compiled from: PG */
/* renamed from: baew  reason: default package */
/* loaded from: classes2.dex */
public final class baew implements Runnable {
    final /* synthetic */ bagt a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public baew(bagt bagtVar, int i, long j, int i2) {
        this.a = bagtVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRttObservation(this.b, this.c, this.d);
    }
}
