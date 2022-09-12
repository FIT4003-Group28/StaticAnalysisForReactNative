package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceRequest;
/* compiled from: PG */
/* renamed from: dbol  reason: default package */
/* loaded from: classes5.dex */
public final class dbol implements Parcelable.Creator<GetSeCardBalanceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeCardBalanceRequest createFromParcel(Parcel parcel) {
        return new GetSeCardBalanceRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeCardBalanceRequest[] newArray(int i) {
        return new GetSeCardBalanceRequest[i];
    }
}
