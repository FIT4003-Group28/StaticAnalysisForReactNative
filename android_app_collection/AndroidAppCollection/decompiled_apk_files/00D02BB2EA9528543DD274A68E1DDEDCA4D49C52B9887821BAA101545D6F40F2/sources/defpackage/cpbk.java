package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
/* compiled from: PG */
/* renamed from: cpbk  reason: default package */
/* loaded from: classes5.dex */
public final class cpbk implements Parcelable.Creator<FirstPartyTokenizePanRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FirstPartyTokenizePanRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 6:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 9:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case 10:
                    z5 = cnwm.g(parcel, readInt);
                    break;
                case 11:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 12:
                    z6 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new FirstPartyTokenizePanRequest(str, z, str2, bArr, z2, str3, z3, z4, z5, str4, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FirstPartyTokenizePanRequest[] newArray(int i) {
        return new FirstPartyTokenizePanRequest[i];
    }
}
