package defpackage;

import android.os.Parcel;
import com.google.android.gms.car.ActivityLaunchInfo;
/* compiled from: PG */
/* renamed from: cmxo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmxo extends clb implements cmxp {
    public cmxo() {
        super("com.google.android.gms.car.ICarActivityLifecycleEventListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            ActivityLaunchInfo activityLaunchInfo = (ActivityLaunchInfo) clc.d(parcel, ActivityLaunchInfo.CREATOR);
            c();
            return true;
        } else if (i != 3) {
            return false;
        } else {
            ActivityLaunchInfo activityLaunchInfo2 = (ActivityLaunchInfo) clc.d(parcel, ActivityLaunchInfo.CREATOR);
            b();
            return true;
        }
    }
}
