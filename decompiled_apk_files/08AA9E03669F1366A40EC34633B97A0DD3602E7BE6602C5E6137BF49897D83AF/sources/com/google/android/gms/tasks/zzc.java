package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class zzc<TResult, TContinuationResult> implements zzq<TResult> {
    private final Executor zzafk;
    private final Continuation<TResult, TContinuationResult> zzafl;
    private final zzu<TContinuationResult> zzafm;

    public zzc(Executor executor, Continuation<TResult, TContinuationResult> continuation, zzu<TContinuationResult> zzuVar) {
        this.zzafk = executor;
        this.zzafl = continuation;
        this.zzafm = zzuVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(Task<TResult> task) {
        this.zzafk.execute(new zzd(this, task));
    }
}
