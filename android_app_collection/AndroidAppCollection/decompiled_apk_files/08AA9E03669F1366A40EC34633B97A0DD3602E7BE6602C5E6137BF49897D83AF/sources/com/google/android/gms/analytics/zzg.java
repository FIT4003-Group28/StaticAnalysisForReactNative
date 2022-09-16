package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzg {
    private final zzj zzrn;
    private final Clock zzro;
    private boolean zzrp;
    private long zzrq;
    private long zzrr;
    private long zzrs;
    private long zzrt;
    private long zzru;
    private boolean zzrv;
    private final Map<Class<? extends zzi>, zzi> zzrw;
    private final List<zzo> zzrx;

    private zzg(zzg zzgVar) {
        this.zzrn = zzgVar.zzrn;
        this.zzro = zzgVar.zzro;
        this.zzrq = zzgVar.zzrq;
        this.zzrr = zzgVar.zzrr;
        this.zzrs = zzgVar.zzrs;
        this.zzrt = zzgVar.zzrt;
        this.zzru = zzgVar.zzru;
        this.zzrx = new ArrayList(zzgVar.zzrx);
        this.zzrw = new HashMap(zzgVar.zzrw.size());
        for (Map.Entry<Class<? extends zzi>, zzi> entry : zzgVar.zzrw.entrySet()) {
            zzi zzc = zzc(entry.getKey());
            entry.getValue().zzb(zzc);
            this.zzrw.put(entry.getKey(), zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzg(zzj zzjVar, Clock clock) {
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotNull(clock);
        this.zzrn = zzjVar;
        this.zzro = clock;
        this.zzrt = 1800000L;
        this.zzru = 3024000000L;
        this.zzrw = new HashMap();
        this.zzrx = new ArrayList();
    }

    @TargetApi(19)
    private static <T extends zzi> T zzc(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            }
            if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            if (Build.VERSION.SDK_INT >= 19 && (e instanceof ReflectiveOperationException)) {
                throw new IllegalArgumentException("Linkage exception", e);
            }
            throw new RuntimeException(e);
        }
    }

    @VisibleForTesting
    public final <T extends zzi> T zza(Class<T> cls) {
        return (T) this.zzrw.get(cls);
    }

    @VisibleForTesting
    public final void zza(long j) {
        this.zzrr = j;
    }

    @VisibleForTesting
    public final void zza(zzi zziVar) {
        Preconditions.checkNotNull(zziVar);
        Class<?> cls = zziVar.getClass();
        if (cls.getSuperclass() != zzi.class) {
            throw new IllegalArgumentException();
        }
        zziVar.zzb(zzb(cls));
    }

    @VisibleForTesting
    public final <T extends zzi> T zzb(Class<T> cls) {
        T t = (T) this.zzrw.get(cls);
        if (t == null) {
            T t2 = (T) zzc(cls);
            this.zzrw.put(cls, t2);
            return t2;
        }
        return t;
    }

    @VisibleForTesting
    public final zzg zzo() {
        return new zzg(this);
    }

    @VisibleForTesting
    public final Collection<zzi> zzp() {
        return this.zzrw.values();
    }

    public final List<zzo> zzq() {
        return this.zzrx;
    }

    @VisibleForTesting
    public final long zzr() {
        return this.zzrq;
    }

    @VisibleForTesting
    public final void zzs() {
        this.zzrn.zzy().zze(this);
    }

    @VisibleForTesting
    public final boolean zzt() {
        return this.zzrp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzu() {
        this.zzrs = this.zzro.elapsedRealtime();
        this.zzrq = this.zzrr != 0 ? this.zzrr : this.zzro.currentTimeMillis();
        this.zzrp = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzj zzv() {
        return this.zzrn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zzw() {
        return this.zzrv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzx() {
        this.zzrv = true;
    }
}
