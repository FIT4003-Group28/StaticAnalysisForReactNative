package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;
/* loaded from: classes.dex */
public abstract class zzbc extends com.google.android.gms.internal.maps.zzb implements zzbb {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza((PointOfInterest) com.google.android.gms.internal.maps.zzc.zza(parcel, PointOfInterest.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
