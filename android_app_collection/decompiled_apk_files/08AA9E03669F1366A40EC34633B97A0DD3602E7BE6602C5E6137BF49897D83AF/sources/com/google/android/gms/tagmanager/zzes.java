package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzes implements zzag {
    private boolean closed;
    private final String zzavt;
    private String zzawt;
    private zzdh<com.google.android.gms.internal.measurement.zzl> zzbau;
    private zzal zzbav;
    private final ScheduledExecutorService zzbax;
    private final zzev zzbay;
    private ScheduledFuture<?> zzbaz;
    private final Context zzqx;

    public zzes(Context context, String str, zzal zzalVar) {
        this(context, str, zzalVar, null, null);
    }

    @VisibleForTesting
    private zzes(Context context, String str, zzal zzalVar, zzew zzewVar, zzev zzevVar) {
        this.zzbav = zzalVar;
        this.zzqx = context;
        this.zzavt = str;
        this.zzbax = new zzet(this).zzoj();
        this.zzbay = new zzeu(this);
    }

    private final synchronized void zzoi() {
        if (this.closed) {
            throw new IllegalStateException("called method after closed");
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        zzoi();
        if (this.zzbaz != null) {
            this.zzbaz.cancel(false);
        }
        this.zzbax.shutdown();
        this.closed = true;
    }

    @Override // com.google.android.gms.tagmanager.zzag
    public final synchronized void zza(long j, String str) {
        String str2 = this.zzavt;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 55);
        sb.append("loadAfterDelay: containerId=");
        sb.append(str2);
        sb.append(" delay=");
        sb.append(j);
        zzdi.v(sb.toString());
        zzoi();
        if (this.zzbau == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.zzbaz != null) {
            this.zzbaz.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = this.zzbax;
        zzer zza = this.zzbay.zza(this.zzbav);
        zza.zza(this.zzbau);
        zza.zzcq(this.zzawt);
        zza.zzdi(str);
        this.zzbaz = scheduledExecutorService.schedule(zza, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.tagmanager.zzag
    public final synchronized void zza(zzdh<com.google.android.gms.internal.measurement.zzl> zzdhVar) {
        zzoi();
        this.zzbau = zzdhVar;
    }

    @Override // com.google.android.gms.tagmanager.zzag
    public final synchronized void zzcq(String str) {
        zzoi();
        this.zzawt = str;
    }
}
