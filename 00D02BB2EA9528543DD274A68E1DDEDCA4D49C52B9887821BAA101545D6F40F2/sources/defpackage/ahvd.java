package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.api.AutoValue_Profile;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ahvd  reason: default package */
/* loaded from: classes2.dex */
public final class ahvd implements Parcelable.Creator<AutoValue_Profile> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_Profile createFromParcel(Parcel parcel) {
        return new AutoValue_Profile((PersonId) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_Profile[] newArray(int i) {
        return new AutoValue_Profile[i];
    }
}
