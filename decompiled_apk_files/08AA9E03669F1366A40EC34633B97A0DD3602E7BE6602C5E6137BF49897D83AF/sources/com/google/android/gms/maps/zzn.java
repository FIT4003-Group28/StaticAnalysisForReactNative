package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.GroundOverlay;
/* loaded from: classes.dex */
final class zzn extends com.google.android.gms.maps.internal.zzy {
    private final /* synthetic */ GoogleMap.OnGroundOverlayClickListener zzv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(GoogleMap googleMap, GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.zzv = onGroundOverlayClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zza(com.google.android.gms.internal.maps.zzk zzkVar) {
        this.zzv.onGroundOverlayClick(new GroundOverlay(zzkVar));
    }
}
