package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
/* compiled from: PG */
/* renamed from: cpjl  reason: default package */
/* loaded from: classes5.dex */
public final class cpjl implements Parcelable.Creator<RemoveLocalCapabilityResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoveLocalCapabilityResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RemoveLocalCapabilityResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoveLocalCapabilityResponse[] newArray(int i) {
        return new RemoveLocalCapabilityResponse[i];
    }
}
