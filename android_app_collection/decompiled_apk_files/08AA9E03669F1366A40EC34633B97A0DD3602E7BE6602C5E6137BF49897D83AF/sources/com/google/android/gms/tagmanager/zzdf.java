package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzdf extends zzdy {
    private static final String ID = com.google.android.gms.internal.measurement.zza.LESS_THAN.toString();

    public zzdf() {
        super(ID);
    }

    @Override // com.google.android.gms.tagmanager.zzdy
    protected final boolean zza(zzgi zzgiVar, zzgi zzgiVar2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgiVar.compareTo(zzgiVar2) < 0;
    }
}
