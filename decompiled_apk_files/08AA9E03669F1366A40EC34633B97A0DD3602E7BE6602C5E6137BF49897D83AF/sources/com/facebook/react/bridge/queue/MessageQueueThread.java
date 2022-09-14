package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public interface MessageQueueThread {
    @com.facebook.k.a.a
    void assertIsOnThread();

    @com.facebook.k.a.a
    void assertIsOnThread(String str);

    @com.facebook.k.a.a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @com.facebook.k.a.a
    boolean isOnThread();

    @com.facebook.k.a.a
    void quitSynchronous();

    @com.facebook.k.a.a
    void runOnQueue(Runnable runnable);
}
