package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzvz;
import com.google.android.gms.internal.measurement.zzwa;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.tagmanager.zzeh;
/* loaded from: classes.dex */
public final class zzy extends BasePendingResult<ContainerHolder> {
    private final String zzavt;
    private long zzavy;
    private final Looper zzawb;
    private final TagManager zzawh;
    private final zzaf zzawk;
    private final zzej zzawl;
    private final int zzawm;
    private final zzai zzawn;
    private zzah zzawo;
    private zzwa zzawp;
    private volatile zzv zzawq;
    private volatile boolean zzawr;
    private com.google.android.gms.internal.measurement.zzl zzaws;
    private String zzawt;
    private zzag zzawu;
    private zzac zzawv;
    private final Context zzqx;
    private final Clock zzro;

    @VisibleForTesting
    private zzy(Context context, TagManager tagManager, Looper looper, String str, int i, zzah zzahVar, zzag zzagVar, zzwa zzwaVar, Clock clock, zzej zzejVar, zzai zzaiVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.zzqx = context;
        this.zzawh = tagManager;
        this.zzawb = looper == null ? Looper.getMainLooper() : looper;
        this.zzavt = str;
        this.zzawm = i;
        this.zzawo = zzahVar;
        this.zzawu = zzagVar;
        this.zzawp = zzwaVar;
        this.zzawk = new zzaf(this, null);
        this.zzaws = new com.google.android.gms.internal.measurement.zzl();
        this.zzro = clock;
        this.zzawl = zzejVar;
        this.zzawn = zzaiVar;
        if (zzmq()) {
            zzcp(zzeh.zzof().zzoh());
        }
    }

    public zzy(Context context, TagManager tagManager, Looper looper, String str, int i, zzal zzalVar) {
        this(context, tagManager, looper, str, i, new zzex(context, str), new zzes(context, str, zzalVar), new zzwa(context), DefaultClock.getInstance(), new zzdg(1, 5, 900000L, 5000L, "refreshing", DefaultClock.getInstance()), new zzai(context, str));
        this.zzawp.zzer(zzalVar.zzmy());
    }

    public final synchronized void zza(com.google.android.gms.internal.measurement.zzl zzlVar) {
        if (this.zzawo != null) {
            zzvz zzvzVar = new zzvz();
            zzvzVar.zzbmi = this.zzavy;
            zzvzVar.zzpv = new com.google.android.gms.internal.measurement.zzi();
            zzvzVar.zzbmj = zzlVar;
            this.zzawo.zza(zzvzVar);
        }
    }

    public final synchronized void zza(com.google.android.gms.internal.measurement.zzl zzlVar, long j, boolean z) {
        if (z) {
            try {
                boolean z2 = this.zzawr;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!isReady() || this.zzawq != null) {
            this.zzaws = zzlVar;
            this.zzavy = j;
            long zzmt = this.zzawn.zzmt();
            zzah(Math.max(0L, Math.min(zzmt, (this.zzavy + zzmt) - this.zzro.currentTimeMillis())));
            Container container = new Container(this.zzqx, this.zzawh.getDataLayer(), this.zzavt, j, zzlVar);
            if (this.zzawq == null) {
                this.zzawq = new zzv(this.zzawh, this.zzawb, container, this.zzawk);
            } else {
                this.zzawq.zza(container);
            }
            if (!isReady() && this.zzawv.zzb(container)) {
                setResult(this.zzawq);
            }
        }
    }

    public final synchronized void zzah(long j) {
        if (this.zzawu == null) {
            zzdi.zzaa("Refresh requested, but no network load scheduler.");
        } else {
            this.zzawu.zza(j, this.zzaws.zzpw);
        }
    }

    public final boolean zzmq() {
        zzeh zzof = zzeh.zzof();
        return (zzof.zzog() == zzeh.zza.CONTAINER || zzof.zzog() == zzeh.zza.CONTAINER_DEBUG) && this.zzavt.equals(zzof.getContainerId());
    }

    private final void zzn(boolean z) {
        this.zzawo.zza(new zzad(this, null));
        this.zzawu.zza(new zzae(this, null));
        zzwf zzr = this.zzawo.zzr(this.zzawm);
        if (zzr != null) {
            this.zzawq = new zzv(this.zzawh, this.zzawb, new Container(this.zzqx, this.zzawh.getDataLayer(), this.zzavt, 0L, zzr), this.zzawk);
        }
        this.zzawv = new zzab(this, z);
        if (zzmq()) {
            this.zzawu.zza(0L, "");
        } else {
            this.zzawo.zzms();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a_ */
    public final ContainerHolder mo86createFailedResult(Status status) {
        if (this.zzawq != null) {
            return this.zzawq;
        }
        if (status == Status.RESULT_TIMEOUT) {
            zzdi.e("timer expired: setting result to failure");
        }
        return new zzv(status);
    }

    @VisibleForTesting
    public final synchronized void zzcp(String str) {
        this.zzawt = str;
        if (this.zzawu != null) {
            this.zzawu.zzcq(str);
        }
    }

    public final synchronized String zzmk() {
        return this.zzawt;
    }

    public final void zzmn() {
        zzwf zzr = this.zzawo.zzr(this.zzawm);
        if (zzr != null) {
            setResult(new zzv(this.zzawh, this.zzawb, new Container(this.zzqx, this.zzawh.getDataLayer(), this.zzavt, 0L, zzr), new zzaa(this)));
        } else {
            zzdi.e("Default was requested, but no default container was found");
            setResult(mo86createFailedResult(new Status(10, "Default was requested, but no default container was found", null)));
        }
        this.zzawu = null;
        this.zzawo = null;
    }

    public final void zzmo() {
        zzn(false);
    }

    public final void zzmp() {
        zzn(true);
    }
}
