package android.arch.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f48a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f49b = Executors.newFixedThreadPool(2);

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f50c;

    @Override // android.arch.a.a.c
    public void a(Runnable runnable) {
        this.f49b.execute(runnable);
    }

    @Override // android.arch.a.a.c
    public void b(Runnable runnable) {
        if (this.f50c == null) {
            synchronized (this.f48a) {
                if (this.f50c == null) {
                    this.f50c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f50c.post(runnable);
    }

    @Override // android.arch.a.a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
