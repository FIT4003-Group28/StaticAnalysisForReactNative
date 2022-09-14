package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<p0> CREATOR = new s0();

    /* renamed from: b  reason: collision with root package name */
    private final String f3971b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3972c;

    public p0(String str, String str2) {
        this.f3971b = str;
        this.f3972c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3971b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3972c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
