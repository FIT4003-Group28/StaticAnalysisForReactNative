package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cpis  reason: default package */
/* loaded from: classes5.dex */
public final class cpis extends cla implements IInterface {
    public cpis(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void e() {
        Parcel a = a();
        a.writeInt(0);
        a.writeByteArray(null);
        Sj(1, a);
    }
}
