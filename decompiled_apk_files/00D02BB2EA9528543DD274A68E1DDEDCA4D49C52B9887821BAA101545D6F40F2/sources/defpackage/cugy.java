package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: cugy  reason: default package */
/* loaded from: classes5.dex */
public final class cugy implements Parcelable.Creator<Notification.OneOfType> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Notification.OneOfType createFromParcel(Parcel parcel) {
        Notification.NotificationType notificationType = Notification.NotificationType.a;
        if (((Notification.NotificationType) parcel.readParcelable(getClass().getClassLoader())).ordinal() != 0) {
            return null;
        }
        return cuaz.a((MessageReceivedNotification) parcel.readParcelable(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Notification.OneOfType[] newArray(int i) {
        return new Notification.OneOfType[i];
    }
}
