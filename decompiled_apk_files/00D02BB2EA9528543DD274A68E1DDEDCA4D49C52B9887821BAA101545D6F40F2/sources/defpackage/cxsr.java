package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
/* compiled from: PG */
/* renamed from: cxsr  reason: default package */
/* loaded from: classes5.dex */
public final class cxsr implements Parcelable.Creator<PeopleKitConfigImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitConfigImpl createFromParcel(Parcel parcel) {
        return new PeopleKitConfigImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitConfigImpl[] newArray(int i) {
        return new PeopleKitConfigImpl[i];
    }
}
