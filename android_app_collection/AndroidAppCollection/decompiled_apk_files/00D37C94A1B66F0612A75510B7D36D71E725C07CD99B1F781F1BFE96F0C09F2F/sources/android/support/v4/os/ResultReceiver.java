package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cs(15);
    jg a;

    public ResultReceiver(Parcel parcel) {
        jg jeVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            jeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof jg)) {
                jeVar = new je(readStrongBinder);
            } else {
                jeVar = (jg) queryLocalInterface;
            }
        }
        this.a = jeVar;
    }

    public void a() {
    }

    public final void b(int i, Bundle bundle) {
        jg jgVar = this.a;
        if (jgVar != null) {
            try {
                jgVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new jf(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
