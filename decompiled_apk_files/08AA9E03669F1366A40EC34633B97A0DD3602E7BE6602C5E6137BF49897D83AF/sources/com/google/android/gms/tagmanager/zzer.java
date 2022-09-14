package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzacg;
import com.google.android.gms.internal.measurement.zzwb;
import com.google.android.gms.internal.measurement.zzwm;
import com.google.android.gms.internal.measurement.zzwn;
import com.google.android.gms.internal.measurement.zzwo;
import com.google.android.gms.tagmanager.zzeh;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
final class zzer implements Runnable {
    private final String zzavt;
    private volatile String zzawt;
    private final zzwn zzbas;
    private final String zzbat;
    private zzdh<com.google.android.gms.internal.measurement.zzl> zzbau;
    private volatile zzal zzbav;
    private volatile String zzbaw;
    private final Context zzqx;

    @VisibleForTesting
    private zzer(Context context, String str, zzwn zzwnVar, zzal zzalVar) {
        this.zzqx = context;
        this.zzbas = zzwnVar;
        this.zzavt = str;
        this.zzbav = zzalVar;
        String valueOf = String.valueOf("/r?id=");
        String valueOf2 = String.valueOf(str);
        this.zzbat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.zzawt = this.zzbat;
        this.zzbaw = null;
    }

    public zzer(Context context, String str, zzal zzalVar) {
        this(context, str, new zzwn(), zzalVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.zzbau == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.zzbau.zzmr();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzqx.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzdi.v("...no network connectivity");
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.zzbau.zzq(zzcz.zzazi);
            return;
        }
        zzdi.v("Start loading resource from network ...");
        String zzmy = this.zzbav.zzmy();
        String str = this.zzawt;
        StringBuilder sb = new StringBuilder(String.valueOf(zzmy).length() + 12 + String.valueOf(str).length());
        sb.append(zzmy);
        sb.append(str);
        sb.append("&v=a65833898");
        String sb2 = sb.toString();
        if (this.zzbaw != null && !this.zzbaw.trim().equals("")) {
            String valueOf = String.valueOf(sb2);
            String str2 = this.zzbaw;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str2).length());
            sb3.append(valueOf);
            sb3.append("&pv=");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (zzeh.zzof().zzog().equals(zzeh.zza.CONTAINER_DEBUG)) {
            String valueOf2 = String.valueOf(sb2);
            String valueOf3 = String.valueOf("&gtm_debug=x");
            sb2 = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
        }
        zzwm zzsa = zzwn.zzsa();
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = zzsa.zzej(sb2);
                } catch (zzwo unused) {
                    String valueOf4 = String.valueOf(sb2);
                    zzdi.zzaa(valueOf4.length() != 0 ? "Error when loading resource for url: ".concat(valueOf4) : new String("Error when loading resource for url: "));
                    this.zzbau.zzq(zzcz.zzazl);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    zzwb.zza(inputStream, byteArrayOutputStream);
                    com.google.android.gms.internal.measurement.zzl zzlVar = (com.google.android.gms.internal.measurement.zzl) zzacg.zza(new com.google.android.gms.internal.measurement.zzl(), byteArrayOutputStream.toByteArray());
                    String valueOf5 = String.valueOf(zzlVar);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 43);
                    sb4.append("Successfully loaded supplemented resource: ");
                    sb4.append(valueOf5);
                    zzdi.v(sb4.toString());
                    if (zzlVar.zzpv == null && zzlVar.zzpu.length == 0) {
                        String valueOf6 = String.valueOf(this.zzavt);
                        zzdi.v(valueOf6.length() != 0 ? "No change for container: ".concat(valueOf6) : new String("No change for container: "));
                    }
                    this.zzbau.onSuccess(zzlVar);
                    zzsa.close();
                    zzdi.v("Load resource from network finished.");
                } catch (IOException e) {
                    String message = e.getMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(sb2).length() + 51 + String.valueOf(message).length());
                    sb5.append("Error when parsing downloaded resources from url: ");
                    sb5.append(sb2);
                    sb5.append(" ");
                    sb5.append(message);
                    zzdi.zzb(sb5.toString(), e);
                    this.zzbau.zzq(zzcz.zzazk);
                    zzsa.close();
                }
            } catch (FileNotFoundException unused2) {
                String str3 = this.zzavt;
                StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 79 + String.valueOf(str3).length());
                sb6.append("No data is retrieved from the given url: ");
                sb6.append(sb2);
                sb6.append(". Make sure container_id: ");
                sb6.append(str3);
                sb6.append(" is correct.");
                zzdi.zzaa(sb6.toString());
                this.zzbau.zzq(zzcz.zzazk);
                zzsa.close();
            } catch (IOException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb7 = new StringBuilder(String.valueOf(sb2).length() + 40 + String.valueOf(message2).length());
                sb7.append("Error when loading resources from url: ");
                sb7.append(sb2);
                sb7.append(" ");
                sb7.append(message2);
                zzdi.zzb(sb7.toString(), e2);
                this.zzbau.zzq(zzcz.zzazj);
                zzsa.close();
            }
        } catch (Throwable th) {
            zzsa.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzdh<com.google.android.gms.internal.measurement.zzl> zzdhVar) {
        this.zzbau = zzdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzcq(String str) {
        if (str == null) {
            str = this.zzbat;
        } else {
            String valueOf = String.valueOf(str);
            zzdi.zzcx(valueOf.length() != 0 ? "Setting CTFE URL path: ".concat(valueOf) : new String("Setting CTFE URL path: "));
        }
        this.zzawt = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzdi(String str) {
        String valueOf = String.valueOf(str);
        zzdi.zzcx(valueOf.length() != 0 ? "Setting previous container version: ".concat(valueOf) : new String("Setting previous container version: "));
        this.zzbaw = str;
    }
}
