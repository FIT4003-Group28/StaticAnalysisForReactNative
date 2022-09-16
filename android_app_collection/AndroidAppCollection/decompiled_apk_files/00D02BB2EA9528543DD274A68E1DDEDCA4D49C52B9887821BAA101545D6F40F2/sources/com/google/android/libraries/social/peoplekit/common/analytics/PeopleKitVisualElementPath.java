package com.google.android.libraries.social.peoplekit.common.analytics;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PeopleKitVisualElementPath implements Parcelable {
    public static final Parcelable.Creator<PeopleKitVisualElementPath> CREATOR = new cxqs();
    public final cxod a;

    public PeopleKitVisualElementPath() {
        this.a = new cxod();
    }

    public final void a(cxoc cxocVar) {
        this.a.b(cxocVar);
    }

    public final void b(cxod cxodVar) {
        for (cxoc cxocVar : cxodVar.a) {
            this.a.b(cxocVar);
        }
    }

    public final void c(PeopleKitVisualElementPath peopleKitVisualElementPath) {
        b(peopleKitVisualElementPath.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }

    public PeopleKitVisualElementPath(Parcel parcel) {
        this.a = (cxod) parcel.readSerializable();
    }
}
