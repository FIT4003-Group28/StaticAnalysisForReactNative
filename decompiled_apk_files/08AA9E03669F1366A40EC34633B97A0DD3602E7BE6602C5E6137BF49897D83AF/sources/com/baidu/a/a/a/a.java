package com.baidu.a.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.baidu.a.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0032a extends Binder implements a {

        /* renamed from: com.baidu.a.a.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0033a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1466a;

            C0033a(IBinder iBinder) {
                this.f1466a = iBinder;
            }

            @Override // com.baidu.a.a.a.a
            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    obtain.writeString(str);
                    this.f1466a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baidu.a.a.a.a
            public boolean a(String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1466a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1466a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0033a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
                        str = a(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 2:
                        parcel.enforceInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
                        boolean a2 = a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                str = "com.baidu.mapframework.open.aidl.IComOpenClient";
            }
            parcel2.writeString(str);
            return true;
        }
    }

    String a(String str);

    boolean a(String str, String str2, Bundle bundle);
}
