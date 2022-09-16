package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* renamed from: cxqs  reason: default package */
/* loaded from: classes5.dex */
public final class cxqs implements Parcelable.Creator<PeopleKitVisualElementPath> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitVisualElementPath createFromParcel(Parcel parcel) {
        return new PeopleKitVisualElementPath(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitVisualElementPath[] newArray(int i) {
        return new PeopleKitVisualElementPath[i];
    }
}
