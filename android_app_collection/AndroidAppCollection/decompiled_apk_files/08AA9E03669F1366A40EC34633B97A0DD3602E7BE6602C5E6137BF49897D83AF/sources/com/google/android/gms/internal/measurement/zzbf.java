package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbf extends zzar {
    private boolean started;
    private final zzbc zzxa;
    private final zzco zzxb;
    private final zzcn zzxc;
    private final zzax zzxd;
    private long zzxe;
    private final zzbw zzxf;
    private final zzbw zzxg;
    private final zzcz zzxh;
    private long zzxi;
    private boolean zzxj;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbf(zzat zzatVar, zzav zzavVar) {
        super(zzatVar);
        Preconditions.checkNotNull(zzavVar);
        this.zzxe = Long.MIN_VALUE;
        this.zzxc = new zzcn(zzatVar);
        this.zzxa = new zzbc(zzatVar);
        this.zzxb = new zzco(zzatVar);
        this.zzxd = new zzax(zzatVar);
        this.zzxh = new zzcz(zzbt());
        this.zzxf = new zzbg(this, zzatVar);
        this.zzxg = new zzbh(this, zzatVar);
    }

    private final void zza(zzaw zzawVar, zzv zzvVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzvVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzbs());
        zzaVar.zza(zzawVar.zzcp());
        zzaVar.enableAdvertisingIdCollection(zzawVar.zzcq());
        com.google.android.gms.analytics.zzg zzi = zzaVar.zzi();
        zzad zzadVar = (zzad) zzi.zzb(zzad.class);
        zzadVar.zzk(DataBufferSafeParcelable.DATA_FIELD);
        zzadVar.zzb(true);
        zzi.zza(zzvVar);
        zzy zzyVar = (zzy) zzi.zzb(zzy.class);
        zzu zzuVar = (zzu) zzi.zzb(zzu.class);
        for (Map.Entry<String, String> entry : zzawVar.zzcs().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzuVar.setAppName(value);
            } else if ("av".equals(key)) {
                zzuVar.setAppVersion(value);
            } else if ("aid".equals(key)) {
                zzuVar.setAppId(value);
            } else if ("aiid".equals(key)) {
                zzuVar.setAppInstallerId(value);
            } else if ("uid".equals(key)) {
                zzadVar.setUserId(value);
            } else {
                zzyVar.set(key, value);
            }
        }
        zzb("Sending installation campaign to", zzawVar.zzcp(), zzvVar);
        zzi.zza(zzcb().zzfb());
        zzi.zzs();
    }

    private final long zzcy() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        try {
            return this.zzxa.zzcy();
        } catch (SQLiteException e) {
            zze("Failed to get min/max hit times from local store", e);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdd() {
        zzb((zzca) new zzbj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzde() {
        try {
            this.zzxa.zzcx();
            zzdi();
        } catch (SQLiteException e) {
            zzd("Failed to delete stale hits", e);
        }
        this.zzxg.zzh(86400000L);
    }

    private final void zzdf() {
        if (!this.zzxj && zzbu.zzdt() && !this.zzxd.isConnected()) {
            if (!this.zzxh.zzj(zzcc.zzzy.get().longValue())) {
                return;
            }
            this.zzxh.start();
            zzp("Connecting to service");
            if (!this.zzxd.connect()) {
                return;
            }
            zzp("Connected to service");
            this.zzxh.clear();
            onServiceConnected();
        }
    }

    private final boolean zzdg() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        zzp("Dispatching a batch of local hits");
        boolean z = !this.zzxd.isConnected();
        boolean z2 = !this.zzxb.zzex();
        if (z && z2) {
            zzp("No network or service available. Will retry later");
            return false;
        }
        long max = Math.max(zzbu.zzdx(), zzbu.zzdy());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            try {
                try {
                    this.zzxa.beginTransaction();
                    arrayList.clear();
                    try {
                        List<zzch> zzd = this.zzxa.zzd(max);
                        if (zzd.isEmpty()) {
                            zzp("Store is empty, nothing to dispatch");
                            zzdk();
                            try {
                                this.zzxa.setTransactionSuccessful();
                                this.zzxa.endTransaction();
                                return false;
                            } catch (SQLiteException e) {
                                zze("Failed to commit local dispatch transaction", e);
                                zzdk();
                                return false;
                            }
                        }
                        zza("Hits loaded from store. count", Integer.valueOf(zzd.size()));
                        Iterator<zzch> it = zzd.iterator();
                        while (it.hasNext()) {
                            if (it.next().zzem() == j) {
                                zzd("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(zzd.size()));
                                zzdk();
                                try {
                                    this.zzxa.setTransactionSuccessful();
                                    this.zzxa.endTransaction();
                                    return false;
                                } catch (SQLiteException e2) {
                                    zze("Failed to commit local dispatch transaction", e2);
                                    zzdk();
                                    return false;
                                }
                            }
                        }
                        if (this.zzxd.isConnected()) {
                            zzp("Service connected, sending hits to the service");
                            while (!zzd.isEmpty()) {
                                zzch zzchVar = zzd.get(0);
                                if (!this.zzxd.zzb(zzchVar)) {
                                    break;
                                }
                                j = Math.max(j, zzchVar.zzem());
                                zzd.remove(zzchVar);
                                zzb("Hit sent do device AnalyticsService for delivery", zzchVar);
                                try {
                                    this.zzxa.zze(zzchVar.zzem());
                                    arrayList.add(Long.valueOf(zzchVar.zzem()));
                                } catch (SQLiteException e3) {
                                    zze("Failed to remove hit that was send for delivery", e3);
                                    zzdk();
                                    try {
                                        this.zzxa.setTransactionSuccessful();
                                        this.zzxa.endTransaction();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        zze("Failed to commit local dispatch transaction", e4);
                                        zzdk();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzxb.zzex()) {
                            List<Long> zzb = this.zzxb.zzb(zzd);
                            for (Long l : zzb) {
                                j = Math.max(j, l.longValue());
                            }
                            try {
                                this.zzxa.zza(zzb);
                                arrayList.addAll(zzb);
                            } catch (SQLiteException e5) {
                                zze("Failed to remove successfully uploaded hits", e5);
                                zzdk();
                                try {
                                    this.zzxa.setTransactionSuccessful();
                                    this.zzxa.endTransaction();
                                    return false;
                                } catch (SQLiteException e6) {
                                    zze("Failed to commit local dispatch transaction", e6);
                                    zzdk();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzxa.setTransactionSuccessful();
                                this.zzxa.endTransaction();
                                return false;
                            } catch (SQLiteException e7) {
                                zze("Failed to commit local dispatch transaction", e7);
                                zzdk();
                                return false;
                            }
                        }
                        try {
                            this.zzxa.setTransactionSuccessful();
                            this.zzxa.endTransaction();
                        } catch (SQLiteException e8) {
                            zze("Failed to commit local dispatch transaction", e8);
                            zzdk();
                            return false;
                        }
                    } catch (SQLiteException e9) {
                        zzd("Failed to read hits from persisted store", e9);
                        zzdk();
                        try {
                            this.zzxa.setTransactionSuccessful();
                            this.zzxa.endTransaction();
                            return false;
                        } catch (SQLiteException e10) {
                            zze("Failed to commit local dispatch transaction", e10);
                            zzdk();
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    this.zzxa.setTransactionSuccessful();
                    this.zzxa.endTransaction();
                    throw th;
                }
                this.zzxa.setTransactionSuccessful();
                this.zzxa.endTransaction();
                throw th;
            } catch (SQLiteException e11) {
                zze("Failed to commit local dispatch transaction", e11);
                zzdk();
                return false;
            }
        }
    }

    private final void zzdj() {
        zzbz zzbz = zzbz();
        if (zzbz.zzei() && !zzbz.zzef()) {
            long zzcy = zzcy();
            if (zzcy == 0 || Math.abs(zzbt().currentTimeMillis() - zzcy) > zzcc.zzyx.get().longValue()) {
                return;
            }
            zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzbu.zzdw()));
            zzbz.zzej();
        }
    }

    private final void zzdk() {
        if (this.zzxf.zzef()) {
            zzp("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzxf.cancel();
        zzbz zzbz = zzbz();
        if (zzbz.zzef()) {
            zzbz.cancel();
        }
    }

    private final long zzdl() {
        if (this.zzxe != Long.MIN_VALUE) {
            return this.zzxe;
        }
        long longValue = zzcc.zzys.get().longValue();
        zzde zzca = zzca();
        zzca.zzch();
        if (!zzca.zzacf) {
            return longValue;
        }
        zzde zzca2 = zzca();
        zzca2.zzch();
        return zzca2.zzaah * 1000;
    }

    private final void zzdm() {
        zzch();
        com.google.android.gms.analytics.zzk.zzab();
        this.zzxj = true;
        this.zzxd.disconnect();
        zzdi();
    }

    private final boolean zzw(String str) {
        return Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[LOOP:1: B:16:0x0044->B:23:0x0060, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected() {
        /*
            r5 = this;
            com.google.android.gms.analytics.zzk.zzab()
            com.google.android.gms.analytics.zzk.zzab()
            r5.zzch()
            boolean r0 = com.google.android.gms.internal.measurement.zzbu.zzdt()
            if (r0 != 0) goto L14
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.zzs(r0)
        L14:
            com.google.android.gms.internal.measurement.zzax r0 = r5.zzxd
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L22
            java.lang.String r0 = "Service not connected"
            r5.zzp(r0)
            return
        L22:
            com.google.android.gms.internal.measurement.zzbc r0 = r5.zzxa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7d
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.zzp(r0)
        L2f:
            com.google.android.gms.internal.measurement.zzbc r0 = r5.zzxa     // Catch: android.database.sqlite.SQLiteException -> L74
            int r1 = com.google.android.gms.internal.measurement.zzbu.zzdx()     // Catch: android.database.sqlite.SQLiteException -> L74
            long r1 = (long) r1     // Catch: android.database.sqlite.SQLiteException -> L74
            java.util.List r0 = r0.zzd(r1)     // Catch: android.database.sqlite.SQLiteException -> L74
            boolean r1 = r0.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L74
            if (r1 == 0) goto L44
            r5.zzdi()     // Catch: android.database.sqlite.SQLiteException -> L74
            return
        L44:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2f
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzch r1 = (com.google.android.gms.internal.measurement.zzch) r1
            com.google.android.gms.internal.measurement.zzax r2 = r5.zzxd
            boolean r2 = r2.zzb(r1)
            if (r2 != 0) goto L5d
            r5.zzdi()
            return
        L5d:
            r0.remove(r1)
            com.google.android.gms.internal.measurement.zzbc r2 = r5.zzxa     // Catch: android.database.sqlite.SQLiteException -> L6a
            long r3 = r1.zzem()     // Catch: android.database.sqlite.SQLiteException -> L6a
            r2.zze(r3)     // Catch: android.database.sqlite.SQLiteException -> L6a
            goto L44
        L6a:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.zze(r1, r0)
            r5.zzdk()
            return
        L74:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.zze(r1, r0)
            r5.zzdk()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbf.onServiceConnected():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void start() {
        zzch();
        Preconditions.checkState(!this.started, "Analytics backend already started");
        this.started = true;
        zzbw().zza(new zzbi(this));
    }

    public final long zza(zzaw zzawVar, boolean z) {
        Preconditions.checkNotNull(zzawVar);
        zzch();
        com.google.android.gms.analytics.zzk.zzab();
        try {
            try {
                this.zzxa.beginTransaction();
                zzbc zzbcVar = this.zzxa;
                long zzco = zzawVar.zzco();
                String zzaz = zzawVar.zzaz();
                Preconditions.checkNotEmpty(zzaz);
                zzbcVar.zzch();
                com.google.android.gms.analytics.zzk.zzab();
                int delete = zzbcVar.getWritableDatabase().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(zzco), zzaz});
                if (delete > 0) {
                    zzbcVar.zza("Deleted property records", Integer.valueOf(delete));
                }
                long zza = this.zzxa.zza(zzawVar.zzco(), zzawVar.zzaz(), zzawVar.zzcp());
                zzawVar.zzb(1 + zza);
                zzbc zzbcVar2 = this.zzxa;
                Preconditions.checkNotNull(zzawVar);
                zzbcVar2.zzch();
                com.google.android.gms.analytics.zzk.zzab();
                SQLiteDatabase writableDatabase = zzbcVar2.getWritableDatabase();
                Map<String, String> zzcs = zzawVar.zzcs();
                Preconditions.checkNotNull(zzcs);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzcs.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", Long.valueOf(zzawVar.zzco()));
                contentValues.put("cid", zzawVar.zzaz());
                contentValues.put("tid", zzawVar.zzcp());
                contentValues.put("adid", Integer.valueOf(zzawVar.zzcq() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzawVar.zzcr()));
                contentValues.put("params", encodedQuery);
                try {
                    if (writableDatabase.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzbcVar2.zzt("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e) {
                    zzbcVar2.zze("Error storing a property", e);
                }
                this.zzxa.setTransactionSuccessful();
                try {
                    this.zzxa.endTransaction();
                    return zza;
                } catch (SQLiteException e2) {
                    zze("Failed to end transaction", e2);
                    return zza;
                }
            } catch (SQLiteException e3) {
                zze("Failed to update Analytics property", e3);
                try {
                    this.zzxa.endTransaction();
                    return -1L;
                } catch (SQLiteException e4) {
                    zze("Failed to end transaction", e4);
                    return -1L;
                }
            }
        } catch (Throwable th) {
            try {
                this.zzxa.endTransaction();
            } catch (SQLiteException e5) {
                zze("Failed to end transaction", e5);
            }
            throw th;
        }
    }

    public final void zza(zzch zzchVar) {
        Pair<String, Long> zzfi;
        Preconditions.checkNotNull(zzchVar);
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (this.zzxj) {
            zzq("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zza("Delivering hit", zzchVar);
        }
        if (TextUtils.isEmpty(zzchVar.zzer()) && (zzfi = zzcb().zzfg().zzfi()) != null) {
            String str = (String) zzfi.first;
            String valueOf = String.valueOf((Long) zzfi.second);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(zzchVar.zzcs());
            hashMap.put("_m", sb2);
            zzchVar = new zzch(this, hashMap, zzchVar.zzen(), zzchVar.zzep(), zzchVar.zzem(), zzchVar.zzel(), zzchVar.zzeo());
        }
        zzdf();
        if (this.zzxd.zzb(zzchVar)) {
            zzq("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.zzxa.zzc(zzchVar);
            zzdi();
        } catch (SQLiteException e) {
            zze("Delivery failed to save hit to a database", e);
            zzbu().zza(zzchVar, "deliver: failed to insert hit to database");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzxa.zzm();
        this.zzxb.zzm();
        this.zzxd.zzm();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(zzaw zzawVar) {
        com.google.android.gms.analytics.zzk.zzab();
        zzb("Sending first hit to property", zzawVar.zzcp());
        if (zzcb().zzfc().zzj(zzbu.zzed())) {
            return;
        }
        String zzff = zzcb().zzff();
        if (TextUtils.isEmpty(zzff)) {
            return;
        }
        zzv zza = zzdd.zza(zzbu(), zzff);
        zzb("Found relevant installation campaign", zza);
        zza(zzawVar, zza);
    }

    public final void zzb(zzca zzcaVar) {
        long j = this.zzxi;
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        long zzfd = zzcb().zzfd();
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzfd != 0 ? Math.abs(zzbt().currentTimeMillis() - zzfd) : -1L));
        zzdf();
        try {
            zzdg();
            zzcb().zzfe();
            zzdi();
            if (zzcaVar != null) {
                zzcaVar.zza(null);
            }
            if (this.zzxi == j) {
                return;
            }
            this.zzxc.zzew();
        } catch (Exception e) {
            zze("Local dispatch failed", e);
            zzcb().zzfe();
            zzdi();
            if (zzcaVar == null) {
                return;
            }
            zzcaVar.zza(e);
        }
    }

    public final void zzbn() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        zzp("Delete all hits from local store");
        try {
            zzbc zzbcVar = this.zzxa;
            com.google.android.gms.analytics.zzk.zzab();
            zzbcVar.zzch();
            zzbcVar.getWritableDatabase().delete("hits2", null, null);
            zzbc zzbcVar2 = this.zzxa;
            com.google.android.gms.analytics.zzk.zzab();
            zzbcVar2.zzch();
            zzbcVar2.getWritableDatabase().delete("properties", null, null);
            zzdi();
        } catch (SQLiteException e) {
            zzd("Failed to delete hits from store", e);
        }
        zzdf();
        if (this.zzxd.zzct()) {
            zzp("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbr() {
        com.google.android.gms.analytics.zzk.zzab();
        this.zzxi = zzbt().currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzdc() {
        zzch();
        com.google.android.gms.analytics.zzk.zzab();
        Context context = zzbs().getContext();
        if (!zzct.zza(context)) {
            zzs("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzcu.zze(context)) {
            zzt("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zza(context)) {
            zzs("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzcb().zzfb();
        if (!zzw("android.permission.ACCESS_NETWORK_STATE")) {
            zzt("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzdm();
        }
        if (!zzw("android.permission.INTERNET")) {
            zzt("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzdm();
        }
        if (zzcu.zze(getContext())) {
            zzp("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzs("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzxj && !this.zzxa.isEmpty()) {
            zzdf();
        }
        zzdi();
    }

    public final void zzdh() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        zzq("Sync dispatching local hits");
        long j = this.zzxi;
        zzdf();
        try {
            zzdg();
            zzcb().zzfe();
            zzdi();
            if (this.zzxi == j) {
                return;
            }
            this.zzxc.zzew();
        } catch (Exception e) {
            zze("Sync local dispatch failed", e);
            zzdi();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r4 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzdi() {
        /*
            r8 = this;
            com.google.android.gms.analytics.zzk.zzab()
            r8.zzch()
            boolean r0 = r8.zzxj
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            long r4 = r8.zzdl()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L23
            com.google.android.gms.internal.measurement.zzcn r0 = r8.zzxc
            r0.unregister()
            r8.zzdk()
            return
        L23:
            com.google.android.gms.internal.measurement.zzbc r0 = r8.zzxa
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            com.google.android.gms.internal.measurement.zzcn r0 = r8.zzxc
            r0.unregister()
            r8.zzdk()
            return
        L34:
            com.google.android.gms.internal.measurement.zzcd<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.zzcc.zzzt
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4d
            com.google.android.gms.internal.measurement.zzcn r0 = r8.zzxc
            r0.zzeu()
            com.google.android.gms.internal.measurement.zzcn r0 = r8.zzxc
            boolean r1 = r0.isConnected()
        L4d:
            if (r1 == 0) goto La8
            r8.zzdj()
            long r0 = r8.zzdl()
            com.google.android.gms.internal.measurement.zzcq r4 = r8.zzcb()
            long r4 = r4.zzfd()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L76
            com.google.android.gms.common.util.Clock r6 = r8.zzbt()
            long r6 = r6.currentTimeMillis()
            long r6 = r6 - r4
            long r4 = java.lang.Math.abs(r6)
            long r4 = r0 - r4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L76
            goto L7e
        L76:
            long r2 = com.google.android.gms.internal.measurement.zzbu.zzdv()
            long r4 = java.lang.Math.min(r2, r0)
        L7e:
            java.lang.String r0 = "Dispatch scheduled (ms)"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r8.zza(r0, r1)
            com.google.android.gms.internal.measurement.zzbw r0 = r8.zzxf
            boolean r0 = r0.zzef()
            if (r0 == 0) goto La2
            r0 = 1
            com.google.android.gms.internal.measurement.zzbw r2 = r8.zzxf
            long r2 = r2.zzee()
            long r4 = r4 + r2
            long r0 = java.lang.Math.max(r0, r4)
            com.google.android.gms.internal.measurement.zzbw r2 = r8.zzxf
            r2.zzi(r0)
            return
        La2:
            com.google.android.gms.internal.measurement.zzbw r0 = r8.zzxf
            r0.zzh(r4)
            return
        La8:
            r8.zzdk()
            r8.zzdj()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbf.zzdi():void");
    }

    public final void zzg(long j) {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (j < 0) {
            j = 0;
        }
        this.zzxe = j;
        zzdi();
    }

    public final void zzx(String str) {
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.analytics.zzk.zzab();
        zzv zza = zzdd.zza(zzbu(), str);
        if (zza == null) {
            zzd("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzff = zzcb().zzff();
        if (str.equals(zzff)) {
            zzs("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(zzff)) {
            zzd("Ignoring multiple install campaigns. original, new", zzff, str);
        } else {
            zzcb().zzab(str);
            if (zzcb().zzfc().zzj(zzbu.zzed())) {
                zzd("Campaign received too late, ignoring", zza);
                return;
            }
            zzb("Received installation campaign", zza);
            for (zzaw zzawVar : this.zzxa.zzf(0L)) {
                zza(zzawVar, zza);
            }
        }
    }
}
