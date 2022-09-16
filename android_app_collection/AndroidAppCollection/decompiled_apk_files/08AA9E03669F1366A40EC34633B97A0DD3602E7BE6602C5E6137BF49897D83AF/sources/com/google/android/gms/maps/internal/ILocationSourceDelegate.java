package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface ILocationSourceDelegate extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class zza extends com.google.android.gms.internal.maps.zzb implements ILocationSourceDelegate {
        public zza() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        @Override // com.google.android.gms.internal.maps.zzb
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            zzah zzaiVar;
            switch (i) {
                case 1:
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        zzaiVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                        zzaiVar = queryLocalInterface instanceof zzah ? (zzah) queryLocalInterface : new zzai(readStrongBinder);
                    }
                    activate(zzaiVar);
                    break;
                case 2:
                    deactivate();
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activate(zzah zzahVar);

    void deactivate();
}
