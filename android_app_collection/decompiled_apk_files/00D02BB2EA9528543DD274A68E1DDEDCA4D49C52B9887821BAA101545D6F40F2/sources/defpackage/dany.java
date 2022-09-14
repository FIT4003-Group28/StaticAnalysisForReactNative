package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dany  reason: default package */
/* loaded from: classes5.dex */
public final class dany<T extends Executor> {
    public static final dany<ExecutorService> a = new dany<>(a("SetupCompatServiceInvoker", 50));
    public static final dany<ExecutorService> b = new dany<>(a("SetupBindbackServiceExecutor", 1));
    public final T c;

    private dany(T t) {
        this.c = t;
    }

    public static ExecutorService a(final String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new ThreadFactory(str) { // from class: danx
            private final String a;

            {
                this.a = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.a);
            }
        });
    }
}
