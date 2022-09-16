package defpackage;
/* compiled from: PG */
/* renamed from: pfw  reason: default package */
/* loaded from: classes4.dex */
final class pfw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ pgd c;

    public pfw(pgd pgdVar, int i, int i2) {
        this.c = pgdVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.h(this.a, this.b);
    }
}
