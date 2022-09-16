package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qpp  reason: default package */
/* loaded from: classes4.dex */
public final class qpp extends dvc implements IInterface {
    public qpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a() {
        py(1, pv());
    }

    public final void f(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        py(12, pv);
    }
}
