package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
/* loaded from: classes.dex */
public abstract class zzbm extends com.google.android.gms.internal.maps.zzb implements zzbl {
    public zzbm() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onStreetViewPanoramaClick((StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcel, StreetViewPanoramaOrientation.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
