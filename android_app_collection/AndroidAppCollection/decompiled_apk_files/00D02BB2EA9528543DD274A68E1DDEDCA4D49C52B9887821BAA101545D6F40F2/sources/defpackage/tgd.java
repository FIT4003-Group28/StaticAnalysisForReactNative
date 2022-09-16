package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.fetch.api.AutoValue_FetchState_Fetch;
/* compiled from: PG */
/* renamed from: tgd  reason: default package */
/* loaded from: classes7.dex */
public final class tgd implements Parcelable.Creator<AutoValue_FetchState_Fetch> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_FetchState_Fetch createFromParcel(Parcel parcel) {
        return new AutoValue_FetchState_Fetch((tgk) Enum.valueOf(tgk.class, parcel.readString()), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_FetchState_Fetch[] newArray(int i) {
        return new AutoValue_FetchState_Fetch[i];
    }
}
