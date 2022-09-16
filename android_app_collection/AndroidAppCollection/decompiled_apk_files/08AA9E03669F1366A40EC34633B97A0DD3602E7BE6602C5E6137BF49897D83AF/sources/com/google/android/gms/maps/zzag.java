package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbo;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
/* loaded from: classes.dex */
final class zzag extends zzbo {
    private final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaLongClickListener zzbr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        this.zzbr = onStreetViewPanoramaLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbr.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
    }
}
