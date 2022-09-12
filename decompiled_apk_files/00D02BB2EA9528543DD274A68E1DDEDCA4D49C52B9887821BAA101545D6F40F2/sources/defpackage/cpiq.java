package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
/* compiled from: PG */
/* renamed from: cpiq  reason: default package */
/* loaded from: classes5.dex */
public final class cpiq implements Parcelable.Creator<GetFdForAssetResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetFdForAssetResponse createFromParcel(Parcel parcel) {
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
        return new GetFdForAssetResponse(i, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetFdForAssetResponse[] newArray(int i) {
        return new GetFdForAssetResponse[i];
    }
}
