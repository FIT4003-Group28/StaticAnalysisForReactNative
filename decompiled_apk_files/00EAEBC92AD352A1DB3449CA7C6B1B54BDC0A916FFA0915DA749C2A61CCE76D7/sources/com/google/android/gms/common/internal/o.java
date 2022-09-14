package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
final class o implements p {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f7042a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(IBinder iBinder) {
        this.f7042a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.p
    public final void a(n nVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7042a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7042a;
    }
}
