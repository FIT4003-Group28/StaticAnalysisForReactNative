package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
/* loaded from: classes.dex */
final class zzad extends zzbk {
    private final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener zzbo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zzbo = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zzbo.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
