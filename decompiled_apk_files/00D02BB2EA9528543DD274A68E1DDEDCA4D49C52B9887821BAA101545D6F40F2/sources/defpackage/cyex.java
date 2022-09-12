package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
/* compiled from: PG */
/* renamed from: cyex  reason: default package */
/* loaded from: classes5.dex */
public final class cyex implements Parcelable.Creator<DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId createFromParcel(Parcel parcel) {
        return DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId.a(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId[0];
    }
}
