package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
/* compiled from: PG */
/* renamed from: ckym  reason: default package */
/* loaded from: classes5.dex */
public final class ckym implements Parcelable.Creator<SystemParcelableWrapper> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SystemParcelableWrapper createFromParcel(Parcel parcel) {
        return new SystemParcelableWrapper(parcel.readParcelable(null));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SystemParcelableWrapper[] newArray(int i) {
        return new SystemParcelableWrapper[i];
    }
}
