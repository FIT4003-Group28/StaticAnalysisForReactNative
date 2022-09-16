package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnvl  reason: default package */
/* loaded from: classes5.dex */
public final class cnvl extends cla implements cnvn {
    public cnvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.cnvn
    public final coba d() {
        coba coayVar;
        Parcel Si = Si(1, a());
        IBinder readStrongBinder = Si.readStrongBinder();
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
        Si.recycle();
        return coayVar;
    }

    @Override // defpackage.cnvn
    public final int e() {
        Parcel Si = Si(2, a());
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }
}
