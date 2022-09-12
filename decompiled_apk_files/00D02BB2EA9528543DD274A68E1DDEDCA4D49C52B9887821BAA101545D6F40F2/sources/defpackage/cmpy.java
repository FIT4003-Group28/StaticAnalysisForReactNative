package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmpy  reason: default package */
/* loaded from: classes5.dex */
public final class cmpy implements Parcelable.Creator<GetRecentContextCall$Response> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetRecentContextCall$Response createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Status status = null;
        ArrayList arrayList = null;
        String[] strArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                status = (Status) cnwm.q(parcel, readInt, Status.CREATOR);
            } else if (b == 2) {
                arrayList = cnwm.A(parcel, readInt, UsageInfo.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                strArr = cnwm.w(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetRecentContextCall$Response(status, arrayList, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetRecentContextCall$Response[] newArray(int i) {
        return new GetRecentContextCall$Response[i];
    }
}
