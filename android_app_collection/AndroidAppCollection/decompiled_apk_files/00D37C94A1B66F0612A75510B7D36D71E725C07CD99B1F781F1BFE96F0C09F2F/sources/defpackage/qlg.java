package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qlg  reason: default package */
/* loaded from: classes4.dex */
public final class qlg extends dvc implements qlh {
    public qlg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // defpackage.qlh
    public final int a() {
        Parcel pw = pw(17, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.qlh
    public final int f() {
        Parcel pw = pw(18, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.qlh
    public final rad g() {
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

    @Override // defpackage.qlh
    public final void h(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(13, pv);
    }

    @Override // defpackage.qlh
    public final boolean i() {
        Parcel pw = pw(5, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.qlh
    public final boolean j() {
        Parcel pw = pw(9, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }

    @Override // defpackage.qlh
    public final void k() {
        Parcel pv = pv();
        pv.writeInt(2153);
        px(15, pv);
    }

    @Override // defpackage.qlh
    public final void l() {
        Parcel pv = pv();
        pv.writeInt(2151);
        px(12, pv);
    }
}
