package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: mr  reason: default package */
/* loaded from: classes7.dex */
public abstract class mr extends Binder implements ms {
    public mr() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        parcel.readInt();
        if (parcel.readInt() != 0) {
            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        a();
        return true;
    }
}
