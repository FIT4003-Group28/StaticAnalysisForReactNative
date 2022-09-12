package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
/* compiled from: PG */
/* renamed from: cpii  reason: default package */
/* loaded from: classes5.dex */
public final class cpii implements Parcelable.Creator<GetChannelOutputStreamResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetChannelOutputStreamResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) cnwm.q(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetChannelOutputStreamResponse(i, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetChannelOutputStreamResponse[] newArray(int i) {
        return new GetChannelOutputStreamResponse[i];
    }
}
