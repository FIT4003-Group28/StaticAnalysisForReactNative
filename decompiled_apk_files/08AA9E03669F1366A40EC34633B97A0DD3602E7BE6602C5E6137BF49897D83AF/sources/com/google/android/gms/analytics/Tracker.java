package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
@VisibleForTesting
/* loaded from: classes.dex */
public class Tracker extends zzar {
    private boolean zzsm;
    private final Map<String, String> zzsn;
    private final Map<String, String> zzso;
    private final zzck zzsp;
    private final zza zzsq;
    private ExceptionReporter zzsr;
    private zzdc zzss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class zza extends zzar implements GoogleAnalytics.zza {
        private boolean zztb;
        private int zztc;
        private long zztd;
        private boolean zzte;
        private long zztf;

        protected zza(zzat zzatVar) {
            super(zzatVar);
            this.zztd = -1L;
        }

        private final void zzae() {
            if (this.zztd >= 0 || this.zztb) {
                zzbx().zza(Tracker.this.zzsq);
            } else {
                zzbx().zzb(Tracker.this.zzsq);
            }
        }

        public final void enableAutoActivityTracking(boolean z) {
            this.zztb = z;
            zzae();
        }

        public final void setSessionTimeout(long j) {
            this.zztd = j;
            zzae();
        }

        @Override // com.google.android.gms.internal.measurement.zzar
        protected final void zzac() {
        }

        public final synchronized boolean zzad() {
            boolean z;
            z = this.zzte;
            this.zzte = false;
            return z;
        }

        @Override // com.google.android.gms.analytics.GoogleAnalytics.zza
        public final void zzc(Activity activity) {
            String canonicalName;
            if (this.zztc == 0) {
                if (zzbt().elapsedRealtime() >= this.zztf + Math.max(1000L, this.zztd)) {
                    this.zzte = true;
                }
            }
            this.zztc++;
            if (this.zztb) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Tracker.this.setCampaignParamsOnNextHit(intent.getData());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                Tracker tracker = Tracker.this;
                if (Tracker.this.zzss != null) {
                    zzdc zzdcVar = Tracker.this.zzss;
                    canonicalName = activity.getClass().getCanonicalName();
                    String str = zzdcVar.zzacc.get(canonicalName);
                    if (str != null) {
                        canonicalName = str;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                tracker.set("&cd", canonicalName);
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    Preconditions.checkNotNull(activity);
                    Intent intent2 = activity.getIntent();
                    String str2 = null;
                    if (intent2 != null) {
                        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            str2 = stringExtra;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("&dr", str2);
                    }
                }
                Tracker.this.send(hashMap);
            }
        }

        @Override // com.google.android.gms.analytics.GoogleAnalytics.zza
        public final void zzd(Activity activity) {
            this.zztc--;
            this.zztc = Math.max(0, this.zztc);
            if (this.zztc == 0) {
                this.zztf = zzbt().elapsedRealtime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tracker(zzat zzatVar, String str, zzck zzckVar) {
        super(zzatVar);
        this.zzsn = new HashMap();
        this.zzso = new HashMap();
        if (str != null) {
            this.zzsn.put("&tid", str);
        }
        this.zzsn.put("useSecure", "1");
        this.zzsn.put("&a", Integer.toString(new Random().nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER) + 1));
        this.zzsp = new zzck("tracking", zzbt());
        this.zzsq = new zza(zzatVar);
    }

    private static String zza(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!(key.startsWith("&") && key.length() >= 2)) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    private static void zza(Map<String, String> map, Map<String, String> map2) {
        Preconditions.checkNotNull(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String zza2 = zza(entry);
            if (zza2 != null) {
                map2.put(zza2, entry.getValue());
            }
        }
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.zzsm = z;
    }

    public void enableAutoActivityTracking(boolean z) {
        this.zzsq.enableAutoActivityTracking(z);
    }

    public void enableExceptionReporting(boolean z) {
        String str;
        synchronized (this) {
            if ((this.zzsr != null) == z) {
                return;
            }
            if (z) {
                this.zzsr = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), getContext());
                Thread.setDefaultUncaughtExceptionHandler(this.zzsr);
                str = "Uncaught exceptions will be reported to Google Analytics";
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.zzsr.zzl());
                str = "Uncaught exceptions will not be reported to Google Analytics";
            }
            zzp(str);
        }
    }

    public String get(String str) {
        zzch();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzsn.containsKey(str)) {
            return this.zzsn.get(str);
        }
        if (str.equals("&ul")) {
            return zzdd.zza(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzcc().zzdn();
        }
        if (str.equals("&sr")) {
            return zzcf().zzeh();
        }
        if (str.equals("&aid")) {
            return zzce().zzdb().zzah();
        }
        if (str.equals("&an")) {
            return zzce().zzdb().zzaf();
        }
        if (str.equals("&av")) {
            return zzce().zzdb().zzag();
        }
        if (!str.equals("&aiid")) {
            return null;
        }
        return zzce().zzdb().zzai();
    }

    public void send(Map<String, String> map) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        if (zzbx().getAppOptOut()) {
            zzq("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean isDryRunEnabled = zzbx().isDryRunEnabled();
        HashMap hashMap = new HashMap();
        zza(this.zzsn, hashMap);
        zza(map, hashMap);
        boolean zzb = zzdd.zzb(this.zzsn.get("useSecure"), true);
        Map<String, String> map2 = this.zzso;
        Preconditions.checkNotNull(hashMap);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String zza2 = zza(entry);
                if (zza2 != null && !hashMap.containsKey(zza2)) {
                    hashMap.put(zza2, entry.getValue());
                }
            }
        }
        this.zzso.clear();
        String str = hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            zzbu().zza(hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            zzbu().zza(hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z = this.zzsm;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(this.zzsn.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.zzsn.put("&a", Integer.toString(parseInt));
            }
        }
        zzbw().zza(new zzp(this, hashMap, z, str, currentTimeMillis, isDryRunEnabled, zzb, str2));
    }

    public void set(String str, String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzsn.put(str, str2);
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", zzdd.zzc(z));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.zzso.put("&ci", queryParameter2);
        }
        String queryParameter3 = parse.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.zzso.put("&anid", queryParameter3);
        }
        String queryParameter4 = parse.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.zzso.put("&cn", queryParameter4);
        }
        String queryParameter5 = parse.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.zzso.put("&cc", queryParameter5);
        }
        String queryParameter6 = parse.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.zzso.put("&cm", queryParameter6);
        }
        String queryParameter7 = parse.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.zzso.put("&cs", queryParameter7);
        }
        String queryParameter8 = parse.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.zzso.put("&ck", queryParameter8);
        }
        String queryParameter9 = parse.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.zzso.put("&dclid", queryParameter9);
        }
        String queryParameter10 = parse.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.zzso.put("&gclid", queryParameter10);
        }
        String queryParameter11 = parse.getQueryParameter("aclid");
        if (queryParameter11 == null) {
            return;
        }
        this.zzso.put("&aclid", queryParameter11);
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d2) {
        set("&sf", Double.toString(d2));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i < 0 && i2 < 0) {
            zzs("Invalid width or height. The values should be non-negative.");
            return;
        }
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        set("&sr", sb.toString());
    }

    public void setSessionTimeout(long j) {
        this.zzsq.setSessionTimeout(j * 1000);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", zzdd.zzc(z));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzdc zzdcVar) {
        zzp("Loading Tracker config values");
        this.zzss = zzdcVar;
        boolean z = false;
        if (this.zzss.zzabw != null) {
            String str = this.zzss.zzabw;
            set("&tid", str);
            zza("trackingId loaded", str);
        }
        if (this.zzss.zzabx >= 0.0d) {
            String d2 = Double.toString(this.zzss.zzabx);
            set("&sf", d2);
            zza("Sample frequency loaded", d2);
        }
        if (this.zzss.zzaby >= 0) {
            int i = this.zzss.zzaby;
            setSessionTimeout(i);
            zza("Session timeout loaded", Integer.valueOf(i));
        }
        if (this.zzss.zzabz != -1) {
            boolean z2 = this.zzss.zzabz == 1;
            enableAutoActivityTracking(z2);
            zza("Auto activity tracking loaded", Boolean.valueOf(z2));
        }
        if (this.zzss.zzaca != -1) {
            boolean z3 = this.zzss.zzaca == 1;
            if (z3) {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(z3));
        }
        if (this.zzss.zzacb == 1) {
            z = true;
        }
        enableExceptionReporting(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzsq.zzm();
        String zzaf = zzca().zzaf();
        if (zzaf != null) {
            set("&an", zzaf);
        }
        String zzag = zzca().zzag();
        if (zzag != null) {
            set("&av", zzag);
        }
    }
}
