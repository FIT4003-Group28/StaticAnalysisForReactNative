package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(7);
    public final String a;
    @Deprecated
    public final int b;
    private final long c;

    public Feature(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public Feature(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.a;
            if (((str != null && str.equals(feature.a)) || (this.a == null && feature.a == null)) && a() == feature.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("name", this.a, arrayList);
        tjk.g("version", Long.valueOf(a()), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.t(parcel, 3, a());
        tqj.n(parcel, m);
    }
}
