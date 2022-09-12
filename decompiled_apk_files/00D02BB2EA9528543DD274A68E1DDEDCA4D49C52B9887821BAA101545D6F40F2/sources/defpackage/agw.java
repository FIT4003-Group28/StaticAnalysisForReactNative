package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
/* compiled from: PG */
/* renamed from: agw  reason: default package */
/* loaded from: classes2.dex */
public final class agw implements Parcelable.Creator<IntentSenderRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IntentSenderRequest createFromParcel(Parcel parcel) {
        return new IntentSenderRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IntentSenderRequest[] newArray(int i) {
        return new IntentSenderRequest[i];
    }
}
