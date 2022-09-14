package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
/* compiled from: PG */
/* renamed from: cxqt  reason: default package */
/* loaded from: classes5.dex */
public final class cxqt implements Parcelable.Creator<Stopwatch> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Stopwatch createFromParcel(Parcel parcel) {
        return new Stopwatch(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Stopwatch[] newArray(int i) {
        return new Stopwatch[0];
    }
}
