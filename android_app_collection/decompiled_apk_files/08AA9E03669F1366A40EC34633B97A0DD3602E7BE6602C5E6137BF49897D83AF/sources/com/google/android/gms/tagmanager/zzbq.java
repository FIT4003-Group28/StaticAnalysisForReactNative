package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbq {
    private final Set<String> zzayl;
    private final String zzqc;

    public zzbq(String str, String... strArr) {
        this.zzqc = str;
        this.zzayl = new HashSet(strArr.length);
        for (String str2 : strArr) {
            this.zzayl.add(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(Set<String> set) {
        return set.containsAll(this.zzayl);
    }

    public abstract com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map);

    public abstract boolean zzme();

    public String zznn() {
        return this.zzqc;
    }

    public Set<String> zzno() {
        return this.zzayl;
    }
}
