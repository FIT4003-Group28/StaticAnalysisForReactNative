package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new rsz(5);
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse
    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            for (BackedUpContactsPerDevice backedUpContactsPerDevice : this.a) {
                this.b.add(backedUpContactsPerDevice);
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this != obj) {
            return tnk.j(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.J(parcel, 2, a());
        tqj.n(parcel, m);
    }
}
