package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class v0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<v0> CREATOR = new y0();

    /* renamed from: b  reason: collision with root package name */
    private final String f4004b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4005c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4006d;

    public v0(String str, String str2, String str3) {
        this.f4004b = str;
        this.f4005c = str2;
        this.f4006d = str3;
    }

    public final String f() {
        return this.f4004b;
    }

    public final String j() {
        return this.f4005c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4004b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4005c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f4006d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
