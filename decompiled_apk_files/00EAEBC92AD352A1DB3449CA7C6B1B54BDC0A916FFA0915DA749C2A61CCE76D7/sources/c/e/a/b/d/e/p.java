package c.e.a.b.d.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class p implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3969a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3970b;

    /* JADX INFO: Access modifiers changed from: protected */
    public p(IBinder iBinder, String str) {
        this.f3969a = iBinder;
        this.f3970b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3969a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3969a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel f() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3970b);
        return obtain;
    }
}
