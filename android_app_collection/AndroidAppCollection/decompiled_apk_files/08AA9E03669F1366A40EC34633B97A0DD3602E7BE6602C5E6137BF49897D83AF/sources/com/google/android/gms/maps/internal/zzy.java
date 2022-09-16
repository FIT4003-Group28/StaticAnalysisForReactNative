package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzy extends com.google.android.gms.internal.maps.zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza(com.google.android.gms.internal.maps.zzl.zzd(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
