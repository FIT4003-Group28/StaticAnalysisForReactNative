package c.d.h.b;

import android.os.Handler;
import android.os.Looper;
import c.d.d.d.i;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private static a f2957d;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f2960c = new RunnableC0075a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f2958a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2959b = new Handler(Looper.getMainLooper());

    /* renamed from: c.d.h.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0075a implements Runnable {
        RunnableC0075a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.b();
            for (b bVar : a.this.f2958a) {
                bVar.release();
            }
            a.this.f2958a.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        i.b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static synchronized a c() {
        a aVar;
        synchronized (a.class) {
            if (f2957d == null) {
                f2957d = new a();
            }
            aVar = f2957d;
        }
        return aVar;
    }

    public void a(b bVar) {
        b();
        this.f2958a.remove(bVar);
    }

    public void b(b bVar) {
        b();
        if (this.f2958a.add(bVar) && this.f2958a.size() == 1) {
            this.f2959b.post(this.f2960c);
        }
    }
}
