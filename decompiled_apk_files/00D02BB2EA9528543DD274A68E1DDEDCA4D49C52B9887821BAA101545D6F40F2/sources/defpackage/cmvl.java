package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.display.CarRegionId;
/* compiled from: PG */
/* renamed from: cmvl  reason: default package */
/* loaded from: classes5.dex */
public final class cmvl implements Parcelable.Creator<ActivityLaunchInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityLaunchInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Intent intent = null;
        CarRegionId carRegionId = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                intent = (Intent) cnwm.q(parcel, readInt, Intent.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                carRegionId = (CarRegionId) cnwm.q(parcel, readInt, CarRegionId.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ActivityLaunchInfo(intent, carRegionId);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityLaunchInfo[] newArray(int i) {
        return new ActivityLaunchInfo[i];
    }
}
