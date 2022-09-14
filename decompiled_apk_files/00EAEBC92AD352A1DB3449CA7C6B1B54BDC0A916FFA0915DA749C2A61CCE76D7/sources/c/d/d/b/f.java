package c.d.d.b;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: b  reason: collision with root package name */
    private static f f2805b;

    private f() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static f b() {
        if (f2805b == null) {
            f2805b = new f();
        }
        return f2805b;
    }

    @Override // c.d.d.b.c, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
