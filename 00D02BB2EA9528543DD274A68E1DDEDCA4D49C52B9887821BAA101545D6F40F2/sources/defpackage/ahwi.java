package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ahwi  reason: default package */
/* loaded from: classes2.dex */
public final class ahwi implements Parcelable.Creator<PersonId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonId createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        dbsk.s(readString);
        String readString2 = parcel.readString();
        dbsk.s(readString2);
        return new PersonId(readString, ahwj.a(readString2));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonId[] newArray(int i) {
        return new PersonId[i];
    }
}
