package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator<BackedUpContactsPerDeviceEntity> CREATOR = new coww();
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List<SourceStatsEntity> g;
    private List<SourceStats> h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List<SourceStatsEntity> list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final List<SourceStats> c() {
        List<SourceStatsEntity> list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            for (SourceStatsEntity sourceStatsEntity : this.g) {
                this.h.add(sourceStatsEntity);
            }
        }
        return this.h;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String d() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return cnvv.a(a(), backedUpContactsPerDevice.a()) && cnvv.a(b(), backedUpContactsPerDevice.b()) && cnvv.a(c(), backedUpContactsPerDevice.c()) && cnvv.a(d(), backedUpContactsPerDevice.d()) && cnvv.a(e(), backedUpContactsPerDevice.e()) && cnvv.a(f(), backedUpContactsPerDevice.f()) && cnvv.a(g(), backedUpContactsPerDevice.g());
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long f() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion g() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f(), g()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.y(parcel, 3, c());
        cnwn.k(parcel, 4, this.c, false);
        cnwn.t(parcel, 5, this.d);
        cnwn.t(parcel, 6, this.e);
        cnwn.t(parcel, 7, this.b);
        cnwn.u(parcel, 8, this.f, i);
        cnwn.c(parcel, d);
    }
}
