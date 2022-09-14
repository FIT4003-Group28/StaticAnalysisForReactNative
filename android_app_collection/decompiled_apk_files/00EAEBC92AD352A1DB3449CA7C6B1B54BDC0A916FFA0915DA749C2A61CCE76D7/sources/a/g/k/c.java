package a.g.k;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f255b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f256c;

    /* renamed from: f  reason: collision with root package name */
    private final int f259f;

    /* renamed from: g  reason: collision with root package name */
    private final int f260g;

    /* renamed from: h  reason: collision with root package name */
    private final String f261h;

    /* renamed from: a  reason: collision with root package name */
    private final Object f254a = new Object();

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f258e = new a();

    /* renamed from: d  reason: collision with root package name */
    private int f257d = 0;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f265d;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f266b;

            a(Object obj) {
                this.f266b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f265d.a(this.f266b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f263b = callable;
            this.f264c = handler;
            this.f265d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f263b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f264c.post(new a(obj));
        }
    }

    /* renamed from: a.g.k.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0009c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f268b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f269c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f270d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f271e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Condition f272f;

        RunnableC0009c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f268b = atomicReference;
            this.f269c = callable;
            this.f270d = reentrantLock;
            this.f271e = atomicBoolean;
            this.f272f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f268b.set(this.f269c.call());
            } catch (Exception unused) {
            }
            this.f270d.lock();
            try {
                this.f271e.set(false);
                this.f272f.signal();
            } finally {
                this.f270d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.f261h = str;
        this.f260g = i;
        this.f259f = i2;
    }

    private void b(Runnable runnable) {
        synchronized (this.f254a) {
            if (this.f255b == null) {
                this.f255b = new HandlerThread(this.f261h, this.f260g);
                this.f255b.start();
                this.f256c = new Handler(this.f255b.getLooper(), this.f258e);
                this.f257d++;
            }
            this.f256c.removeMessages(0);
            this.f256c.sendMessage(this.f256c.obtainMessage(1, runnable));
        }
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new RunnableC0009c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
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

    void a() {
        synchronized (this.f254a) {
            if (this.f256c.hasMessages(1)) {
                return;
            }
            this.f255b.quit();
            this.f255b = null;
            this.f256c = null;
        }
    }

    void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f254a) {
            this.f256c.removeMessages(0);
            this.f256c.sendMessageDelayed(this.f256c.obtainMessage(0), this.f259f);
        }
    }

    public <T> void a(Callable<T> callable, d<T> dVar) {
        b(new b(this, callable, new Handler(), dVar));
    }
}
