package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
/* compiled from: PG */
/* renamed from: cneu  reason: default package */
/* loaded from: classes5.dex */
public final class cneu implements Parcelable.Creator<CarRegionId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarRegionId createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        CarDisplayId carDisplayId = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                carDisplayId = (CarDisplayId) cnwm.q(parcel, readInt, CarDisplayId.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new CarRegionId(i, carDisplayId);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarRegionId[] newArray(int i) {
        return new CarRegionId[i];
    }
}
