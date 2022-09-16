package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
/* compiled from: PG */
/* renamed from: cyeu  reason: default package */
/* loaded from: classes5.dex */
public final class cyeu implements Parcelable.Creator<DynamiteExtendedData.OrganizationInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo createFromParcel(Parcel parcel) {
        return new DynamiteExtendedData.OrganizationInfo((DynamiteExtendedData.OrganizationInfo.CustomerInfo) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.CustomerInfo.class.getClassLoader()), (DynamiteExtendedData.OrganizationInfo.ConsumerInfo) parcel.readParcelable(DynamiteExtendedData.OrganizationInfo.ConsumerInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamiteExtendedData.OrganizationInfo[] newArray(int i) {
        return new DynamiteExtendedData.OrganizationInfo[0];
    }
}
