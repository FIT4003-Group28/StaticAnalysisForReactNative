package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class t0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<t0> CREATOR = new w0();

    /* renamed from: b  reason: collision with root package name */
    private final String f3992b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3993c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3994d;

    public t0(String str, String str2, String str3) {
        this.f3992b = str;
        this.f3993c = str2;
        this.f3994d = str3;
    }

    public final String f() {
        return this.f3992b;
    }

    public final String j() {
        return this.f3993c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3992b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3993c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3994d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
