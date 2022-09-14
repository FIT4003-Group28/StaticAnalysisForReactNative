package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
/* compiled from: PG */
/* renamed from: cpht  reason: default package */
/* loaded from: classes5.dex */
public final class cpht implements Parcelable.Creator<ChannelReceiveFileResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelReceiveFileResponse createFromParcel(Parcel parcel) {
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
        return new ChannelReceiveFileResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelReceiveFileResponse[] newArray(int i) {
        return new ChannelReceiveFileResponse[i];
    }
}
