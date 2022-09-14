package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public final class zzch {
    private final List<zzbo> zzaaj;
    private final long zzaak;
    private final long zzaal;
    private final int zzaam;
    private final boolean zzaan;
    private final String zzaao;
    private final Map<String, String> zzsn;

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z) {
        this(zzaqVar, map, j, z, 0L, 0, null);
    }

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(zzaqVar, map, j, z, j2, i, null);
    }

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzbo> list) {
        String str;
        String zza;
        String zza2;
        Preconditions.checkNotNull(zzaqVar);
        Preconditions.checkNotNull(map);
        this.zzaal = j;
        this.zzaan = z;
        this.zzaak = j2;
        this.zzaam = i;
        this.zzaaj = list != null ? list : Collections.emptyList();
        String str2 = null;
        if (list != null) {
            for (zzbo zzboVar : list) {
                if ("appendVersion".equals(zzboVar.getId())) {
                    str = zzboVar.getValue();
                    break;
                }
            }
        }
        str = null;
        this.zzaao = !TextUtils.isEmpty(str) ? str : str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzc(entry.getKey()) && (zza2 = zza(zzaqVar, entry.getKey())) != null) {
                hashMap.put(zza2, zzb(zzaqVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzc(entry2.getKey()) && (zza = zza(zzaqVar, entry2.getKey())) != null) {
                hashMap.put(zza, zzb(zzaqVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzaao)) {
            zzdd.zzb(hashMap, "_v", this.zzaao);
            if (this.zzaao.equals("ma4.0.0") || this.zzaao.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zzsn = Collections.unmodifiableMap(hashMap);
    }

    private static String zza(zzaq zzaqVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzaqVar.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (!TextUtils.isEmpty(obj2)) {
            return obj2;
        }
        return null;
    }

    private static String zzb(zzaq zzaqVar, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, PKIFailureInfo.certRevoked);
            zzaqVar.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean zzc(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    private final String zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(!str.startsWith("&"), "Short param name required");
        String str3 = this.zzsn.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.zzaal);
        if (this.zzaak != 0) {
            sb.append(", dbId=");
            sb.append(this.zzaak);
        }
        if (this.zzaam != 0) {
            sb.append(", appUID=");
            sb.append(this.zzaam);
        }
        ArrayList arrayList = new ArrayList(this.zzsn.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append(this.zzsn.get(str));
        }
        return sb.toString();
    }

    public final Map<String, String> zzcs() {
        return this.zzsn;
    }

    public final int zzel() {
        return this.zzaam;
    }

    public final long zzem() {
        return this.zzaak;
    }

    public final long zzen() {
        return this.zzaal;
    }

    public final List<zzbo> zzeo() {
        return this.zzaaj;
    }

    public final boolean zzep() {
        return this.zzaan;
    }

    public final long zzeq() {
        return zzdd.zzae(zzd("_s", "0"));
    }

    public final String zzer() {
        return zzd("_m", "");
    }
}
