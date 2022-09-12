package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
/* compiled from: PG */
/* renamed from: cyew  reason: default package */
/* loaded from: classes5.dex */
public final class cyew implements Parcelable.Creator<DynamiteExtendedData.OrganizationInfo.CustomerInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo.CustomerInfo createFromParcel(Parcel parcel) {
        return DynamiteExtendedData.OrganizationInfo.CustomerInfo.a((DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo.CustomerInfo[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo.CustomerInfo[0];
    }
}
