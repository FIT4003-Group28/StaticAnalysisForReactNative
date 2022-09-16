package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axgf  reason: default package */
/* loaded from: classes2.dex */
public abstract class axgf extends dvd implements axgg {
    public axgf() {
        super("com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    public static axgg asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof axgg) {
            return (axgg) queryLocalInterface;
        }
        return new axge(iBinder);
    }

    @Override // defpackage.dvd
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        axgj axgjVar = null;
        switch (i) {
            case 2:
                axgj rootView = getRootView();
                parcel2.writeNoException();
                dve.i(parcel2, rootView);
                return true;
            case 3:
                setEnabled(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                dve.e(parcel2, isEnabled);
                return true;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface;
                    } else {
                        axgjVar = new axgh(readStrongBinder);
                    }
                }
                setCloseButtonListener(axgjVar);
                parcel2.writeNoException();
                return true;
            case 6:
                setTransitionViewEnabled(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface2;
                    } else {
                        axgjVar = new axgh(readStrongBinder2);
                    }
                }
                setTransitionViewListener(axgjVar);
                parcel2.writeNoException();
                return true;
            case 8:
                setSettingsButtonEnabled(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface3;
                    } else {
                        axgjVar = new axgh(readStrongBinder3);
                    }
                }
                setSettingsButtonListener(axgjVar);
                parcel2.writeNoException();
                return true;
            case 10:
                setViewerName(parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
