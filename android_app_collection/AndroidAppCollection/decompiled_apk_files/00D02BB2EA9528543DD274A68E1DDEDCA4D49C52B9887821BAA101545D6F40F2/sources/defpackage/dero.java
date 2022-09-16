package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dero  reason: default package */
/* loaded from: classes6.dex */
public final class dero {
    public static final Executor a = dern.a;

    public static ExecutorService a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cnxx("firebase-iid-executor"));
    }
}
