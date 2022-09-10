package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vxb  reason: default package */
/* loaded from: classes7.dex */
public final class vxb {
    public static final dcqe a = dcqe.c("vxb");

    public static long a(dosz doszVar) {
        TimeZone timeZone = TimeZone.getDefault();
        dbsk.s(doszVar);
        dbsk.a((doszVar.a & 4) != 0);
        int a2 = dquq.a(doszVar.c);
        if (a2 == 0 || a2 != 2) {
            return c(TimeUnit.SECONDS.toMillis(doszVar.d), timeZone);
        }
        return TimeUnit.SECONDS.toMillis(doszVar.d);
    }

    public static long b(long j) {
        return c(j, TimeZone.getDefault());
    }

    public static long c(long j, TimeZone timeZone) {
        return j + timeZone.getOffset(j);
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setTimeInMillis(j);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Calendar e(long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13));
        return calendar2;
    }

    public static long f(dwao dwaoVar, TimeZone timeZone, long j) {
        int i = 1;
        if ((dwaoVar.a & 1073741824) != 0) {
            dosz doszVar = dwaoVar.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            if ((doszVar.a & 4) != 0) {
                long j2 = doszVar.d;
                int a2 = dquq.a(doszVar.c);
                if (a2 != 0) {
                    i = a2;
                }
                return g(timeZone, j2, i);
            }
        }
        if ((dwaoVar.a & 2) != 0) {
            dwbk dwbkVar = dwaoVar.f;
            if (dwbkVar == null) {
                dwbkVar = dwbk.s;
            }
            if ((dwbkVar.a & 4) != 0) {
                long j3 = dwbkVar.d;
                int a3 = dquq.a(dwbkVar.c);
                if (a3 != 0) {
                    i = a3;
                }
                return g(timeZone, j3, i);
            }
        }
        return j + timeZone.getOffset(j);
    }

    private static long g(TimeZone timeZone, long j, int i) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        return i == 1 ? millis + timeZone.getOffset(millis) : millis;
    }
}
