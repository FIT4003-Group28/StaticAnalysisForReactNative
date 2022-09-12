package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
/* compiled from: PG */
/* renamed from: czoh  reason: default package */
/* loaded from: classes5.dex */
public final class czoh implements Parcelable.Creator<SurveyDataImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyDataImpl createFromParcel(Parcel parcel) {
        try {
            return new SurveyDataImpl(parcel);
        } catch (dsrm e) {
            throw new BadParcelableException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SurveyDataImpl[] newArray(int i) {
        return new SurveyDataImpl[i];
    }
}
