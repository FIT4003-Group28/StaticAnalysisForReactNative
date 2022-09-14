package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
/* loaded from: classes.dex */
public abstract class zzbk extends com.google.android.gms.internal.maps.zzb implements zzbj {
    public zzbk() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onStreetViewPanoramaChange((StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(parcel, StreetViewPanoramaLocation.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
