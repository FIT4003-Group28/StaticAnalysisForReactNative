package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class h2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<h2> CREATOR = new k2();

    /* renamed from: b  reason: collision with root package name */
    private final String f3918b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3919c;

    public h2(String str, String str2) {
        this.f3918b = str;
        this.f3919c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3918b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3919c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
