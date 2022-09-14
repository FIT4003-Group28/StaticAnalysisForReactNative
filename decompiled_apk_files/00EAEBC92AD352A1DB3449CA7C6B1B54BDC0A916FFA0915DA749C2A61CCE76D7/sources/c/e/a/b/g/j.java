package c.e.a.b.g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f4610a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f4611b = new b0();

    /* loaded from: classes.dex */
    private static final class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f4612a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f4612a.post(runnable);
        }
    }
}
