package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.ugc.clientnotification.review.AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams;
/* compiled from: PG */
/* renamed from: bzun  reason: default package */
/* loaded from: classes4.dex */
public final class bzun implements Parcelable.Creator<AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams createFromParcel(Parcel parcel) {
        return new AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams(parcel.readLong(), parcel.readString(), parcel.readString(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams[] newArray(int i) {
        return new AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams[i];
    }
}
