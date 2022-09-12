package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: lx  reason: default package */
/* loaded from: classes7.dex */
public final class lx implements IInterface {
    private final IBinder a;

    public lx(IBinder iBinder) {
        this.a = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(lw lwVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(lwVar);
            this.a.transact(3, obtain, obtain2, 0);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(lw lwVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(lwVar);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PlaybackStateCompat c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
