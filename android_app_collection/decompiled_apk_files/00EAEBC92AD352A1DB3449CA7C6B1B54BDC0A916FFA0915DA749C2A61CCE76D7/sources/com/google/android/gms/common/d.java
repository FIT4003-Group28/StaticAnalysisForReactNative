package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
/* loaded from: classes.dex */
public class d extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* renamed from: b  reason: collision with root package name */
    private final String f6948b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final int f6949c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6950d;

    public d(String str, int i, long j) {
        this.f6948b = str;
        this.f6949c = i;
        this.f6950d = j;
    }

    public d(String str, long j) {
        this.f6948b = str;
        this.f6950d = j;
        this.f6949c = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((q() != null && q().equals(dVar.q())) || (q() == null && dVar.q() == null)) && r() == dVar.r()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.a(q(), Long.valueOf(r()));
    }

    public String q() {
        return this.f6948b;
    }

    public long r() {
        long j = this.f6950d;
        return j == -1 ? this.f6949c : j;
    }

    public String toString() {
        r.a a2 = com.google.android.gms.common.internal.r.a(this);
        a2.a("name", q());
        a2.a("version", Long.valueOf(r()));
        return a2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, q(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f6949c);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, r());
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
