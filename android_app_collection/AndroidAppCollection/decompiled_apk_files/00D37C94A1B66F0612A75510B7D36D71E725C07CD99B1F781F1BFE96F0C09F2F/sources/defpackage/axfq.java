package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: axfq  reason: default package */
/* loaded from: classes2.dex */
public final class axfq extends dvc implements axfr {
    public axfq(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }

    @Override // defpackage.axfr
    public final axfn a() {
        axfn axfmVar;
        Parcel pw = pw(2, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            axfmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            if (queryLocalInterface instanceof axfn) {
                axfmVar = (axfn) queryLocalInterface;
            } else {
                axfmVar = new axfm(readStrongBinder);
            }
        }
        pw.recycle();
        return axfmVar;
    }

    @Override // defpackage.axfr
    public final axgo f() {
        axgo axgnVar;
        Parcel pw = pw(4, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            axgnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            if (queryLocalInterface instanceof axgo) {
                axgnVar = (axgo) queryLocalInterface;
            } else {
                axgnVar = new axgn(readStrongBinder);
            }
        }
        pw.recycle();
        return axgnVar;
    }

    @Override // defpackage.axfr
    public final boolean g() {
        Parcel pv = pv();
        pv.writeInt(25);
        Parcel pw = pw(1, pv);
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }
}
