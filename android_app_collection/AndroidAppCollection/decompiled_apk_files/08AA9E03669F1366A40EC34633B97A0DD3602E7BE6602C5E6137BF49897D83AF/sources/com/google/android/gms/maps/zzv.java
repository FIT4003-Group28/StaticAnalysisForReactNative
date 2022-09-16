package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.maps.internal.zzs {
    private final /* synthetic */ GoogleMap.OnCameraMoveListener zzad;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zzad = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void onCameraMove() {
        this.zzad.onCameraMove();
    }
}
