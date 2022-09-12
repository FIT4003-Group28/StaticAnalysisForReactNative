package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.GetAccountsRequest;
/* compiled from: PG */
/* renamed from: cmqz  reason: default package */
/* loaded from: classes5.dex */
public final class cmqz implements Parcelable.Creator<GetAccountsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAccountsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String[] strArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                strArr = cnwm.w(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetAccountsRequest(str, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAccountsRequest[] newArray(int i) {
        return new GetAccountsRequest[i];
    }
}
