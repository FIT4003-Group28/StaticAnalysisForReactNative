package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i3 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.v0.a.x2<Object> {
    public static final Parcelable.Creator<i3> CREATOR = new h3();

    /* renamed from: b  reason: collision with root package name */
    private final String f3921b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3922c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3923d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3924e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3925f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3926g;

    public i3(String str, long j, boolean z, String str2, String str3, String str4) {
        com.google.android.gms.common.internal.s.b(str);
        this.f3921b = str;
        this.f3922c = j;
        this.f3923d = z;
        this.f3924e = str2;
        this.f3925f = str3;
        this.f3926g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3921b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3922c);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3923d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3924e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f3925f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f3926g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
