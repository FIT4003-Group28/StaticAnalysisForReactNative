package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator<FetchBackUpDeviceContactInfoResponseEntity> CREATOR = new coxa();
    private final List<BackedUpContactsPerDeviceEntity> a;
    private List<BackedUpContactsPerDevice> b;

    public FetchBackUpDeviceContactInfoResponseEntity(List<BackedUpContactsPerDeviceEntity> list) {
        this.a = list;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse
    public final List<BackedUpContactsPerDevice> a() {
        List<BackedUpContactsPerDeviceEntity> list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            for (BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity : this.a) {
                this.b.add(backedUpContactsPerDeviceEntity);
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this != obj) {
            return cnvv.a(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, a());
        cnwn.c(parcel, d);
    }
}
