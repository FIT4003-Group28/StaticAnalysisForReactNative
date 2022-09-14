package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzp implements Runnable {
    private final /* synthetic */ Map zzst;
    private final /* synthetic */ boolean zzsu;
    private final /* synthetic */ String zzsv;
    private final /* synthetic */ long zzsw;
    private final /* synthetic */ boolean zzsx;
    private final /* synthetic */ boolean zzsy;
    private final /* synthetic */ String zzsz;
    private final /* synthetic */ Tracker zzta;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.zzta = tracker;
        this.zzst = map;
        this.zzsu = z;
        this.zzsv = str;
        this.zzsw = j;
        this.zzsx = z2;
        this.zzsy = z3;
        this.zzsz = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzah zzcd;
        zzbe zzce;
        zzby zzcf;
        zzby zzcf2;
        zzai zzby;
        zzai zzby2;
        zzcm zzbu;
        zzck zzckVar;
        zzcm zzbu2;
        if (this.zzta.zzsq.zzad()) {
            this.zzst.put("sc", "start");
        }
        Map map = this.zzst;
        GoogleAnalytics zzbx = this.zzta.zzbx();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        zzdd.zzc(map, "cid", zzbx.zzh().zzcn().zzdn());
        String str = (String) this.zzst.get("sf");
        if (str != null) {
            double zza = zzdd.zza(str, 100.0d);
            if (zzdd.zza(zza, (String) this.zzst.get("cid"))) {
                this.zzta.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(zza));
                return;
            }
        }
        zzcd = this.zzta.zzcd();
        if (this.zzsu) {
            zzdd.zzb(this.zzst, "ate", zzcd.zzbc());
            zzdd.zzb(this.zzst, "adid", zzcd.zzbj());
        } else {
            this.zzst.remove("ate");
            this.zzst.remove("adid");
        }
        zzce = this.zzta.zzce();
        zzu zzdb = zzce.zzdb();
        zzdd.zzb(this.zzst, "an", zzdb.zzaf());
        zzdd.zzb(this.zzst, "av", zzdb.zzag());
        zzdd.zzb(this.zzst, "aid", zzdb.zzah());
        zzdd.zzb(this.zzst, "aiid", zzdb.zzai());
        this.zzst.put("v", "1");
        this.zzst.put("_v", zzas.zzvp);
        Map map2 = this.zzst;
        zzcf = this.zzta.zzcf();
        zzdd.zzb(map2, "ul", zzcf.zzeg().getLanguage());
        Map map3 = this.zzst;
        zzcf2 = this.zzta.zzcf();
        zzdd.zzb(map3, "sr", zzcf2.zzeh());
        if (!(this.zzsv.equals("transaction") || this.zzsv.equals("item"))) {
            zzckVar = this.zzta.zzsp;
            if (!zzckVar.zzes()) {
                zzbu2 = this.zzta.zzbu();
                zzbu2.zza(this.zzst, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zzae = zzdd.zzae((String) this.zzst.get("ht"));
        if (zzae == 0) {
            zzae = this.zzsw;
        }
        long j = zzae;
        if (this.zzsx) {
            zzch zzchVar = new zzch(this.zzta, this.zzst, j, this.zzsy);
            zzbu = this.zzta.zzbu();
            zzbu.zzc("Dry run enabled. Would have sent hit", zzchVar);
            return;
        }
        String str2 = (String) this.zzst.get("cid");
        HashMap hashMap = new HashMap();
        zzdd.zza(hashMap, "uid", this.zzst);
        zzdd.zza(hashMap, "an", this.zzst);
        zzdd.zza(hashMap, "aid", this.zzst);
        zzdd.zza(hashMap, "av", this.zzst);
        zzdd.zza(hashMap, "aiid", this.zzst);
        zzaw zzawVar = new zzaw(0L, str2, this.zzsz, !TextUtils.isEmpty((CharSequence) this.zzst.get("adid")), 0L, hashMap);
        zzby = this.zzta.zzby();
        this.zzst.put("_s", String.valueOf(zzby.zza(zzawVar)));
        zzch zzchVar2 = new zzch(this.zzta, this.zzst, j, this.zzsy);
        zzby2 = this.zzta.zzby();
        zzby2.zza(zzchVar2);
    }
}
