package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
/* compiled from: PG */
/* renamed from: cnll  reason: default package */
/* loaded from: classes5.dex */
public final class cnll implements Parcelable.Creator<CloudMessagingMessengerCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessagingMessengerCompat createFromParcel(Parcel parcel) {
        return new CloudMessagingMessengerCompat(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessagingMessengerCompat[] newArray(int i) {
        return new CloudMessagingMessengerCompat[i];
    }
}
