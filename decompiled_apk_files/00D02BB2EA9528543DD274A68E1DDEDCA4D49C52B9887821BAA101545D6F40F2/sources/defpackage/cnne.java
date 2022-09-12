package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
/* compiled from: PG */
/* renamed from: cnne  reason: default package */
/* loaded from: classes5.dex */
public final class cnne implements Parcelable.Creator<GoogleCertificatesLookupResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesLookupResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GoogleCertificatesLookupResponse(z, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesLookupResponse[] newArray(int i) {
        return new GoogleCertificatesLookupResponse[i];
    }
}
