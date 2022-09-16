package defpackage;
/* compiled from: PG */
/* renamed from: ywc  reason: default package */
/* loaded from: classes4.dex */
final class ywc extends ywi {
    final long[] a = new long[7];
    final long[] b = new long[7];
    private final String c;
    private final String d;

    public ywc(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    private final long e(ywj ywjVar, int i) {
        return ywp.m(a(ywjVar.c, i), ywjVar) ? 1L : 0L;
    }

    private final long f(ywj ywjVar, int i) {
        return ywp.a(a(ywjVar.c, i), ywjVar);
    }

    final String a(int i, int i2) {
        return (i2 == 1 || ywh.e(i)) ? this.d : this.c;
    }

    @Override // defpackage.ywi
    public final void b(ywj ywjVar) {
        ywg.j(this.a, ywjVar.c, e(ywjVar, 0));
        ywg.j(this.b, ywjVar.c, e(ywjVar, 1));
    }

    @Override // defpackage.ywi
    public final void c(ywj ywjVar) {
        ywg.j(this.a, ywjVar.c, f(ywjVar, 0));
        ywg.j(this.b, ywjVar.c, f(ywjVar, 1));
    }
}
