package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class zzk<TResult> implements zzq<TResult> {
    private final Object mLock = new Object();
    private final Executor zzafk;
    private OnFailureListener zzafu;

    public zzk(Executor executor, OnFailureListener onFailureListener) {
        this.zzafk = executor;
        this.zzafu = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzafu = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(Task<TResult> task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.mLock) {
            if (this.zzafu == null) {
                return;
            }
            this.zzafk.execute(new zzl(this, task));
        }
    }
}
