package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnvq  reason: default package */
/* loaded from: classes.dex */
public final class cnvq implements IInterface {
    private final IBinder a;

    public cnvq(IBinder iBinder) {
        this.a = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(cnvp cnvpVar, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(cnvpVar);
            obtain.writeInt(1);
            cnut.a(getServiceRequest, obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
