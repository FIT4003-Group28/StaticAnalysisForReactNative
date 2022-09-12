package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator<SourceStatsEntity> CREATOR = new coxg();
    public final String a;
    public final Integer b;
    public final Integer c;

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStats sourceStats = (SourceStats) obj;
        return cnvv.a(a(), sourceStats.a()) && cnvv.a(b(), sourceStats.b()) && cnvv.a(c(), sourceStats.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.s(parcel, 3, this.b);
        cnwn.s(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
