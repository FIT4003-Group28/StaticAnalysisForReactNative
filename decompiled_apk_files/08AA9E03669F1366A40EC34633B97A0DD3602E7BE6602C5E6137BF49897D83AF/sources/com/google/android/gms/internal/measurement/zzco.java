package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import b.a.a.a.a.b.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzco extends zzar {
    private static final byte[] zzabb = "\n".getBytes();
    private final String zzaaz;
    private final zzcz zzaba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(zzat zzatVar) {
        super(zzatVar);
        this.zzaaz = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzas.VERSION, Build.VERSION.RELEASE, zzdd.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzaba = new zzcz(zzatVar.zzbt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.URL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(java.net.URL r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.String r0 = "GET request"
            r4.zzb(r0, r5)
            r0 = 0
            java.net.HttpURLConnection r5 = r4.zzb(r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3a
            r5.connect()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r4.zza(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            int r0 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L22
            com.google.android.gms.internal.measurement.zzai r1 = r4.zzby()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r1.zzbr()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
        L22:
            java.lang.String r1 = "GET status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r4.zzb(r1, r2)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            if (r5 == 0) goto L30
            r5.disconnect()
        L30:
            return r0
        L31:
            r0 = move-exception
            goto L4a
        L33:
            r0 = move-exception
            goto L3e
        L35:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L4a
        L3a:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L3e:
            java.lang.String r1 = "Network GET connection error"
            r4.zzd(r1, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L48
            r5.disconnect()
        L48:
            r5 = 0
            return r5
        L4a:
            if (r5 == 0) goto L4f
            r5.disconnect()
        L4f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzco.zza(java.net.URL):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.measurement.zzaq, com.google.android.gms.internal.measurement.zzco] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.URL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.net.HttpURLConnection] */
    private final int zza(URL url, byte[] bArr) {
        OutputStream outputStream;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        zzb("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (zzcg()) {
            zza("Post payload\n", new String(bArr));
        }
        OutputStream outputStream2 = null;
        try {
            try {
                getContext().getPackageName();
                url = zzb(url);
                try {
                    url.setDoOutput(true);
                    url.setFixedLengthStreamingMode(bArr.length);
                    url.connect();
                    outputStream = url.getOutputStream();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            url = 0;
        } catch (Throwable th2) {
            th = th2;
            url = 0;
        }
        try {
            outputStream.write(bArr);
            zza(url);
            int responseCode = url.getResponseCode();
            if (responseCode == 200) {
                zzby().zzbr();
            }
            zzb("POST status", Integer.valueOf(responseCode));
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    zze("Error closing http post connection output stream", e3);
                }
            }
            if (url != 0) {
                url.disconnect();
            }
            return responseCode;
        } catch (IOException e4) {
            e = e4;
            outputStream2 = outputStream;
            zzd("Network POST connection error", e);
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException e5) {
                    zze("Error closing http post connection output stream", e5);
                }
            }
            if (url == 0) {
                return 0;
            }
            url.disconnect();
            return 0;
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException e6) {
                    zze("Error closing http post connection output stream", e6);
                }
            }
            if (url != 0) {
                url.disconnect();
            }
            throw th;
        }
    }

    private static void zza(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    private final void zza(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream == null) {
                    return;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zze("Error closing http connection input stream", e);
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zze("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzb(java.net.URL r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzco.zzb(java.net.URL, byte[]):int");
    }

    @VisibleForTesting
    private final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(zzcc.zzzo.get().intValue());
        httpURLConnection.setReadTimeout(zzcc.zzzp.get().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(a.HEADER_USER_AGENT, this.zzaaz);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    private final URL zzb(zzch zzchVar, String str) {
        String zzea;
        String zzeb;
        StringBuilder sb;
        if (zzchVar.zzep()) {
            zzea = zzbu.zzdz();
            zzeb = zzbu.zzeb();
            sb = new StringBuilder(String.valueOf(zzea).length() + 1 + String.valueOf(zzeb).length() + String.valueOf(str).length());
        } else {
            zzea = zzbu.zzea();
            zzeb = zzbu.zzeb();
            sb = new StringBuilder(String.valueOf(zzea).length() + 1 + String.valueOf(zzeb).length() + String.valueOf(str).length());
        }
        sb.append(zzea);
        sb.append(zzeb);
        sb.append("?");
        sb.append(str);
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzd(zzch zzchVar) {
        String valueOf;
        String valueOf2;
        String str;
        String str2;
        if (zzchVar.zzep()) {
            valueOf = String.valueOf(zzbu.zzdz());
            valueOf2 = String.valueOf(zzbu.zzeb());
            if (valueOf2.length() == 0) {
                str = new String(valueOf);
                str2 = str;
            }
            str2 = valueOf.concat(valueOf2);
        } else {
            valueOf = String.valueOf(zzbu.zzea());
            valueOf2 = String.valueOf(zzbu.zzeb());
            if (valueOf2.length() == 0) {
                str = new String(valueOf);
                str2 = str;
            }
            str2 = valueOf.concat(valueOf2);
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzey() {
        String valueOf = String.valueOf(zzbu.zzdz());
        String valueOf2 = String.valueOf(zzcc.zzzd.get());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final String zza(zzch zzchVar, boolean z) {
        Preconditions.checkNotNull(zzchVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzchVar.zzcs().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zza(sb, key, entry.getValue());
                }
            }
            zza(sb, "ht", String.valueOf(zzchVar.zzen()));
            zza(sb, "qt", String.valueOf(zzbt().currentTimeMillis() - zzchVar.zzen()));
            if (z) {
                long zzeq = zzchVar.zzeq();
                zza(sb, "z", zzeq != 0 ? String.valueOf(zzeq) : String.valueOf(zzchVar.zzem()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        zza("Network initialized. User agent", this.zzaaz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
        if (zza(r5) == 200) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0190, code lost:
        if (zza(r6, r5) == 200) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab A[EDGE_INSN: B:77:0x01ab->B:74:0x01ab ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Long> zzb(java.util.List<com.google.android.gms.internal.measurement.zzch> r9) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzco.zzb(java.util.List):java.util.List");
    }

    public final boolean zzex() {
        NetworkInfo networkInfo;
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        try {
            networkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            zzp("No network connectivity");
            return false;
        }
        return true;
    }
}
