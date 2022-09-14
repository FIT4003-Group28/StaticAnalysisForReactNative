package defpackage;
/* compiled from: PG */
/* renamed from: eauy  reason: default package */
/* loaded from: classes6.dex */
final class eauy {
    public final long a;
    public final eaou b;
    eauy c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public eauy(eaou eaouVar, long j) {
        this.a = j;
        this.b = eaouVar;
    }

    public final String a(long j) {
        eauy eauyVar = this.c;
        if (eauyVar == null || j < eauyVar.a) {
            if (this.d == null) {
                this.d = this.b.a(this.a);
            }
            return this.d;
        }
        return eauyVar.a(j);
    }

    public final int b(long j) {
        eauy eauyVar = this.c;
        if (eauyVar == null || j < eauyVar.a) {
            int i = this.e;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int b = this.b.b(this.a);
            this.e = b;
            return b;
        }
        return eauyVar.b(j);
    }

    public final int c(long j) {
        eauy eauyVar = this.c;
        if (eauyVar == null || j < eauyVar.a) {
            int i = this.f;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int c = this.b.c(this.a);
            this.f = c;
            return c;
        }
        return eauyVar.c(j);
    }
}
