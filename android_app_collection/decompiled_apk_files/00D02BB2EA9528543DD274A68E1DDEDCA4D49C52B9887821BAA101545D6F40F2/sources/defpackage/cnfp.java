package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnfp  reason: default package */
/* loaded from: classes5.dex */
public final class cnfp extends cla implements IInterface {
    public cnfp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarEditableListener");
    }

    public final void e(int i, int i2, int i3, int i4) {
        Parcel a = a();
        a.writeInt(i);
        a.writeInt(i2);
        a.writeInt(i3);
        a.writeInt(i4);
        Sk(1, a);
    }
}
