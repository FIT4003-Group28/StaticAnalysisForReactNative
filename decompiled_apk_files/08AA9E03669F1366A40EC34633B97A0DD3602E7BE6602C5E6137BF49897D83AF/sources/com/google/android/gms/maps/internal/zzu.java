package com.google.android.gms.maps.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements zzt {
    public zzu() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onCameraMoveStarted(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
