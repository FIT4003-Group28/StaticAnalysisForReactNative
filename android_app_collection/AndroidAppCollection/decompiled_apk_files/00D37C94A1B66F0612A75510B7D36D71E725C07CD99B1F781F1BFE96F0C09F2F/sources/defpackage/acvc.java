package defpackage;
/* compiled from: PG */
/* renamed from: acvc  reason: default package */
/* loaded from: classes.dex */
final class acvc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ acvf c;

    public acvc(acvf acvfVar, String str, long j) {
        this.c = acvfVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.h(this.a, this.b);
    }
}
