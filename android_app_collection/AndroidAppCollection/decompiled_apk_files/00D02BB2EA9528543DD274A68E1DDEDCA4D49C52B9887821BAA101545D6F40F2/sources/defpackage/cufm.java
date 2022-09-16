package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: cufm  reason: default package */
/* loaded from: classes5.dex */
public final class cufm implements Parcelable.Creator<ContactId.ContactType> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContactId.ContactType createFromParcel(Parcel parcel) {
        return ContactId.ContactType.a(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContactId.ContactType[] newArray(int i) {
        return new ContactId.ContactType[i];
    }
}
