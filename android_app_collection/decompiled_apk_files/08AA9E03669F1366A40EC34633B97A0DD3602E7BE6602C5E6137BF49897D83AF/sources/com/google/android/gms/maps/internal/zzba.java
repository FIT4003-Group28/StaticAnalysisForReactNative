package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzba extends com.google.android.gms.internal.maps.zzb implements zzaz {
    public zzba() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onMyLocationClick((Location) com.google.android.gms.internal.maps.zzc.zza(parcel, Location.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
