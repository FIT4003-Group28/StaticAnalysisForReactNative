package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes.dex */
final class zzek extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.REGEX_GROUP.toString();
    private static final String zzbao = com.google.android.gms.internal.measurement.zzb.ARG0.toString();
    private static final String zzbap = com.google.android.gms.internal.measurement.zzb.ARG1.toString();
    private static final String zzbaq = com.google.android.gms.internal.measurement.zzb.IGNORE_CASE.toString();
    private static final String zzbar = com.google.android.gms.internal.measurement.zzb.GROUP.toString();

    public zzek() {
        super(ID, zzbao, zzbap);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        Long zze;
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzbao);
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzbap);
        if (zzmVar == null || zzmVar == zzgj.zzpj() || zzmVar2 == null || zzmVar2 == zzgj.zzpj()) {
            return zzgj.zzpj();
        }
        int i = 64;
        if (zzgj.zzg(map.get(zzbaq)).booleanValue()) {
            i = 66;
        }
        int i2 = 1;
        com.google.android.gms.internal.measurement.zzm zzmVar3 = map.get(zzbar);
        if (zzmVar3 == null || ((zze = zzgj.zze(zzmVar3)) != zzgj.zzpe() && (i2 = zze.intValue()) >= 0)) {
            try {
                String zzc = zzgj.zzc(zzmVar);
                String zzc2 = zzgj.zzc(zzmVar2);
                String str = null;
                Matcher matcher = Pattern.compile(zzc2, i).matcher(zzc);
                if (matcher.find() && matcher.groupCount() >= i2) {
                    str = matcher.group(i2);
                }
                return str == null ? zzgj.zzpj() : zzgj.zzj(str);
            } catch (PatternSyntaxException unused) {
                return zzgj.zzpj();
            }
        }
        return zzgj.zzpj();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
