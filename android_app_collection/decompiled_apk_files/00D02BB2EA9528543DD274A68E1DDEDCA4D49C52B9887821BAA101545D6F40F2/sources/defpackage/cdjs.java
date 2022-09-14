package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.ugc.post.editor.AutoValue_StructuredQuestionAnswer;
/* compiled from: PG */
/* renamed from: cdjs  reason: default package */
/* loaded from: classes4.dex */
public final class cdjs implements Parcelable.Creator<AutoValue_StructuredQuestionAnswer> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_StructuredQuestionAnswer createFromParcel(Parcel parcel) {
        return new AutoValue_StructuredQuestionAnswer((dcgn) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_StructuredQuestionAnswer[] newArray(int i) {
        return new AutoValue_StructuredQuestionAnswer[i];
    }
}
