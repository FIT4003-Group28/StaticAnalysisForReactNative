package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
/* compiled from: PG */
/* renamed from: cpji  reason: default package */
/* loaded from: classes5.dex */
public final class cpji implements Parcelable.Creator<OpenChannelResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenChannelResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ChannelImpl channelImpl = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                channelImpl = (ChannelImpl) cnwm.q(parcel, readInt, ChannelImpl.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new OpenChannelResponse(i, channelImpl);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenChannelResponse[] newArray(int i) {
        return new OpenChannelResponse[i];
    }
}
