package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbm extends zzfz {
    private static final String ID = com.google.android.gms.internal.measurement.zza.EQUALS.toString();

    public zzbm() {
        super(ID);
    }

    @Override // com.google.android.gms.tagmanager.zzfz
    protected final boolean zza(String str, String str2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return str.equals(str2);
    }
}
