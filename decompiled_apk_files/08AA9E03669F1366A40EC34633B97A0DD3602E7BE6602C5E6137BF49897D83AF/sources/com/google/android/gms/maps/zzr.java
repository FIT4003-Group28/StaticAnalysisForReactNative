package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbt;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzr extends zzbt {
    private final /* synthetic */ GoogleMap.SnapshotReadyCallback zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(GoogleMap googleMap, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.zzz = snapshotReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void onSnapshotReady(Bitmap bitmap) {
        this.zzz.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.zzz.onSnapshotReady((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
