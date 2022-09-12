package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.CheckConsentRequest;
/* compiled from: PG */
/* renamed from: cpdc  reason: default package */
/* loaded from: classes5.dex */
public final class cpdc implements Parcelable.Creator<CheckConsentRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CheckConsentRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                iArr = cnwm.u(parcel, readInt);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new CheckConsentRequest(i, iArr, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CheckConsentRequest[] newArray(int i) {
        return new CheckConsentRequest[i];
    }
}
