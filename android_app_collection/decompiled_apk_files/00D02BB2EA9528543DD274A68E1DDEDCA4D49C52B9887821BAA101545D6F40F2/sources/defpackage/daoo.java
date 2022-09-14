package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
/* compiled from: PG */
/* renamed from: daoo  reason: default package */
/* loaded from: classes5.dex */
public final class daoo implements Parcelable.Creator<CustomEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CustomEvent createFromParcel(Parcel parcel) {
        return new CustomEvent(parcel.readLong(), (MetricKey) parcel.readParcelable(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CustomEvent[] newArray(int i) {
        return new CustomEvent[i];
    }
}
