package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
/* compiled from: PG */
/* renamed from: cmvj  reason: default package */
/* loaded from: classes5.dex */
public final class cmvj implements Parcelable.Creator<TimeIntervalsImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeIntervalsImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TimeIntervalsImpl(iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeIntervalsImpl[] newArray(int i) {
        return new TimeIntervalsImpl[i];
    }
}
