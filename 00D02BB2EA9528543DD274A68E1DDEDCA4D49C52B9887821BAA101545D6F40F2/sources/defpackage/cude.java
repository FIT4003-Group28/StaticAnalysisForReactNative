package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cude  reason: default package */
/* loaded from: classes5.dex */
public final class cude implements Parcelable.Creator<AutoValue_ConversationId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ConversationId createFromParcel(Parcel parcel) {
        return new AutoValue_ConversationId((ContactId) parcel.readParcelable(ConversationId.class.getClassLoader()), (ConversationId.OneOfId) parcel.readParcelable(ConversationId.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ConversationId[] newArray(int i) {
        return new AutoValue_ConversationId[i];
    }
}
