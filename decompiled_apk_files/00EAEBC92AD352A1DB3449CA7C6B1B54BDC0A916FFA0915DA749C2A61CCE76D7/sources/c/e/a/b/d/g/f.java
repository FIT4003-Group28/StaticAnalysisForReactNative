package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: b  reason: collision with root package name */
    public final long f4136b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4137c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4138d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4139e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4140f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4141g;

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f4142h;

    public f(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f4136b = j;
        this.f4137c = j2;
        this.f4138d = z;
        this.f4139e = str;
        this.f4140f = str2;
        this.f4141g = str3;
        this.f4142h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4136b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4137c);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f4138d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f4139e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f4140f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f4141g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f4142h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
