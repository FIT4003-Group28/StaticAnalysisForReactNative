package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;
/* compiled from: PG */
/* renamed from: jf  reason: default package */
/* loaded from: classes3.dex */
public final class jf extends Binder implements jg {
    final /* synthetic */ ResultReceiver a;

    public jf() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // defpackage.jg
    public final void a(int i, Bundle bundle) {
        this.a.a();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public jf(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
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
}
