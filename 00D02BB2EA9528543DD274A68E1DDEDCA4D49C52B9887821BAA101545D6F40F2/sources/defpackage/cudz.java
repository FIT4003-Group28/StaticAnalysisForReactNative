package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;
/* compiled from: PG */
/* renamed from: cudz  reason: default package */
/* loaded from: classes5.dex */
public final class cudz implements Parcelable.Creator<AutoValue_Notification> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_Notification createFromParcel(Parcel parcel) {
        return new AutoValue_Notification(parcel.readString(), Long.valueOf(parcel.readLong()), (NotificationMetadata) parcel.readParcelable(Notification.class.getClassLoader()), (Notification.OneOfType) parcel.readParcelable(Notification.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_Notification[] newArray(int i) {
        return new AutoValue_Notification[i];
    }
}
