package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
/* compiled from: PG */
/* renamed from: cpig  reason: default package */
/* loaded from: classes5.dex */
public final class cpig implements Parcelable.Creator<GetCapabilityResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCapabilityResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        CapabilityInfoParcelable capabilityInfoParcelable = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                capabilityInfoParcelable = (CapabilityInfoParcelable) cnwm.q(parcel, readInt, CapabilityInfoParcelable.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetCapabilityResponse(i, capabilityInfoParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCapabilityResponse[] newArray(int i) {
        return new GetCapabilityResponse[i];
    }
}
