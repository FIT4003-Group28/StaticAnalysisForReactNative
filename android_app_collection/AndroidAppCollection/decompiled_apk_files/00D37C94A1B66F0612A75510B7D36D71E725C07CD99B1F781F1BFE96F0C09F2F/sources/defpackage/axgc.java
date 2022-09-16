package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axgc  reason: default package */
/* loaded from: classes2.dex */
public abstract class axgc extends dvd implements axgd {
    public axgc() {
        super("com.google.vr.vrcore.library.api.IGvrLayout");
    }

    public static axgd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof axgd) {
            return (axgd) queryLocalInterface;
        }
        return new axgb(iBinder);
    }

    @Override // defpackage.dvd
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        axgj axgjVar = null;
        switch (i) {
            case 2:
                long nativeGvrContext = getNativeGvrContext();
                parcel2.writeNoException();
                parcel2.writeLong(nativeGvrContext);
                return true;
            case 3:
                axgj rootView = getRootView();
                parcel2.writeNoException();
                dve.i(parcel2, rootView);
                return true;
            case 4:
                axgg uiLayout = getUiLayout();
                parcel2.writeNoException();
                dve.i(parcel2, uiLayout);
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                onResume();
                parcel2.writeNoException();
                return true;
            case 7:
                shutdown();
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface;
                    } else {
                        axgjVar = new axgh(readStrongBinder);
                    }
                }
                setPresentationView(axgjVar);
                parcel2.writeNoException();
                return true;
            case 9:
                boolean enableAsyncReprojection = enableAsyncReprojection(parcel.readInt());
                parcel2.writeNoException();
                dve.e(parcel2, enableAsyncReprojection);
                return true;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface2;
                    } else {
                        axgjVar = new axgh(readStrongBinder2);
                    }
                }
                boolean enableCardboardTriggerEmulation = enableCardboardTriggerEmulation(axgjVar);
                parcel2.writeNoException();
                dve.e(parcel2, enableCardboardTriggerEmulation);
                return true;
            case 11:
                setStereoModeEnabled(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 13:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface3;
                    } else {
                        axgjVar = new axgh(readStrongBinder3);
                    }
                }
                setReentryIntent(axgjVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface4 instanceof axgj) {
                        axgjVar = (axgj) queryLocalInterface4;
                    } else {
                        axgjVar = new axgh(readStrongBinder4);
                    }
                }
                boolean onDonNotNeededListener = setOnDonNotNeededListener(axgjVar);
                parcel2.writeNoException();
                dve.e(parcel2, onDonNotNeededListener);
                return true;
            default:
                return false;
        }
    }
}
