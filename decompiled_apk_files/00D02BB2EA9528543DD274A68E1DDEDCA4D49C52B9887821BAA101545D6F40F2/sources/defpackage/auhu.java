package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.notification.api.intent.AutoValue_NotificationIntentConverter_NotificationIntent;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
/* compiled from: PG */
/* renamed from: auhu  reason: default package */
/* loaded from: classes2.dex */
public final class auhu implements Parcelable.Creator<AutoValue_NotificationIntentConverter_NotificationIntent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_NotificationIntentConverter_NotificationIntent createFromParcel(Parcel parcel) {
        return new AutoValue_NotificationIntentConverter_NotificationIntent((dbsg) parcel.readSerializable(), (auhw) Enum.valueOf(auhw.class, parcel.readString()), (Intent) parcel.readParcelable(NotificationIntentConverter$NotificationIntent.class.getClassLoader()), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable(), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_NotificationIntentConverter_NotificationIntent[] newArray(int i) {
        return new AutoValue_NotificationIntentConverter_NotificationIntent[i];
    }
}
