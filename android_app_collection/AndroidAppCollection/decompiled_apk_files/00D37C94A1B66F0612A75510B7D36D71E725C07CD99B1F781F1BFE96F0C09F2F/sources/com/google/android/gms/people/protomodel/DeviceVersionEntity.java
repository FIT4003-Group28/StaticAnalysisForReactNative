package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator CREATOR = new rsz(3);
    public final Integer a;

    public DeviceVersionEntity(Integer num) {
        this.a = num;
    }

    @Override // com.google.android.gms.people.protomodel.DeviceVersion
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceVersion)) {
            return false;
        }
        if (this != obj) {
            return tnk.j(a(), ((DeviceVersion) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.B(parcel, 2, this.a);
        tqj.n(parcel, m);
    }
}
