package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.fetch.api.AutoValue_FetchState;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: tgc  reason: default package */
/* loaded from: classes7.dex */
public final class tgc implements Parcelable.Creator<AutoValue_FetchState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_FetchState createFromParcel(Parcel parcel) {
        return new AutoValue_FetchState((FetchState.Fetch) parcel.readParcelable(FetchState.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_FetchState[] newArray(int i) {
        return new AutoValue_FetchState[i];
    }
}
