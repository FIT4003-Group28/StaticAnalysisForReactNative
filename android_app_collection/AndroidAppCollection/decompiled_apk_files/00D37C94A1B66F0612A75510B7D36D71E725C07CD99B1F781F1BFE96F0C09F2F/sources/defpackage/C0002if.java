package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0002if implements ih {
    private final IBinder a;

    public C0002if(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.ih
    public final PlaybackStateCompat a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih
    public final void b(ie ieVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(ieVar);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih
    public final void c(ie ieVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(ieVar);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
