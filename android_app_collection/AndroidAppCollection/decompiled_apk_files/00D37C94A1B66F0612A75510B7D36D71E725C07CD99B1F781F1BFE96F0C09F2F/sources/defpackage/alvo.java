package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alvo  reason: default package */
/* loaded from: classes.dex */
public final class alvo {
    public static final alvo a = new alvo(a("SetupCompatServiceInvoker", 50));
    public static final alvo b = new alvo(a("SetupBindbackServiceExecutor", 1));
    public final Executor c;

    private alvo(Executor executor) {
        this.c = executor;
    }

    public static ExecutorService a(String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new pxh(str, 2, null));
    }
}
