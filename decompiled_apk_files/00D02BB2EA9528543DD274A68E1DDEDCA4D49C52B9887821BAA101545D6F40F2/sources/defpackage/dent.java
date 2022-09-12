package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.CallStatus;
/* compiled from: PG */
/* renamed from: dent  reason: default package */
/* loaded from: classes6.dex */
public final class dent implements Parcelable.Creator<CallStatus> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CallStatus createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new CallStatus(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CallStatus[] newArray(int i) {
        return new CallStatus[i];
    }
}
