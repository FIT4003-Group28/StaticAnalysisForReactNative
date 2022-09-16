package defpackage;
/* compiled from: PG */
/* renamed from: axdm  reason: default package */
/* loaded from: classes2.dex */
final class axdm implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ axdn c;

    public axdm(axdn axdnVar, long j, long j2) {
        this.c = axdnVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.f(this.a, this.b);
    }
}
