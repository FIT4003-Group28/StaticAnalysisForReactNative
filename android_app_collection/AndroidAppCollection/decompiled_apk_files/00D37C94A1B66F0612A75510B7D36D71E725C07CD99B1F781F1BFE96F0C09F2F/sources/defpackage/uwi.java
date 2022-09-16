package defpackage;

import java.lang.Thread;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: uwi  reason: default package */
/* loaded from: classes4.dex */
final class uwi implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ uwj a;
    private final Thread.UncaughtExceptionHandler b;

    public uwi(uwj uwjVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uwjVar;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        try {
            try {
                uwj uwjVar = this.a;
                String name = thread.getName();
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                aopa h = uwjVar.h();
                h.copyOnWrite();
                baak baakVar = (baak) h.instance;
                baak baakVar2 = baak.a;
                name.getClass();
                baakVar.b |= 8;
                baakVar.f = name;
                Class<?> cls = th.getClass();
                if (cls == OutOfMemoryError.class) {
                    i = 3;
                } else if (NullPointerException.class.isAssignableFrom(cls)) {
                    i = 2;
                } else if (RuntimeException.class.isAssignableFrom(cls)) {
                    i = 4;
                } else {
                    i = Error.class.isAssignableFrom(cls) ? 5 : 1;
                }
                h.copyOnWrite();
                baak baakVar3 = (baak) h.instance;
                baakVar3.g = i - 1;
                baakVar3.b |= 16;
                h.copyOnWrite();
                baak baakVar4 = (baak) h.instance;
                name2.getClass();
                baakVar4.b |= 128;
                baakVar4.j = name2;
                aopa c = anhe.c(th);
                h.copyOnWrite();
                baak baakVar5 = (baak) h.instance;
                angl anglVar = (angl) c.mo39build();
                anglVar.getClass();
                baakVar5.k = anglVar;
                baakVar5.b |= 256;
                try {
                    Long a = anuw.a(anuv.a(th));
                    if (a != null) {
                        long longValue = a.longValue();
                        h.copyOnWrite();
                        baak baakVar6 = (baak) h.instance;
                        baakVar6.b |= 32;
                        baakVar6.h = longValue;
                    }
                    StringBuilder sb = new StringBuilder();
                    vgh.a(th, sb, new HashSet(), null);
                    Long a2 = anuw.a(sb.toString());
                    if (a2 != null) {
                        long longValue2 = a2.longValue();
                        h.copyOnWrite();
                        baak baakVar7 = (baak) h.instance;
                        baakVar7.b |= 64;
                        baakVar7.i = longValue2;
                    }
                } catch (RuntimeException e) {
                    ((amzw) ((amzw) ((amzw) uwj.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "reportJavaCrash", (char) 214, "CrashMetricServiceImpl.java")).q("Failed to generate hashed stack trace.");
                }
                uwjVar.g((baak) h.mo39build());
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Exception e2) {
                ((amzw) ((amzw) ((amzw) uwj.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", (char) 148, "CrashMetricServiceImpl.java")).q("Failed to record crash.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
                if (uncaughtExceptionHandler2 == null) {
                    return;
                }
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.b;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
