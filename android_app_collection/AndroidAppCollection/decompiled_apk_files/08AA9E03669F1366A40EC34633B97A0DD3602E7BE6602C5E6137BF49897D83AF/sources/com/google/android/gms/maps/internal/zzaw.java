package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzav {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean onMyLocationButtonClick = onMyLocationButtonClick();
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zza(parcel2, onMyLocationButtonClick);
            return true;
        }
        return false;
    }
}
