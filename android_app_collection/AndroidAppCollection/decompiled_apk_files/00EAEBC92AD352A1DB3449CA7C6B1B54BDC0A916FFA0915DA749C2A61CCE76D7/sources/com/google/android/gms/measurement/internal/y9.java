package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y9 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<y9> CREATOR = new x9();

    /* renamed from: b  reason: collision with root package name */
    private final int f7815b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7816c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7817d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f7818e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7819f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7820g;

    /* renamed from: h  reason: collision with root package name */
    public final Double f7821h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y9(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.f7815b = i;
        this.f7816c = str;
        this.f7817d = j;
        this.f7818e = l;
        if (i == 1) {
            this.f7821h = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f7821h = d2;
        }
        this.f7819f = str2;
        this.f7820g = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y9(aa aaVar) {
        this(aaVar.f7175c, aaVar.f7176d, aaVar.f7177e, aaVar.f7174b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y9(String str, long j, Object obj, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        this.f7815b = 2;
        this.f7816c = str;
        this.f7817d = j;
        this.f7820g = str2;
        if (obj == null) {
            this.f7818e = null;
            this.f7821h = null;
            this.f7819f = null;
        } else if (obj instanceof Long) {
            this.f7818e = (Long) obj;
            this.f7821h = null;
            this.f7819f = null;
        } else if (obj instanceof String) {
            this.f7818e = null;
            this.f7821h = null;
            this.f7819f = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f7818e = null;
            this.f7821h = (Double) obj;
            this.f7819f = null;
        }
    }

    public final Object f() {
        Long l = this.f7818e;
        if (l != null) {
            return l;
        }
        Double d2 = this.f7821h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f7819f;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7815b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7816c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f7817d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7818e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, (Float) null, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f7819f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f7820g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.f7821h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
