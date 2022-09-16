package defpackage;
/* compiled from: PG */
/* renamed from: acvd  reason: default package */
/* loaded from: classes.dex */
final class acvd implements Runnable {
    final /* synthetic */ asno a;
    final /* synthetic */ long b;
    final /* synthetic */ acvf c;

    public acvd(acvf acvfVar, asno asnoVar, long j) {
        this.c = acvfVar;
        this.a = asnoVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this.a, this.b);
    }
}
