package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.GoogleCertificates;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzg {
    private static final zzg zzbk = new zzg(true, null, null);
    private final Throwable cause;
    final boolean zzbl;
    private final String zzbm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(boolean z, String str, Throwable th) {
        this.zzbl = z;
        this.zzbm = str;
        this.cause = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzg zza(String str, GoogleCertificates.CertData certData, boolean z, boolean z2) {
        return new zzi(str, certData, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzg zza(String str, Throwable th) {
        return new zzg(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzg zze(String str) {
        return new zzg(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzg zzg() {
        return zzbk;
    }

    String getErrorMessage() {
        return this.zzbm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        if (!this.zzbl) {
            String valueOf = String.valueOf("GoogleCertificatesRslt: ");
            String valueOf2 = String.valueOf(getErrorMessage());
            String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            if (this.cause == null) {
                throw new SecurityException(concat);
            }
            throw new SecurityException(concat, this.cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        if (!this.zzbl) {
            if (this.cause != null) {
                Log.d("GoogleCertificatesRslt", getErrorMessage(), this.cause);
            } else {
                Log.d("GoogleCertificatesRslt", getErrorMessage());
            }
        }
    }
}
