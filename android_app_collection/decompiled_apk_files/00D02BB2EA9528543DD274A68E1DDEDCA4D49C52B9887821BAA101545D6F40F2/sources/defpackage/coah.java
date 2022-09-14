package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coah  reason: default package */
/* loaded from: classes5.dex */
public final class coah extends cla implements IInterface {
    public coah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    public final coag e() {
        coag coagVar;
        Parcel Si = Si(2, a());
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            coagVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            if (queryLocalInterface instanceof coag) {
                coagVar = (coag) queryLocalInterface;
            } else {
                coagVar = new coag(readStrongBinder);
            }
        }
        Si.recycle();
        return coagVar;
    }
}
