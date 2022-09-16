package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: codh  reason: default package */
/* loaded from: classes5.dex */
public abstract class codh extends clb implements codi {
    public codh() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static codi asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof codi) {
            return (codi) queryLocalInterface;
        }
        return new codg(iBinder);
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        coba coayVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                coayVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof coba) {
                    coayVar = (coba) queryLocalInterface;
                } else {
                    coayVar = new coay(readStrongBinder);
                }
            }
            init(coayVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), clc.a(parcel), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
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
