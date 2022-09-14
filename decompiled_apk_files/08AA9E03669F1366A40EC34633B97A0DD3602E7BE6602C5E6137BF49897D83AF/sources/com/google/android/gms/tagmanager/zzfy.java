package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzfy extends zzfz {
    private static final String ID = com.google.android.gms.internal.measurement.zza.STARTS_WITH.toString();

    public zzfy() {
        super(ID);
    }

    @Override // com.google.android.gms.tagmanager.zzfz
    protected final boolean zza(String str, String str2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return str.startsWith(str2);
    }
}
