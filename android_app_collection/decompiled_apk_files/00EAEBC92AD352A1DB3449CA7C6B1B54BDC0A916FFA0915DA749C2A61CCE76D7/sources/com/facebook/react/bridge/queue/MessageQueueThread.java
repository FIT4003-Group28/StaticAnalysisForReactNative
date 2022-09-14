package com.facebook.react.bridge.queue;

import c.d.l.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
@a
/* loaded from: classes.dex */
public interface MessageQueueThread {
    @a
    void assertIsOnThread();

    @a
    void assertIsOnThread(String str);

    @a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @a
    MessageQueueThreadPerfStats getPerfStats();

    @a
    boolean isOnThread();

    @a
    void quitSynchronous();

    @a
    void resetPerfStats();

    @a
    void runOnQueue(Runnable runnable);
}
