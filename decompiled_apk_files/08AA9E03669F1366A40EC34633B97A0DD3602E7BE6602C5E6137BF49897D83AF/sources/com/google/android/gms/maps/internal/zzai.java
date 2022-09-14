package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class zzai extends com.google.android.gms.internal.maps.zza implements zzah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zza(Location location) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.maps.zzc.zza(obtainAndWriteInterfaceToken, location);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
