package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
/* compiled from: PG */
/* renamed from: cpbl  reason: default package */
/* loaded from: classes5.dex */
public final class cpbl implements Parcelable.Creator<GetActiveAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveAccountRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        while (parcel.dataPosition() < f) {
            cnwm.d(parcel, parcel.readInt());
        }
        cnwm.B(parcel, f);
        return new GetActiveAccountRequest();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveAccountRequest[] newArray(int i) {
        return new GetActiveAccountRequest[i];
    }
}
