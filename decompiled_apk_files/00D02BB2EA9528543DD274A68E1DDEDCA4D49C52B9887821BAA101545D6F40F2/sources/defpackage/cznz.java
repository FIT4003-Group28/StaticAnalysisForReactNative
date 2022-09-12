package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyMetadata;
/* compiled from: PG */
/* renamed from: cznz  reason: default package */
/* loaded from: classes5.dex */
public final class cznz implements Parcelable.Creator<SurveyMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyMetadata createFromParcel(Parcel parcel) {
        return new SurveyMetadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyMetadata[] newArray(int i) {
        return new SurveyMetadata[i];
    }
}
