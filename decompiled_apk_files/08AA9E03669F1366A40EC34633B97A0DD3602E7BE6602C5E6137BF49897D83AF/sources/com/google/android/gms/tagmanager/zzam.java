package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzam extends zzbq {
    private final zzan zzaxc;
    private static final String ID = com.google.android.gms.internal.measurement.zza.FUNCTION_CALL.toString();
    private static final String zzaxb = com.google.android.gms.internal.measurement.zzb.FUNCTION_CALL_NAME.toString();
    private static final String zzavn = com.google.android.gms.internal.measurement.zzb.ADDITIONAL_PARAMS.toString();

    public zzam(zzan zzanVar) {
        super(ID, zzaxb);
        this.zzaxc = zzanVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String sb;
        String zzc = zzgj.zzc(map.get(zzaxb));
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzavn);
        if (zzmVar != null) {
            Object zzh = zzgj.zzh(zzmVar);
            if (!(zzh instanceof Map)) {
                sb = "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.";
                zzdi.zzaa(sb);
                return zzgj.zzpj();
            }
            for (Map.Entry entry : ((Map) zzh).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return zzgj.zzj(this.zzaxc.zza(zzc, hashMap));
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 34 + String.valueOf(message).length());
            sb2.append("Custom macro/tag ");
            sb2.append(zzc);
            sb2.append(" threw exception ");
            sb2.append(message);
            sb = sb2.toString();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
