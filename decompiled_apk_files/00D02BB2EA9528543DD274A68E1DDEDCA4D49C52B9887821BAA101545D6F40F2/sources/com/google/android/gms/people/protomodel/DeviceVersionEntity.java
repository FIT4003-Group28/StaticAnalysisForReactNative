package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator<DeviceVersionEntity> CREATOR = new cowy();
    public final Integer a;

    public DeviceVersionEntity(Integer num) {
        this.a = num;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
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
            return cnvv.a(a(), ((DeviceVersion) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.s(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
