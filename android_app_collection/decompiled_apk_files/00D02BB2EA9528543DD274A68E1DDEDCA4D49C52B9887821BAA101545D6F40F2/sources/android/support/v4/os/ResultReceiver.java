package android.support.v4.os;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new mt();
    ms a;

    public ResultReceiver(Parcel parcel) {
        ms mqVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            mqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ms)) {
                mqVar = new mq(readStrongBinder);
            } else {
                mqVar = (ms) queryLocalInterface;
            }
        }
        this.a = mqVar;
    }

    public void a() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new mu(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
