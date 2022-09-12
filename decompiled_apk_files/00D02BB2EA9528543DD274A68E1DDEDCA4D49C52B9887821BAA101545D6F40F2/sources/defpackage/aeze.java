package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.inappsurvey.AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl;
import com.google.android.apps.gmm.inappsurvey.InAppSurveyVeneerImpl$SurveyDataImpl;
/* compiled from: PG */
/* renamed from: aeze  reason: default package */
/* loaded from: classes2.dex */
public final class aeze implements Parcelable.Creator<AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl createFromParcel(Parcel parcel) {
        return new AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl((Intent) parcel.readParcelable(InAppSurveyVeneerImpl$SurveyDataImpl.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl[] newArray(int i) {
        return new AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl[i];
    }
}
