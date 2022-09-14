package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;
/* loaded from: classes.dex */
final class zzq extends zzbg {
    private final /* synthetic */ GoogleMap.OnPolylineClickListener zzy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zzy = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zza(com.google.android.gms.internal.maps.zzz zzzVar) {
        this.zzy.onPolylineClick(new Polyline(zzzVar));
    }
}
