package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import com.google.android.apps.gmm.inappsurvey.webview.SurveyWebViewCallbacks;
/* compiled from: PG */
/* renamed from: afae  reason: default package */
/* loaded from: classes2.dex */
public final class afae implements Parcelable.Creator<SurveyWebViewCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyWebViewCallbacks createFromParcel(Parcel parcel) {
        return new SurveyWebViewCallbacks((SurveyData) parcel.readParcelable(SurveyData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyWebViewCallbacks[] newArray(int i) {
        return new SurveyWebViewCallbacks[i];
    }
}
