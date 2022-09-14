package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import org.spongycastle.crypto.tls.CipherSuite;
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public class zzat {
    private static volatile zzat zzvq;
    private final Context zzqx;
    private final Clock zzro;
    private final Context zzvr;
    private final zzbu zzvs;
    private final zzcm zzvt;
    private final com.google.android.gms.analytics.zzk zzvu;
    private final zzai zzvv;
    private final zzbz zzvw;
    private final zzde zzvx;
    private final zzcq zzvy;
    private final GoogleAnalytics zzvz;
    private final zzbl zzwa;
    private final zzah zzwb;
    private final zzbe zzwc;
    private final zzby zzwd;

    private zzat(zzav zzavVar) {
        Context applicationContext = zzavVar.getApplicationContext();
        Preconditions.checkNotNull(applicationContext, "Application context can't be null");
        Context zzci = zzavVar.zzci();
        Preconditions.checkNotNull(zzci);
        this.zzqx = applicationContext;
        this.zzvr = zzci;
        this.zzro = DefaultClock.getInstance();
        this.zzvs = new zzbu(this);
        zzcm zzcmVar = new zzcm(this);
        zzcmVar.zzm();
        this.zzvt = zzcmVar;
        zzcm zzbu = zzbu();
        String str = zzas.VERSION;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzbu.zzr(sb.toString());
        zzcq zzcqVar = new zzcq(this);
        zzcqVar.zzm();
        this.zzvy = zzcqVar;
        zzde zzdeVar = new zzde(this);
        zzdeVar.zzm();
        this.zzvx = zzdeVar;
        zzai zzaiVar = new zzai(this, zzavVar);
        zzbl zzblVar = new zzbl(this);
        zzah zzahVar = new zzah(this);
        zzbe zzbeVar = new zzbe(this);
        zzby zzbyVar = new zzby(this);
        com.google.android.gms.analytics.zzk zzb = com.google.android.gms.analytics.zzk.zzb(applicationContext);
        zzb.zza(new zzau(this));
        this.zzvu = zzb;
        GoogleAnalytics googleAnalytics = new GoogleAnalytics(this);
        zzblVar.zzm();
        this.zzwa = zzblVar;
        zzahVar.zzm();
        this.zzwb = zzahVar;
        zzbeVar.zzm();
        this.zzwc = zzbeVar;
        zzbyVar.zzm();
        this.zzwd = zzbyVar;
        zzbz zzbzVar = new zzbz(this);
        zzbzVar.zzm();
        this.zzvw = zzbzVar;
        zzaiVar.zzm();
        this.zzvv = zzaiVar;
        googleAnalytics.zzm();
        this.zzvz = googleAnalytics;
        zzaiVar.start();
    }

    private static void zza(zzar zzarVar) {
        Preconditions.checkNotNull(zzarVar, "Analytics service not created/initialized");
        Preconditions.checkArgument(zzarVar.isInitialized(), "Analytics service not initialized");
    }

    public static zzat zzc(Context context) {
        Preconditions.checkNotNull(context);
        if (zzvq == null) {
            synchronized (zzat.class) {
                if (zzvq == null) {
                    Clock defaultClock = DefaultClock.getInstance();
                    long elapsedRealtime = defaultClock.elapsedRealtime();
                    zzat zzatVar = new zzat(new zzav(context));
                    zzvq = zzatVar;
                    GoogleAnalytics.zzn();
                    long elapsedRealtime2 = defaultClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = zzcc.zzaaa.get().longValue();
                    if (elapsedRealtime2 > longValue) {
                        zzatVar.zzbu().zzc("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zzvq;
    }

    public final Context getContext() {
        return this.zzqx;
    }

    public final Clock zzbt() {
        return this.zzro;
    }

    public final zzcm zzbu() {
        zza(this.zzvt);
        return this.zzvt;
    }

    public final zzbu zzbv() {
        return this.zzvs;
    }

    public final com.google.android.gms.analytics.zzk zzbw() {
        Preconditions.checkNotNull(this.zzvu);
        return this.zzvu;
    }

    public final zzai zzby() {
        zza(this.zzvv);
        return this.zzvv;
    }

    public final zzbz zzbz() {
        zza(this.zzvw);
        return this.zzvw;
    }

    public final zzde zzca() {
        zza(this.zzvx);
        return this.zzvx;
    }

    public final zzcq zzcb() {
        zza(this.zzvy);
        return this.zzvy;
    }

    public final zzbe zzce() {
        zza(this.zzwc);
        return this.zzwc;
    }

    public final zzby zzcf() {
        return this.zzwd;
    }

    public final Context zzci() {
        return this.zzvr;
    }

    public final zzcm zzcj() {
        return this.zzvt;
    }

    public final GoogleAnalytics zzck() {
        Preconditions.checkNotNull(this.zzvz);
        Preconditions.checkArgument(this.zzvz.isInitialized(), "Analytics instance not initialized");
        return this.zzvz;
    }

    public final zzcq zzcl() {
        if (this.zzvy == null || !this.zzvy.isInitialized()) {
            return null;
        }
        return this.zzvy;
    }

    public final zzah zzcm() {
        zza(this.zzwb);
        return this.zzwb;
    }

    public final zzbl zzcn() {
        zza(this.zzwa);
        return this.zzwa;
    }
}
