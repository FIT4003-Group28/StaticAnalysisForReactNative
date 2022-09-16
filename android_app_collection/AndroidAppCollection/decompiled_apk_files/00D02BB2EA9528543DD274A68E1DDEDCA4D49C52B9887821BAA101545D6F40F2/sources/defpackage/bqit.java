package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.review.api.AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams;
/* compiled from: PG */
/* renamed from: bqit  reason: default package */
/* loaded from: classes4.dex */
public final class bqit implements Parcelable.Creator<AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams createFromParcel(Parcel parcel) {
        return new AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams((ckdw) Enum.valueOf(ckdw.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams[] newArray(int i) {
        return new AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams[i];
    }
}
