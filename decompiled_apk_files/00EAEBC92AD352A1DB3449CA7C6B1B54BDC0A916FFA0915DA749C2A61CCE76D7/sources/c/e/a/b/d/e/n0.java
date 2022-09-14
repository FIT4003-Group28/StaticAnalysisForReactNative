package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class n0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<n0> CREATOR = new q0();

    /* renamed from: b  reason: collision with root package name */
    private final String f3952b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3953c;

    public n0(String str, String str2) {
        this.f3952b = str;
        this.f3953c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3952b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3953c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
