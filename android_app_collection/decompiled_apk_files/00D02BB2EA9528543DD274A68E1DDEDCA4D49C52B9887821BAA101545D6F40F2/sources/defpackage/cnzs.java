package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
/* compiled from: PG */
/* renamed from: cnzs  reason: default package */
/* loaded from: classes5.dex */
public final class cnzs implements Parcelable.Creator<DroidGuardResultsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DroidGuardResultsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                bundle = cnwm.r(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DroidGuardResultsRequest(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DroidGuardResultsRequest[] newArray(int i) {
        return new DroidGuardResultsRequest[i];
    }
}
