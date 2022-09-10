package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplayId;
/* compiled from: PG */
/* renamed from: cnfb  reason: default package */
/* loaded from: classes5.dex */
public final class cnfb extends cla implements IInterface {
    public cnfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayManager");
    }

    public final cnew e(CarDisplayId carDisplayId) {
        cnew cnewVar;
        Parcel a = a();
        clc.e(a, carDisplayId);
        Parcel Si = Si(3, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cnewVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplay");
            if (queryLocalInterface instanceof cnew) {
                cnewVar = (cnew) queryLocalInterface;
            } else {
                cnewVar = new cnew(readStrongBinder);
            }
        }
        Si.recycle();
        return cnewVar;
    }
}
