package androidx.work;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context a;
    public WorkerParameters b;
    public volatile boolean c;
    public boolean d;
    public boolean e;

    public final bpx a() {
        return this.b.b;
    }

    public abstract ankt b();

    public final Set c() {
        return this.b.c;
    }

    public final UUID d() {
        return this.b.a;
    }

    public final void g() {
        this.c = true;
        jU();
    }

    public boolean h() {
        return this.e;
    }

    public void jU() {
    }

    public final Executor jV() {
        return this.b.e;
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
