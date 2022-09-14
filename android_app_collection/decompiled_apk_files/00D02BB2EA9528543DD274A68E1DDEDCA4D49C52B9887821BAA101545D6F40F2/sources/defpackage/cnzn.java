package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnzn  reason: default package */
/* loaded from: classes5.dex */
public final class cnzn implements Parcelable.Creator<TimeFilterImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeFilterImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                arrayList = cnwm.A(parcel, readInt, TimeFilterImpl.Interval.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TimeFilterImpl(arrayList, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeFilterImpl[] newArray(int i) {
        return new TimeFilterImpl[i];
    }
}
