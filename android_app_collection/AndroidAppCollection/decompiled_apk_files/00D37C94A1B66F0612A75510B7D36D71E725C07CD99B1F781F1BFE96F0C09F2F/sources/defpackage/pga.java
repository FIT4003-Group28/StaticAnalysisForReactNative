package defpackage;
/* compiled from: PG */
/* renamed from: pga  reason: default package */
/* loaded from: classes4.dex */
final class pga implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ pgd c;

    public pga(pgd pgdVar, long j, long j2) {
        this.c = pgdVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pgc pgcVar = this.c.b;
        String valueOf = String.valueOf(pgd.l());
        String concat = valueOf.length() != 0 ? "libvpx".concat(valueOf) : new String("libvpx");
        long j = this.a;
        pgcVar.c(concat, j, j - this.b);
    }
}
