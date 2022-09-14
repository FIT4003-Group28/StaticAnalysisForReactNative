package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
@Deprecated
/* loaded from: classes.dex */
public final class zzcl {
    private static volatile Logger zzaau = new zzbv();

    @VisibleForTesting
    public static Logger getLogger() {
        return zzaau;
    }

    private static boolean isLoggable(int i) {
        return zzaau != null && zzaau.getLogLevel() <= i;
    }

    @VisibleForTesting
    public static void setLogger(Logger logger) {
        zzaau = logger;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void v(String str) {
        zzcm zzet = zzcm.zzet();
        if (zzet != null) {
            zzet.zzp(str);
        } else if (isLoggable(0)) {
            Log.v(zzcc.zzym.get(), str);
        }
        Logger logger = zzaau;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzaa(String str) {
        zzcm zzet = zzcm.zzet();
        if (zzet != null) {
            zzet.zzs(str);
        } else if (isLoggable(2)) {
            Log.w(zzcc.zzym.get(), str);
        }
        Logger logger = zzaau;
        if (logger != null) {
            logger.warn(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzf(String str, Object obj) {
        String str2;
        zzcm zzet = zzcm.zzet();
        if (zzet != null) {
            zzet.zze(str, obj);
        } else if (isLoggable(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(":");
                sb.append(valueOf);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(zzcc.zzym.get(), str2);
        }
        Logger logger = zzaau;
        if (logger != null) {
            logger.error(str);
        }
    }
}
