package defpackage;
/* compiled from: PG */
/* renamed from: dypn  reason: default package */
/* loaded from: classes6.dex */
final class dypn implements Runnable {
    final /* synthetic */ dymc a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dypz c;

    public dypn(dypz dypzVar, dymc dymcVar, boolean z) {
        this.c = dypzVar;
        this.a = dymcVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.m.a(this.a, this.b);
    }
}
