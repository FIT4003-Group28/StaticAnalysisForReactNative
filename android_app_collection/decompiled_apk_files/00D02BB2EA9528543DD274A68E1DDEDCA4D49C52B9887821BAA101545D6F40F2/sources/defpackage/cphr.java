package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;
/* compiled from: PG */
/* renamed from: cphr  reason: default package */
/* loaded from: classes5.dex */
public final class cphr implements Parcelable.Creator<ChannelEventParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelEventParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                channelImpl = (ChannelImpl) cnwm.q(parcel, readInt, ChannelImpl.CREATOR);
            } else if (b == 3) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i3 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ChannelEventParcelable(channelImpl, i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelEventParcelable[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }
}
