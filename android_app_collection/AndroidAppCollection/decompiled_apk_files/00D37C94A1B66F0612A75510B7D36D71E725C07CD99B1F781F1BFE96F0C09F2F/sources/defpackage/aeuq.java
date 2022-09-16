package defpackage;
/* compiled from: PG */
/* renamed from: aeuq  reason: default package */
/* loaded from: classes.dex */
public final class aeuq {
    public final long a;
    public final int b;

    private aeuq(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public aeuq(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static aeuq b(oxn oxnVar, pct pctVar) {
        oxnVar.g(pctVar.a, 0, 8);
        pctVar.z(0);
        return new aeuq(pctVar.c(), pctVar.l());
    }

    public final int a() {
        int i;
        long j = this.a;
        if (j <= 0 || (i = this.b) <= 0) {
            return 0;
        }
        double d = i;
        Double.isNaN(d);
        double d2 = j;
        Double.isNaN(d2);
        return (int) ((d * 8000000.0d) / d2);
    }
}
