package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qlc  reason: default package */
/* loaded from: classes4.dex */
public final class qlc extends dvc implements qld {
    public qlc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // defpackage.qld
    public final rad a() {
        rad rabVar;
        Parcel pw = pw(5, pv());
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
}
