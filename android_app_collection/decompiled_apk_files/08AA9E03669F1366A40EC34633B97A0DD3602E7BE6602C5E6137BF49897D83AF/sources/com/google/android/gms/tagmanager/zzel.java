package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
@VisibleForTesting
/* loaded from: classes.dex */
final class zzel extends zzfz {
    private static final String ID = com.google.android.gms.internal.measurement.zza.REGEX.toString();
    private static final String zzbaq = com.google.android.gms.internal.measurement.zzb.IGNORE_CASE.toString();

    public zzel() {
        super(ID);
    }

    @Override // com.google.android.gms.tagmanager.zzfz
    protected final boolean zza(String str, String str2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        try {
            return Pattern.compile(str2, zzgj.zzg(map.get(zzbaq)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}
