package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzag extends com.google.android.gms.internal.maps.zzb implements zzaf {
    public zzag() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzf(com.google.android.gms.internal.maps.zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
