package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qxm  reason: default package */
/* loaded from: classes4.dex */
public final class qxm extends dvc implements qxo {
    public qxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.qxo
    public final rad f() {
        rad rabVar;
        Parcel pw = pw(1, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
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
        pw.recycle();
        return rabVar;
    }

    @Override // defpackage.qxo
    public final int qk() {
        Parcel pw = pw(2, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }
}
