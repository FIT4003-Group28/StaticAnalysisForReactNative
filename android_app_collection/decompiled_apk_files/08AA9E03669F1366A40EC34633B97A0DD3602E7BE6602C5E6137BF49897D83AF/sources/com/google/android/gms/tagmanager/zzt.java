package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzt extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.CONSTANT.toString();
    private static final String VALUE = com.google.android.gms.internal.measurement.zzb.VALUE.toString();

    public zzt() {
        super(ID, VALUE);
    }

    public static String zzmg() {
        return ID;
    }

    public static String zzmh() {
        return VALUE;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return map.get(VALUE);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
