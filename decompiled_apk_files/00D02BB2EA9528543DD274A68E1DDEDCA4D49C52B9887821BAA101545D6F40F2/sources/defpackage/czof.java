package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.Answer;
/* compiled from: PG */
/* renamed from: czof  reason: default package */
/* loaded from: classes5.dex */
public final class czof implements Parcelable.Creator<Answer> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Answer createFromParcel(Parcel parcel) {
        return new Answer(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Answer[] newArray(int i) {
        return new Answer[i];
    }
}
