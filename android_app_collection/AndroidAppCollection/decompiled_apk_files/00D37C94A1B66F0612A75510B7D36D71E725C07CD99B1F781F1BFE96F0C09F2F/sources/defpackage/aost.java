package defpackage;
/* compiled from: PG */
/* renamed from: aost  reason: default package */
/* loaded from: classes.dex */
public final class aost {
    static {
        aopa createBuilder = aooo.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aooo) createBuilder.instance).b = -315576000000L;
        createBuilder.copyOnWrite();
        ((aooo) createBuilder.instance).c = -999999999;
        aooo aoooVar = (aooo) createBuilder.mo39build();
        aopa createBuilder2 = aooo.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aooo) createBuilder2.instance).b = 315576000000L;
        createBuilder2.copyOnWrite();
        ((aooo) createBuilder2.instance).c = 999999999;
        aooo aoooVar2 = (aooo) createBuilder2.mo39build();
        aopa createBuilder3 = aooo.a.createBuilder();
        createBuilder3.copyOnWrite();
        ((aooo) createBuilder3.instance).b = 0L;
        createBuilder3.copyOnWrite();
        ((aooo) createBuilder3.instance).c = 0;
        aooo aoooVar3 = (aooo) createBuilder3.mo39build();
    }

    public static long a(aooo aoooVar) {
        d(aoooVar);
        return anhg.c(anhg.d(aoooVar.b, 1000L), aoooVar.c / 1000000);
    }

    public static aooo b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aooo c(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = anhg.c(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        aopa createBuilder = aooo.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aooo) createBuilder.instance).b = j;
        createBuilder.copyOnWrite();
        ((aooo) createBuilder.instance).c = i;
        aooo aoooVar = (aooo) createBuilder.mo39build();
        d(aoooVar);
        return aoooVar;
    }

    public static void d(aooo aoooVar) {
        long j = aoooVar.b;
        int i = aoooVar.c;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j >= 0 && i >= 0) {
                    return;
                }
                if (j <= 0 && i <= 0) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
