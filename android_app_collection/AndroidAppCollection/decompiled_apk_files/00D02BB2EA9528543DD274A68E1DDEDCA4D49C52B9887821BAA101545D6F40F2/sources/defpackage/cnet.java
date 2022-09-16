package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayId;
/* compiled from: PG */
/* renamed from: cnet  reason: default package */
/* loaded from: classes5.dex */
public final class cnet implements Parcelable.Creator<CarDisplayId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarDisplayId createFromParcel(Parcel parcel) {
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
        return new CarDisplayId(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarDisplayId[] newArray(int i) {
        return new CarDisplayId[i];
    }
}
