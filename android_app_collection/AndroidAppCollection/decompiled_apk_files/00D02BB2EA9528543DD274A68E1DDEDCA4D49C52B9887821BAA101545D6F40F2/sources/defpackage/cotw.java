package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
/* compiled from: PG */
/* renamed from: cotw  reason: default package */
/* loaded from: classes5.dex */
public final class cotw implements Parcelable.Creator<OpenFileDescriptorResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenFileDescriptorResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) cnwm.q(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new OpenFileDescriptorResponse(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenFileDescriptorResponse[] newArray(int i) {
        return new OpenFileDescriptorResponse[i];
    }
}
