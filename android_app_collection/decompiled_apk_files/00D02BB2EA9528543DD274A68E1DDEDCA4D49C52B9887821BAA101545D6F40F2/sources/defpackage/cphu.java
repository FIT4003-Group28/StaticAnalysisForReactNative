package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
/* compiled from: PG */
/* renamed from: cphu  reason: default package */
/* loaded from: classes5.dex */
public final class cphu implements Parcelable.Creator<ChannelSendFileResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelSendFileResponse createFromParcel(Parcel parcel) {
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
        return new ChannelSendFileResponse(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChannelSendFileResponse[] newArray(int i) {
        return new ChannelSendFileResponse[i];
    }
}
