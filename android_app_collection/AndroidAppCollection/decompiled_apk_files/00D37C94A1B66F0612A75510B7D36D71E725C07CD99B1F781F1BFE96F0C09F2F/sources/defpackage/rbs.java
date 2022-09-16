package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rbs  reason: default package */
/* loaded from: classes4.dex */
public abstract class rbs extends dvd implements rbt {
    public rbs() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static rbt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof rbt) {
            return (rbt) queryLocalInterface;
        }
        return new rbr(iBinder);
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rad rabVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                rabVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof rad) {
                    rabVar = (rad) queryLocalInterface;
                } else {
                    rabVar = new rab(readStrongBinder);
                }
            }
            init(rabVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), dve.j(parcel), parcel.readInt());
            parcel2.writeNoException();
            dve.e(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
