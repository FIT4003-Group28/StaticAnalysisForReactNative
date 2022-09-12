package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
/* compiled from: PG */
/* renamed from: dbom  reason: default package */
/* loaded from: classes5.dex */
public final class dbom implements Parcelable.Creator<GetSeCardBalanceResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeCardBalanceResponse createFromParcel(Parcel parcel) {
        return new GetSeCardBalanceResponse(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeCardBalanceResponse[] newArray(int i) {
        return new GetSeCardBalanceResponse[i];
    }
}
