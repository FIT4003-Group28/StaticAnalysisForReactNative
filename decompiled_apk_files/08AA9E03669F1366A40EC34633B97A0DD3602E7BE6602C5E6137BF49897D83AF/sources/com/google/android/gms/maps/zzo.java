package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
/* loaded from: classes.dex */
final class zzo extends com.google.android.gms.maps.internal.zzw {
    private final /* synthetic */ GoogleMap.OnCircleClickListener zzw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(GoogleMap googleMap, GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.zzw = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zza(com.google.android.gms.internal.maps.zzh zzhVar) {
        this.zzw.onCircleClick(new Circle(zzhVar));
    }
}
