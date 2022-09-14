package android.support.v4.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: SelfDestructiveThread.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f411b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f412c;
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: a  reason: collision with root package name */
    private final Object f410a = new Object();
    private Handler.Callback e = new Handler.Callback() { // from class: android.support.v4.g.c.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    c.this.a();
                    return true;
                case 1:
                    c.this.b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private int f413d = 0;

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    private void a(Runnable runnable) {
        synchronized (this.f410a) {
            if (this.f411b == null) {
                this.f411b = new HandlerThread(this.h, this.g);
                this.f411b.start();
                this.f412c = new Handler(this.f411b.getLooper(), this.e);
                this.f413d++;
            }
            this.f412c.removeMessages(0);
            this.f412c.sendMessage(this.f412c.obtainMessage(1, runnable));
        }
    }

    public <T> void a(final Callable<T> callable, final a<T> aVar) {
        final Handler handler = new Handler();
        a(new Runnable() { // from class: android.support.v4.g.c.2
            @Override // java.lang.Runnable
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() { // from class: android.support.v4.g.c.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(obj);
                    }
                });
            }
        });
    }

    public <T> T a(final Callable<T> callable, int i) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new Runnable() { // from class: android.support.v4.g.c.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f410a) {
            this.f412c.removeMessages(0);
            this.f412c.sendMessageDelayed(this.f412c.obtainMessage(0), this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.f410a) {
            if (this.f412c.hasMessages(1)) {
                return;
            }
            this.f411b.quit();
            this.f411b = null;
            this.f412c = null;
        }
    }
}
