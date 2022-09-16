package com.google.android.gms.maps;

import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzac extends zzaq {
    private final /* synthetic */ OnMapReadyCallback zzbb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(MapView.zza zzaVar, OnMapReadyCallback onMapReadyCallback) {
        this.zzbb = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) {
        this.zzbb.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
