package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzas;
import com.google.android.gms.maps.model.Marker;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzb extends zzas {
    private final /* synthetic */ GoogleMap.OnMarkerClickListener zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zzj = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final boolean zza(com.google.android.gms.internal.maps.zzt zztVar) {
        return this.zzj.onMarkerClick(new Marker(zztVar));
    }
}
