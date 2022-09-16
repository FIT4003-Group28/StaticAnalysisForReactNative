package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: deip  reason: default package */
/* loaded from: classes.dex */
public final class deip {
    public String a = null;
    private Boolean c = null;
    public Integer b = null;
    private ThreadFactory d = null;

    public static ThreadFactory a(deip deipVar) {
        String str = deipVar.a;
        Boolean bool = deipVar.c;
        Integer num = deipVar.b;
        ThreadFactory threadFactory = deipVar.d;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new deio(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(ThreadFactory threadFactory) {
        dbsk.s(threadFactory);
        this.d = threadFactory;
    }
}
