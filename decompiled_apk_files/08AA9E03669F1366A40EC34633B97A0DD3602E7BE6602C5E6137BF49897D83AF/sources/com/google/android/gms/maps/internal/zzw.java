package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzw extends com.google.android.gms.internal.maps.zzb implements zzv {
    public zzw() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza(com.google.android.gms.internal.maps.zzi.zzc(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
