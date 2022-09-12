package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ActivityLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityLaunchInfo> CREATOR = new cmvl();
    public final Intent a;
    public final CarRegionId b;

    public ActivityLaunchInfo(Intent intent, CarRegionId carRegionId) {
        this.a = intent;
        this.b = carRegionId;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("ActivityLaunchInfo{intent=");
        sb.append(valueOf);
        sb.append(" carRegionId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.c(parcel, d);
    }
}
