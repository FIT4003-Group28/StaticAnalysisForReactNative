package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaw;
/* loaded from: classes.dex */
final class zzi extends zzaw {
    private final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zzq = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean onMyLocationButtonClick() {
        return this.zzq.onMyLocationButtonClick();
    }
}
