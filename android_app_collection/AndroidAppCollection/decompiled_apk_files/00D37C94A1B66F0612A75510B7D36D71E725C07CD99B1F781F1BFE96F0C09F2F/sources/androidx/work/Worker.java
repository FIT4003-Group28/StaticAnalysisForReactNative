package androidx.work;

import android.content.Context;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public bwk f;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final ankt b() {
        this.f = bwk.h();
        jV().execute(new bqr(this));
        return this.f;
    }

    public abstract adz i();
}
