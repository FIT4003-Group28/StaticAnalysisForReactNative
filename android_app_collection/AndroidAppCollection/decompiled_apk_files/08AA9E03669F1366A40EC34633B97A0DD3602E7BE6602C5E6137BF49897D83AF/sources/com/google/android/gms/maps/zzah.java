package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;
/* loaded from: classes.dex */
final class zzah extends zzbq {
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback zzbu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(StreetViewPanoramaFragment.zza zzaVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zzbu = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zzbu.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
