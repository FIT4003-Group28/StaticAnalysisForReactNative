package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
/* compiled from: PG */
/* renamed from: cnzo  reason: default package */
/* loaded from: classes5.dex */
public final class cnzo implements Parcelable.Creator<TimeFilterImpl.Interval> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeFilterImpl.Interval createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                j = cnwm.k(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                j2 = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TimeFilterImpl.Interval(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeFilterImpl.Interval[] newArray(int i) {
        return new TimeFilterImpl.Interval[i];
    }
}
