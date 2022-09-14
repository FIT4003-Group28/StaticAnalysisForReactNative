package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes.dex */
public final class zzdi {
    @VisibleForTesting
    private static zzdj zzazq = new zzba();
    static int zzyc;

    public static void e(String str) {
        zzazq.e(str);
    }

    public static void setLogLevel(int i) {
        zzyc = i;
        zzazq.setLogLevel(i);
    }

    public static void v(String str) {
        zzazq.v(str);
    }

    public static void zza(String str, Throwable th) {
        zzazq.zza(str, th);
    }

    public static void zzaa(String str) {
        zzazq.zzaa(str);
    }

    public static void zzb(String str, Throwable th) {
        zzazq.zzb(str, th);
    }

    public static void zzcw(String str) {
        zzazq.zzcw(str);
    }

    public static void zzcx(String str) {
        zzazq.zzcx(str);
    }
}
