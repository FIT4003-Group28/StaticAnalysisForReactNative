package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qle  reason: default package */
/* loaded from: classes4.dex */
public final class qle extends dvc implements qlf {
    public qle(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // defpackage.qlf
    public final int a(Intent intent, int i, int i2) {
        Parcel pv = pv();
        dve.g(pv, intent);
        pv.writeInt(i);
        pv.writeInt(i2);
        Parcel pw = pw(2, pv);
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.qlf
    public final IBinder f(Intent intent) {
        Parcel pv = pv();
        dve.g(pv, intent);
        Parcel pw = pw(3, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        pw.recycle();
        return readStrongBinder;
    }

    @Override // defpackage.qlf
    public final void g() {
        px(1, pv());
    }

    @Override // defpackage.qlf
    public final void h() {
        px(4, pv());
    }
}
