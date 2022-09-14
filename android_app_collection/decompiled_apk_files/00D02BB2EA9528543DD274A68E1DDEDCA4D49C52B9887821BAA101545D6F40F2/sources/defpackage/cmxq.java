package defpackage;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.car.ActivityLaunchInfo;
/* compiled from: PG */
/* renamed from: cmxq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmxq extends clb implements cmxr {
    public cmxq() {
        super("com.google.android.gms.car.ICarActivityStartListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Intent intent = (Intent) clc.d(parcel, Intent.CREATOR);
            c();
        } else if (i == 2) {
            Intent intent2 = (Intent) clc.d(parcel, Intent.CREATOR);
            d();
        } else if (i != 3) {
            return false;
        } else {
            ActivityLaunchInfo activityLaunchInfo = (ActivityLaunchInfo) clc.d(parcel, ActivityLaunchInfo.CREATOR);
            b();
        }
        return true;
    }
}
