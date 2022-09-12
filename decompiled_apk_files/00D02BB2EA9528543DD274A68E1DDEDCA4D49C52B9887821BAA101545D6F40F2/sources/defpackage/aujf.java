package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aujf  reason: default package */
/* loaded from: classes.dex */
public final class aujf {
    public static final dcqe a = dcqe.c("aujf");
    private final cqat b;

    public aujf(cqat cqatVar) {
        this.b = cqatVar;
    }

    public final double a(Iterable<aukd> iterable, dkpg dkpgVar, dbsg<Long> dbsgVar) {
        long b = this.b.b();
        double d = dcyn.a;
        for (aukd aukdVar : iterable) {
            double a2 = dbsgVar.a() ? akn.a(1.0f - (((float) bvop.k(b - aukdVar.c, Long.MAX_VALUE)) * (1.0f / ((float) TimeUnit.SECONDS.toMillis(dbsgVar.b().longValue())))), 0.0f, 1.0f) : 1.0d;
            aukb b2 = aukb.b(aukdVar.b);
            if (b2 == null) {
                b2 = aukb.UNKNOWN;
            }
            int ordinal = b2.ordinal();
            int i = 0;
            if (ordinal == 1) {
                i = dkpgVar.b;
            } else if (ordinal == 2) {
                i = dkpgVar.a;
            } else if (ordinal == 3) {
                i = dkpgVar.c;
            } else if (ordinal != 4) {
                bvoo.h("Unsupported weight %s", b2);
            } else {
                i = dkpgVar.d;
            }
            double d2 = i;
            Double.isNaN(d2);
            d += a2 * d2;
        }
        return d;
    }
}
