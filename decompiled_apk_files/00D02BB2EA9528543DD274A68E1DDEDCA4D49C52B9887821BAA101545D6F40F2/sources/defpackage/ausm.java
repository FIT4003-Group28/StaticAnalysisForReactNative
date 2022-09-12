package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.notification.log.api.AutoValue_NotificationLogger_IntentMetadata;
/* compiled from: PG */
/* renamed from: ausm  reason: default package */
/* loaded from: classes2.dex */
public final class ausm implements Parcelable.Creator<AutoValue_NotificationLogger_IntentMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_NotificationLogger_IntentMetadata createFromParcel(Parcel parcel) {
        auhv auhvVar = (auhv) Enum.valueOf(auhv.class, parcel.readString());
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_NotificationLogger_IntentMetadata(auhvVar, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_NotificationLogger_IntentMetadata[] newArray(int i) {
        return new AutoValue_NotificationLogger_IntentMetadata[i];
    }
}
