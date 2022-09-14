package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class r0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<r0> CREATOR = new u0();

    /* renamed from: b  reason: collision with root package name */
    private final String f3982b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3983c;

    public r0(String str, String str2) {
        this.f3982b = str;
        this.f3983c = str2;
    }

    public final String f() {
        return this.f3982b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3982b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3983c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
