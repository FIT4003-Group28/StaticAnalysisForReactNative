package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rhk  reason: default package */
/* loaded from: classes4.dex */
public final class rhk extends dvc implements rhl {
    public rhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.rhl
    public final int a() {
        Parcel pw = pw(2, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.rhl
    public final void f(String str, String str2, Bundle bundle, long j) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.g(pv, bundle);
        pv.writeLong(j);
        px(1, pv);
    }
}
