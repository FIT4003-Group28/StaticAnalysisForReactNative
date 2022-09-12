package defpackage;

import android.app.Notification;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: ht  reason: default package */
/* loaded from: classes6.dex */
final class ht implements IInterface {
    private final IBinder a;

    public ht(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(String str, int i, String str2, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
