package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: cudb  reason: default package */
/* loaded from: classes5.dex */
public final class cudb implements Parcelable.Creator<AutoValue_ContactId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ContactId createFromParcel(Parcel parcel) {
        return new AutoValue_ContactId(parcel.readString(), parcel.readString(), (ContactId.ContactType) parcel.readParcelable(ContactId.class.getClassLoader()), (dbsg) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ContactId[] newArray(int i) {
        return new AutoValue_ContactId[i];
    }
}
