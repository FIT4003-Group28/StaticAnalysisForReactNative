package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public enum zzbq {
    NONE,
    GZIP;

    public static zzbq zzz(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
