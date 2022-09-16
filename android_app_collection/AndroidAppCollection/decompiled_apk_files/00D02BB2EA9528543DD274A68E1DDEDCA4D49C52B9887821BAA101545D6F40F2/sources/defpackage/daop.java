package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.logging.MetricKey;
/* compiled from: PG */
/* renamed from: daop  reason: default package */
/* loaded from: classes5.dex */
public final class daop implements Parcelable.Creator<MetricKey> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MetricKey createFromParcel(Parcel parcel) {
        return new MetricKey(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MetricKey[] newArray(int i) {
        return new MetricKey[i];
    }
}
