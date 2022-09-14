package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<d1> CREATOR = new g1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3884b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3885c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3886d;

    public d1(String str, String str2, String str3) {
        this.f3884b = str;
        this.f3885c = str2;
        this.f3886d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3884b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3885c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3886d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
