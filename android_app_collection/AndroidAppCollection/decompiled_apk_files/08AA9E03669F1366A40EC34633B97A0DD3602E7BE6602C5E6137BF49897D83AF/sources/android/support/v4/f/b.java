package android.support.v4.f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void a(int i, Bundle bundle);

    /* compiled from: IResultReceiver.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0007a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.f.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0007a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f379a;

            C0007a(IBinder iBinder) {
                this.f379a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f379a;
            }

            @Override // android.support.v4.f.b
            public void a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f379a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
