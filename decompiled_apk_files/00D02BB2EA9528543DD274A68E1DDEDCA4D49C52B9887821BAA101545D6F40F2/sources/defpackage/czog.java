package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
/* compiled from: PG */
/* renamed from: czog  reason: default package */
/* loaded from: classes5.dex */
public final class czog implements Parcelable.Creator<QuestionMetrics> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QuestionMetrics createFromParcel(Parcel parcel) {
        return new QuestionMetrics(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QuestionMetrics[] newArray(int i) {
        return new QuestionMetrics[i];
    }
}
