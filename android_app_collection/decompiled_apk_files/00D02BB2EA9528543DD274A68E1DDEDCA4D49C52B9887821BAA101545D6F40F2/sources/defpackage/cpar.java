package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.RefreshSeCardsResponse;
/* compiled from: PG */
/* renamed from: cpar  reason: default package */
/* loaded from: classes5.dex */
public final class cpar implements Parcelable.Creator<RefreshSeCardsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RefreshSeCardsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        while (parcel.dataPosition() < f) {
            cnwm.d(parcel, parcel.readInt());
        }
        cnwm.B(parcel, f);
        return new RefreshSeCardsResponse();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RefreshSeCardsResponse[] newArray(int i) {
        return new RefreshSeCardsResponse[i];
    }
}
