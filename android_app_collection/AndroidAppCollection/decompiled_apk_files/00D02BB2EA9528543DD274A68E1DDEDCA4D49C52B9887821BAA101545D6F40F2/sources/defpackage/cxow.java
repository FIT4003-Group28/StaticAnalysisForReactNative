package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
/* compiled from: PG */
/* renamed from: cxow  reason: default package */
/* loaded from: classes5.dex */
public final class cxow implements Parcelable.Creator<PeopleKitPickerResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitPickerResult createFromParcel(Parcel parcel) {
        return new PeopleKitPickerResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitPickerResult[] newArray(int i) {
        return new PeopleKitPickerResult[0];
    }
}
