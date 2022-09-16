package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qli  reason: default package */
/* loaded from: classes4.dex */
public final class qli extends dvc implements qlj {
    public qli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // defpackage.qlj
    public final rad a() {
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

    @Override // defpackage.qlj
    public final rad f() {
        rad rabVar;
        Parcel pw = pw(7, pv());
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

    @Override // defpackage.qlj
    public final void g(boolean z) {
        Parcel pv = pv();
        dve.e(pv, true);
        dve.e(pv, z);
        px(6, pv);
    }

    @Override // defpackage.qlj
    public final void h(qlk qlkVar) {
        Parcel pv = pv();
        dve.i(pv, qlkVar);
        px(2, pv);
    }
}
