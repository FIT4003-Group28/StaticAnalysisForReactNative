package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axgk  reason: default package */
/* loaded from: classes2.dex */
public final class axgk extends dvc implements IInterface {
    public axgk(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrCreator");
    }

    public final axgl a(axgj axgjVar, axgj axgjVar2) {
        axgl axglVar;
        Parcel pv = pv();
        dve.i(pv, axgjVar);
        dve.i(pv, axgjVar2);
        Parcel pw = pw(4, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            axglVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            if (queryLocalInterface instanceof axgl) {
                axglVar = (axgl) queryLocalInterface;
            } else {
                axglVar = new axgl(readStrongBinder);
            }
        }
        pw.recycle();
        return axglVar;
    }
}
