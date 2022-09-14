package c.d.j.f;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class l implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final int f3333a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3334b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3335c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f3336d = new AtomicInteger(1);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f3337b;

        a(Runnable runnable) {
            this.f3337b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(l.this.f3333a);
            } catch (Throwable unused) {
            }
            this.f3337b.run();
        }
    }

    public l(int i, String str, boolean z) {
        this.f3333a = i;
        this.f3334b = str;
        this.f3335c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f3335c) {
            str = this.f3334b + "-" + this.f3336d.getAndIncrement();
        } else {
            str = this.f3334b;
        }
        return new Thread(aVar, str);
    }
}
