package c.e.a.b.d.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class b implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3848a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3849b;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(IBinder iBinder, String str) {
        this.f3848a = iBinder;
        this.f3849b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3848a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3848a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3849b);
        return obtain;
    }
}
