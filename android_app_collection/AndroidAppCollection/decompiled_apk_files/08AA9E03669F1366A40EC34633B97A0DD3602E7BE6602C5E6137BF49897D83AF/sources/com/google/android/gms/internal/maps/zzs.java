package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class zzs extends zza implements zzq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final void activate() {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getName() {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getShortName() {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final boolean zzb(zzq zzqVar) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzqVar);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        boolean zza = zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final int zzi() {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }
}
