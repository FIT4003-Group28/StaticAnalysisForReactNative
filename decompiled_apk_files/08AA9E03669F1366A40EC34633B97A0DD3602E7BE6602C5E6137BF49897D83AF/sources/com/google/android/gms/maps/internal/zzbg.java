package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzbg extends com.google.android.gms.internal.maps.zzb implements zzbf {
    public zzbg() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza(com.google.android.gms.internal.maps.zzaa.zzi(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
