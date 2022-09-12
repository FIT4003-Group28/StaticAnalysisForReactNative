package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
/* compiled from: PG */
/* renamed from: cphk  reason: default package */
/* loaded from: classes5.dex */
public final class cphk implements Parcelable.Creator<AddLocalCapabilityResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddLocalCapabilityResponse createFromParcel(Parcel parcel) {
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
        return new AddLocalCapabilityResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddLocalCapabilityResponse[] newArray(int i) {
        return new AddLocalCapabilityResponse[i];
    }
}
