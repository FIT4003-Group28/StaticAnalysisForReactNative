package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qky  reason: default package */
/* loaded from: classes4.dex */
public final class qky extends dvc implements qkz {
    public qky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // defpackage.qkz
    public final qld a() {
        qld qlcVar;
        Parcel pw = pw(6, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qlcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof qld) {
                qlcVar = (qld) queryLocalInterface;
            } else {
                qlcVar = new qlc(readStrongBinder);
            }
        }
        pw.recycle();
        return qlcVar;
    }

    @Override // defpackage.qkz
    public final qlj f() {
        qlj qliVar;
        Parcel pw = pw(5, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qliVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof qlj) {
                qliVar = (qlj) queryLocalInterface;
            } else {
                qliVar = new qli(readStrongBinder);
            }
        }
        pw.recycle();
        return qliVar;
    }

    @Override // defpackage.qkz
    public final boolean g() {
        Parcel pw = pw(12, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }
}
