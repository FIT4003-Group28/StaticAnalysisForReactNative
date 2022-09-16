package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.internal.measurement.zzwg;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class zzda {
    public static zzwf zzdf(String str) {
        com.google.android.gms.internal.measurement.zzm zzj = zzgj.zzj(zzh(new JSONObject(str)));
        zzwg zzru = zzwf.zzru();
        for (int i = 0; i < zzj.zzpz.length; i++) {
            zzru.zzc(zzwd.zzrs().zzb(com.google.android.gms.internal.measurement.zzb.INSTANCE_NAME.toString(), zzj.zzpz[i]).zzb(com.google.android.gms.internal.measurement.zzb.FUNCTION.toString(), zzgj.zzdp(zzt.zzmg())).zzb(zzt.zzmh(), zzj.zzqa[i]).zzrt());
        }
        return zzru.zzrw();
    }

    @VisibleForTesting
    private static Object zzh(Object obj) {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        }
        if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        }
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        JSONObject jSONObject = (JSONObject) obj;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, zzh(jSONObject.get(next)));
        }
        return hashMap;
    }
}
