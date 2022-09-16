package defpackage;

import android.os.Build;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: soo  reason: default package */
/* loaded from: classes4.dex */
final class soo {
    private static final boolean a;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Build.CPU_ABI.equals(strArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        a = z;
    }

    public static Object a(Future future, long j, TimeUnit timeUnit) {
        if (!a || (future instanceof anie) || (future instanceof son) || TimeUnit.NANOSECONDS.convert(j, timeUnit) <= 2147483647999999999L || future.isDone()) {
            future.get(j, timeUnit);
        }
        long nanos = timeUnit.toNanos(j);
        while (true) {
            try {
                return future.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
            } catch (TimeoutException unused) {
                nanos = (System.nanoTime() + nanos) - System.nanoTime();
            }
        }
    }

    public static RunnableScheduledFuture b(RunnableScheduledFuture runnableScheduledFuture) {
        return a ? new son(runnableScheduledFuture) : runnableScheduledFuture;
    }
}
