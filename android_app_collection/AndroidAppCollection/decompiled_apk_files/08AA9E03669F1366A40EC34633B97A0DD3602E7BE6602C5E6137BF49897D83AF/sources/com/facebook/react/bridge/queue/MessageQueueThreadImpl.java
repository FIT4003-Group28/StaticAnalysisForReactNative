package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import com.facebook.react.bridge.ao;
import com.facebook.react.bridge.ap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class MessageQueueThreadImpl implements MessageQueueThread {

    /* renamed from: a  reason: collision with root package name */
    private final String f3258a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f3259b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3260c;
    private volatile boolean e = false;

    /* renamed from: d  reason: collision with root package name */
    private final String f3261d = "Expected to be called from the '" + b() + "' thread!";

    private MessageQueueThreadImpl(String str, Looper looper, c cVar) {
        this.f3258a = str;
        this.f3259b = looper;
        this.f3260c = new a(looper, cVar);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public void runOnQueue(Runnable runnable) {
        if (this.e) {
            com.facebook.common.e.a.c("ReactNative", "Tried to enqueue runnable on already finished thread: '" + b() + "... dropping Runnable.");
        }
        this.f3260c.post(runnable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final com.facebook.react.b.a.a aVar = new com.facebook.react.b.a.a();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    aVar.a((com.facebook.react.b.a.a) callable.call());
                } catch (Exception e) {
                    aVar.a(e);
                }
            }
        });
        return aVar;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public boolean isOnThread() {
        return this.f3259b.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public void assertIsOnThread() {
        ao.a(isOnThread(), this.f3261d);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        ao.a(isOnThread, this.f3261d + " " + str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @com.facebook.k.a.a
    public void quitSynchronous() {
        this.e = true;
        this.f3259b.quit();
        if (this.f3259b.getThread() != Thread.currentThread()) {
            try {
                this.f3259b.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.f3258a);
            }
        }
    }

    public Looper a() {
        return this.f3259b;
    }

    public String b() {
        return this.f3258a;
    }

    public static MessageQueueThreadImpl a(b bVar, c cVar) {
        switch (bVar.b()) {
            case MAIN_UI:
                return a(bVar.c(), cVar);
            case NEW_BACKGROUND:
                return a(bVar.c(), bVar.d(), cVar);
            default:
                throw new RuntimeException("Unknown thread type: " + bVar.b());
        }
    }

    private static MessageQueueThreadImpl a(String str, c cVar) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), cVar);
        if (ap.a()) {
            Process.setThreadPriority(-4);
        } else {
            ap.a(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    private static MessageQueueThreadImpl a(String str, long j, c cVar) {
        final com.facebook.react.b.a.a aVar = new com.facebook.react.b.a.a();
        Runnable runnable = new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.3
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-4);
                Looper.prepare();
                com.facebook.react.b.a.a.this.a((com.facebook.react.b.a.a) Looper.myLooper());
                Looper.loop();
            }
        };
        new Thread(null, runnable, "mqt_" + str, j).start();
        return new MessageQueueThreadImpl(str, (Looper) aVar.a(), cVar);
    }
}
