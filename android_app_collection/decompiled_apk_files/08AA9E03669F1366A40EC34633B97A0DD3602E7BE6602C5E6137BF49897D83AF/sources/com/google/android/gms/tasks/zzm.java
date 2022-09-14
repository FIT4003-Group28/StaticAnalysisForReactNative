package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class zzm<TResult> implements zzq<TResult> {
    private final Object mLock = new Object();
    private final Executor zzafk;
    private OnSuccessListener<? super TResult> zzafw;

    public zzm(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzafk = executor;
        this.zzafw = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzafw = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.mLock) {
                if (this.zzafw == null) {
                    return;
                }
                this.zzafk.execute(new zzn(this, task));
            }
        }
    }
}
