package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otj  reason: default package */
/* loaded from: classes4.dex */
public final class otj implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ otk c;

    public otj(otk otkVar, long j, long j2) {
        this.c = otkVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.f(this.a, this.b);
    }
}
