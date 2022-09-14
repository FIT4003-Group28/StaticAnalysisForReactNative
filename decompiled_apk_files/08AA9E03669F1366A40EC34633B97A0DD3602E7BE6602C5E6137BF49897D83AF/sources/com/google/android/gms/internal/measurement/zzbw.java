package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbw {
    private static volatile Handler handler;
    private final zzat zzvn;
    private final Runnable zzyd;
    private volatile long zzye;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbw(zzat zzatVar) {
        Preconditions.checkNotNull(zzatVar);
        this.zzvn = zzatVar;
        this.zzyd = new zzbx(this);
    }

    private final Handler getHandler() {
        Handler handler2;
        if (handler != null) {
            return handler;
        }
        synchronized (zzbw.class) {
            if (handler == null) {
                handler = new Handler(this.zzvn.getContext().getMainLooper());
            }
            handler2 = handler;
        }
        return handler2;
    }

    public final void cancel() {
        this.zzye = 0L;
        getHandler().removeCallbacks(this.zzyd);
    }

    public abstract void run();

    public final long zzee() {
        if (this.zzye == 0) {
            return 0L;
        }
        return Math.abs(this.zzvn.zzbt().currentTimeMillis() - this.zzye);
    }

    public final boolean zzef() {
        return this.zzye != 0;
    }

    public final void zzh(long j) {
        cancel();
        if (j >= 0) {
            this.zzye = this.zzvn.zzbt().currentTimeMillis();
            if (getHandler().postDelayed(this.zzyd, j)) {
                return;
            }
            this.zzvn.zzbu().zze("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final void zzi(long j) {
        if (!zzef()) {
            return;
        }
        if (j < 0) {
            cancel();
            return;
        }
        long abs = j - Math.abs(this.zzvn.zzbt().currentTimeMillis() - this.zzye);
        if (abs < 0) {
            abs = 0;
        }
        getHandler().removeCallbacks(this.zzyd);
        if (getHandler().postDelayed(this.zzyd, abs)) {
            return;
        }
        this.zzvn.zzbu().zze("Failed to adjust delayed post. time", Long.valueOf(abs));
    }
}
