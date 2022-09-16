package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cufu  reason: default package */
/* loaded from: classes5.dex */
public final class cufu implements Parcelable.Creator<ConversationId.OneOfId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConversationId.OneOfId createFromParcel(Parcel parcel) {
        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
        int ordinal = ((ConversationId.IdType) parcel.readParcelable(getClass().getClassLoader())).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cual.a((ConversationId.GroupId) parcel.readParcelable(getClass().getClassLoader()));
            }
            return null;
        }
        return cual.b((ContactId) parcel.readParcelable(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConversationId.OneOfId[] newArray(int i) {
        return new ConversationId.OneOfId[i];
    }
}
