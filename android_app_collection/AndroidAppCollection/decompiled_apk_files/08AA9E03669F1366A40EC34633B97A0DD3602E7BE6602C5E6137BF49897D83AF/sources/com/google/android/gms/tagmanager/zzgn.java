package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* loaded from: classes.dex */
final class zzgn {
    private static zzdz<com.google.android.gms.internal.measurement.zzm> zza(zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar) {
        try {
            return new zzdz<>(zzgj.zzj(zzds(zzgj.zzc(zzdzVar.getObject()))), zzdzVar.zzob());
        } catch (UnsupportedEncodingException e) {
            zzdi.zza("Escape URI: unsupported encoding", e);
            return zzdzVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdz<com.google.android.gms.internal.measurement.zzm> zza(zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar, int... iArr) {
        String sb;
        for (int i : iArr) {
            if (!(zzgj.zzh(zzdzVar.getObject()) instanceof String)) {
                sb = "Escaping can only be applied to strings.";
            } else if (i != 12) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Unsupported Value Escaping: ");
                sb2.append(i);
                sb = sb2.toString();
            } else {
                zzdzVar = zza(zzdzVar);
            }
            zzdi.e(sb);
        }
        return zzdzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzds(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }
}
