package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.notification.intent.GenericWebviewNotificationCallbacks;
/* compiled from: PG */
/* renamed from: aurw  reason: default package */
/* loaded from: classes2.dex */
public final class aurw implements Parcelable.Creator<GenericWebviewNotificationCallbacks> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GenericWebviewNotificationCallbacks createFromParcel(Parcel parcel) {
        return new GenericWebviewNotificationCallbacks(GenericWebviewNotificationCallbacks.k(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GenericWebviewNotificationCallbacks[] newArray(int i) {
        return new GenericWebviewNotificationCallbacks[i];
    }
}
