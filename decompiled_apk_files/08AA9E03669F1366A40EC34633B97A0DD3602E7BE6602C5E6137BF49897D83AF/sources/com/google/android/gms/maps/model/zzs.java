package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs implements TileProvider {
    private final zzaf zzek;
    private final /* synthetic */ TileOverlayOptions zzel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(TileOverlayOptions tileOverlayOptions) {
        zzaf zzafVar;
        this.zzel = tileOverlayOptions;
        zzafVar = this.zzel.zzeh;
        this.zzek = zzafVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzek.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
