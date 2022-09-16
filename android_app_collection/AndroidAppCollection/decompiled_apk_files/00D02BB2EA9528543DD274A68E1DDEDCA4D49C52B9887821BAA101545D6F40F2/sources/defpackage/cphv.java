package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
/* compiled from: PG */
/* renamed from: cphv  reason: default package */
/* loaded from: classes5.dex */
public final class cphv implements Parcelable.Creator<CloseChannelResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloseChannelResponse createFromParcel(Parcel parcel) {
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
        return new CloseChannelResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloseChannelResponse[] newArray(int i) {
        return new CloseChannelResponse[i];
    }
}
