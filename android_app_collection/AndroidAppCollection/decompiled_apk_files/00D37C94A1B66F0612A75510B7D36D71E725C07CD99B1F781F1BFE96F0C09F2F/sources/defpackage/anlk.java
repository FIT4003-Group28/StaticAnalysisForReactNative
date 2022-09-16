package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: anlk  reason: default package */
/* loaded from: classes.dex */
public final class anlk {
    private String b = null;
    private Boolean c = null;
    public Integer a = null;
    private ThreadFactory d = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory b(anlk anlkVar) {
        String str = anlkVar.b;
        Boolean bool = anlkVar.c;
        Integer num = anlkVar.a;
        ThreadFactory threadFactory = anlkVar.d;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new anlj(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void d(String str) {
        a(str, 0);
        this.b = str;
    }

    public final void e(ThreadFactory threadFactory) {
        threadFactory.getClass();
        this.d = threadFactory;
    }
}
