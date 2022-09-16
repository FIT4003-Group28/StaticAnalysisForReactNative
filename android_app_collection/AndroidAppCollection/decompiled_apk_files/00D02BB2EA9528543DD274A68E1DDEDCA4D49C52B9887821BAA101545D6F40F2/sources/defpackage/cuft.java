package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuft  reason: default package */
/* loaded from: classes5.dex */
public final class cuft implements Parcelable.Creator<ConversationId.IdType> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConversationId.IdType createFromParcel(Parcel parcel) {
        return ConversationId.IdType.a(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConversationId.IdType[] newArray(int i) {
        return new ConversationId.IdType[i];
    }
}
