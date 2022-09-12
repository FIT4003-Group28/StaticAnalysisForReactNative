package androidx.work;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context a;
    public WorkerParameters b;
    public boolean c;
    private volatile boolean d;

    public final UUID a() {
        return this.b.a;
    }

    public final bbp b() {
        return this.b.b;
    }

    public abstract dehn<bbx> c();

    public final void d() {
        this.d = true;
        e();
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }

    public final Executor g() {
        return this.b.d;
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }
}
