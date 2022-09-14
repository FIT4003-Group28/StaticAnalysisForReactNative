package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zza {
    private static Object zzavh = new Object();
    private static zza zzavi;
    private volatile boolean closed;
    private volatile long zzava;
    private volatile long zzavb;
    private volatile long zzavc;
    private volatile long zzavd;
    private final Thread zzave;
    private final Object zzavf;
    private zzd zzavg;
    private final Context zzqx;
    private final Clock zzro;
    private volatile AdvertisingIdClient.Info zzva;

    private zza(Context context) {
        this(context, null, DefaultClock.getInstance());
    }

    @VisibleForTesting
    private zza(Context context, zzd zzdVar, Clock clock) {
        this.zzava = 900000L;
        this.zzavb = 30000L;
        this.closed = false;
        this.zzavf = new Object();
        this.zzavg = new zzb(this);
        this.zzro = clock;
        this.zzqx = context != null ? context.getApplicationContext() : context;
        this.zzavc = this.zzro.currentTimeMillis();
        this.zzave = new Thread(new zzc(this));
    }

    public static zza zzh(Context context) {
        if (zzavi == null) {
            synchronized (zzavh) {
                if (zzavi == null) {
                    zza zzaVar = new zza(context);
                    zzavi = zzaVar;
                    zzaVar.zzave.start();
                }
            }
        }
        return zzavi;
    }

    private final void zzlz() {
        synchronized (this) {
            try {
                if (!this.closed) {
                    zzma();
                    wait(500L);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    private final void zzma() {
        if (this.zzro.currentTimeMillis() - this.zzavc > this.zzavb) {
            synchronized (this.zzavf) {
                this.zzavf.notify();
            }
            this.zzavc = this.zzro.currentTimeMillis();
        }
    }

    private final void zzmb() {
        if (this.zzro.currentTimeMillis() - this.zzavd > 3600000) {
            this.zzva = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzmc() {
        Process.setThreadPriority(10);
        while (!this.closed) {
            AdvertisingIdClient.Info zzmd = this.zzavg.zzmd();
            if (zzmd != null) {
                this.zzva = zzmd;
                this.zzavd = this.zzro.currentTimeMillis();
                zzdi.zzcw("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.zzavf) {
                    this.zzavf.wait(this.zzava);
                }
            } catch (InterruptedException unused) {
                zzdi.zzcw("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    @VisibleForTesting
    public final void close() {
        this.closed = true;
        this.zzave.interrupt();
    }

    public final boolean isLimitAdTrackingEnabled() {
        if (this.zzva == null) {
            zzlz();
        } else {
            zzma();
        }
        zzmb();
        if (this.zzva == null) {
            return true;
        }
        return this.zzva.isLimitAdTrackingEnabled();
    }

    public final String zzly() {
        if (this.zzva == null) {
            zzlz();
        } else {
            zzma();
        }
        zzmb();
        if (this.zzva == null) {
            return null;
        }
        return this.zzva.getId();
    }
}
