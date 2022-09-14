package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a3 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<a3> CREATOR = new z2();

    /* renamed from: b  reason: collision with root package name */
    private final String f3859b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3860c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3861d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3862e;

    public a3(String str, String str2, String str3, long j) {
        this.f3859b = str;
        com.google.android.gms.common.internal.s.b(str2);
        this.f3860c = str2;
        this.f3861d = str3;
        this.f3862e = j;
    }

    public final String f() {
        return this.f3859b;
    }

    public final String j() {
        return this.f3860c;
    }

    public final long k() {
        return this.f3862e;
    }

    public final String q() {
        return this.f3861d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3859b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3860c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3861d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3862e);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
