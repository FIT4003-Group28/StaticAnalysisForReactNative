package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;
/* compiled from: PG */
/* renamed from: cugz  reason: default package */
/* loaded from: classes5.dex */
public final class cugz implements Parcelable.Creator<NotificationMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NotificationMetadata createFromParcel(Parcel parcel) {
        return new NotificationMetadata(parcel.readHashMap(NotificationMetadata.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NotificationMetadata[] newArray(int i) {
        return new NotificationMetadata[i];
    }
}
