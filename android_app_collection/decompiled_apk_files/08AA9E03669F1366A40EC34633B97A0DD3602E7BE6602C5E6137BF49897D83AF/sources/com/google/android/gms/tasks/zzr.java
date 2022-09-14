package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzr<TResult> {
    private final Object mLock = new Object();
    private Queue<zzq<TResult>> zzaga;
    private boolean zzagb;

    public final void zza(Task<TResult> task) {
        zzq<TResult> poll;
        synchronized (this.mLock) {
            if (this.zzaga != null && !this.zzagb) {
                this.zzagb = true;
                while (true) {
                    synchronized (this.mLock) {
                        poll = this.zzaga.poll();
                        if (poll == null) {
                            this.zzagb = false;
                            return;
                        }
                    }
                    poll.onComplete(task);
                }
            }
        }
    }

    public final void zza(zzq<TResult> zzqVar) {
        synchronized (this.mLock) {
            if (this.zzaga == null) {
                this.zzaga = new ArrayDeque();
            }
            this.zzaga.add(zzqVar);
        }
    }
}
