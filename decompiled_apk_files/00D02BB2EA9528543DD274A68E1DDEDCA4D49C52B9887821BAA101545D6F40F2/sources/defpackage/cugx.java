package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: cugx  reason: default package */
/* loaded from: classes5.dex */
public final class cugx implements Parcelable.Creator<Notification.NotificationType> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Notification.NotificationType createFromParcel(Parcel parcel) {
        return Notification.NotificationType.a(parcel.readInt()).b();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Notification.NotificationType[] newArray(int i) {
        return new Notification.NotificationType[i];
    }
}
