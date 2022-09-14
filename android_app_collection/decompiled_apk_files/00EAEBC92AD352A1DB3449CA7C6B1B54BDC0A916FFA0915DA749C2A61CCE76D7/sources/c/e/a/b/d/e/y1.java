package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<y1> CREATOR = new b2();

    /* renamed from: b  reason: collision with root package name */
    private final String f4017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4018c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4019d;

    public y1(String str, String str2, String str3) {
        this.f4017b = str;
        this.f4018c = str2;
        this.f4019d = str3;
    }

    public final String f() {
        return this.f4017b;
    }

    public final String j() {
        return this.f4018c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4017b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4018c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f4019d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
