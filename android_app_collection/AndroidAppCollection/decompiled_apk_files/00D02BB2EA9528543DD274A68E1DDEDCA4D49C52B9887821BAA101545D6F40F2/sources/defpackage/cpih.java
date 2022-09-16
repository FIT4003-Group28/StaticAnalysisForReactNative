package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
/* compiled from: PG */
/* renamed from: cpih  reason: default package */
/* loaded from: classes5.dex */
public final class cpih implements Parcelable.Creator<GetChannelInputStreamResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetChannelInputStreamResponse createFromParcel(Parcel parcel) {
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
        return new GetChannelInputStreamResponse(i, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetChannelInputStreamResponse[] newArray(int i) {
        return new GetChannelInputStreamResponse[i];
    }
}
