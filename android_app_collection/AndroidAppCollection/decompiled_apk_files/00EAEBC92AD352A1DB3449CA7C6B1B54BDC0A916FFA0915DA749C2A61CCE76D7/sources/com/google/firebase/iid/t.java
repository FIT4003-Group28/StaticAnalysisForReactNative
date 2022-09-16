package com.google.firebase.iid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
/* loaded from: classes.dex */
interface t extends IInterface {

    /* loaded from: classes.dex */
    public static class a implements t {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f9295a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(IBinder iBinder) {
            this.f9295a = iBinder;
        }

        @Override // com.google.firebase.iid.t
        public void a(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f9295a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f9295a;
        }
    }

    void a(Message message);
}
