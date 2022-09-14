package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfu implements zzbe {
    private final String zzaaz;
    private final zzfx zzbcp;
    private final zzfw zzbcq;
    private final Context zzqx;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzfu(Context context, zzfw zzfwVar) {
        this(new zzfv(), context, zzfwVar);
    }

    @VisibleForTesting
    private zzfu(zzfx zzfxVar, Context context, zzfw zzfwVar) {
        this.zzbcp = zzfxVar;
        this.zzqx = context.getApplicationContext();
        this.zzbcq = zzfwVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.zzaaz = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "4.00", str, str2, Build.MODEL, Build.ID);
    }

    @VisibleForTesting
    private static URL zzd(zzbw zzbwVar) {
        try {
            return new URL(zzbwVar.zznr());
        } catch (MalformedURLException unused) {
            zzdi.e("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: IOException -> 0x0083, TryCatch #0 {IOException -> 0x0083, blocks: (B:8:0x0029, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:26:0x007f, B:27:0x0082), top: B:36:0x0029 }] */
    @Override // com.google.android.gms.tagmanager.zzbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.util.List<com.google.android.gms.tagmanager.zzbw> r11) {
        /*
            r10 = this;
            int r0 = r11.size()
            r1 = 40
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 1
            r2 = 0
            r3 = 1
        Le:
            if (r2 >= r0) goto Lb6
            java.lang.Object r4 = r11.get(r2)
            com.google.android.gms.tagmanager.zzbw r4 = (com.google.android.gms.tagmanager.zzbw) r4
            java.net.URL r5 = zzd(r4)
            if (r5 != 0) goto L28
            java.lang.String r5 = "No destination: discarding hit."
            com.google.android.gms.tagmanager.zzdi.zzaa(r5)
            com.google.android.gms.tagmanager.zzfw r5 = r10.zzbcq
            r5.zzb(r4)
            goto Lb2
        L28:
            r6 = 0
            com.google.android.gms.tagmanager.zzfx r7 = r10.zzbcp     // Catch: java.io.IOException -> L83
            java.net.HttpURLConnection r5 = r7.zzc(r5)     // Catch: java.io.IOException -> L83
            if (r3 == 0) goto L3b
            android.content.Context r7 = r10.zzqx     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.tagmanager.zzdn.zzp(r7)     // Catch: java.lang.Throwable -> L38
            r3 = 0
            goto L3b
        L38:
            r7 = move-exception
            r8 = r6
            goto L7a
        L3b:
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r10.zzaaz     // Catch: java.lang.Throwable -> L38
            r5.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L38
            int r7 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L38
            java.io.InputStream r8 = r5.getInputStream()     // Catch: java.lang.Throwable -> L38
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 == r6) goto L6c
            r6 = 25
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "Bad response: "
            r9.append(r6)     // Catch: java.lang.Throwable -> L6a
            r9.append(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.tagmanager.zzdi.zzaa(r6)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.tagmanager.zzfw r6 = r10.zzbcq     // Catch: java.lang.Throwable -> L6a
            r6.zzc(r4)     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r7 = move-exception
            goto L7a
        L6c:
            com.google.android.gms.tagmanager.zzfw r6 = r10.zzbcq     // Catch: java.lang.Throwable -> L6a
            r6.zza(r4)     // Catch: java.lang.Throwable -> L6a
        L71:
            if (r8 == 0) goto L76
            r8.close()     // Catch: java.io.IOException -> L83
        L76:
            r5.disconnect()     // Catch: java.io.IOException -> L83
            goto Lb2
        L7a:
            if (r8 == 0) goto L7f
            r8.close()     // Catch: java.io.IOException -> L83
        L7f:
            r5.disconnect()     // Catch: java.io.IOException -> L83
            throw r7     // Catch: java.io.IOException -> L83
        L83:
            r5 = move-exception
            java.lang.String r6 = "Exception sending hit: "
            java.lang.Class r7 = r5.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            if (r8 == 0) goto L9d
            java.lang.String r6 = r6.concat(r7)
            goto La3
        L9d:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        La3:
            com.google.android.gms.tagmanager.zzdi.zzaa(r6)
            java.lang.String r5 = r5.getMessage()
            com.google.android.gms.tagmanager.zzdi.zzaa(r5)
            com.google.android.gms.tagmanager.zzfw r5 = r10.zzbcq
            r5.zzc(r4)
        Lb2:
            int r2 = r2 + 1
            goto Le
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfu.zze(java.util.List):void");
    }

    @Override // com.google.android.gms.tagmanager.zzbe
    public final boolean zzng() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzqx.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzdi.v("...no network connectivity");
            return false;
        }
        return true;
    }
}
