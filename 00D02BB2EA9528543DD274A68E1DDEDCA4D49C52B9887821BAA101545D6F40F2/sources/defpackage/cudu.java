package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
/* compiled from: PG */
/* renamed from: cudu  reason: default package */
/* loaded from: classes5.dex */
public final class cudu implements Parcelable.Creator<AutoValue_MessageReceivedNotification> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_MessageReceivedNotification createFromParcel(Parcel parcel) {
        return new AutoValue_MessageReceivedNotification((ConversationId) parcel.readParcelable(MessageReceivedNotification.class.getClassLoader()), parcel.readString(), (ContactId) parcel.readParcelable(MessageReceivedNotification.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_MessageReceivedNotification[] newArray(int i) {
        return new AutoValue_MessageReceivedNotification[i];
    }
}
