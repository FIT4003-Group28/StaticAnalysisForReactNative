package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId_GroupId;
/* compiled from: PG */
/* renamed from: cudh  reason: default package */
/* loaded from: classes5.dex */
public final class cudh implements Parcelable.Creator<AutoValue_ConversationId_GroupId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ConversationId_GroupId createFromParcel(Parcel parcel) {
        return new AutoValue_ConversationId_GroupId(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ConversationId_GroupId[] newArray(int i) {
        return new AutoValue_ConversationId_GroupId[i];
    }
}
