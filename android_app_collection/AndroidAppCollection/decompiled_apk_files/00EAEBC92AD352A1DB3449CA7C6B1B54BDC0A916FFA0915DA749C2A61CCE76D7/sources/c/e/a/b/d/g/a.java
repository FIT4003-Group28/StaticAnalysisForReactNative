package c.e.a.b.d.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f4036a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4037b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f4036a = iBinder;
        this.f4037b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4036a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f4036a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4036a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4037b);
        return obtain;
    }
}
