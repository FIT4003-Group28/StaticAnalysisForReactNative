package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.maps.internal.zzac {
    private final /* synthetic */ GoogleMap.OnInfoWindowClickListener zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zzl = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zze(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzl.onInfoWindowClick(new Marker(zztVar));
    }
}
