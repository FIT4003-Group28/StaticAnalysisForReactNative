package androidx.work;

import android.content.Context;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {
    public bid<bbx> d;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final dehn<bbx> c() {
        this.d = bid.e();
        g().execute(new bco(this));
        return this.d;
    }

    public abstract bbx h();
}
