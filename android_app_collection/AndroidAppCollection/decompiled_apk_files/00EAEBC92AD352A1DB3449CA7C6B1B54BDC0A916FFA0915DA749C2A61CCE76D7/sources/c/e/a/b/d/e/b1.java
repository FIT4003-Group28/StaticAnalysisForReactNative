package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<b1> CREATOR = new e1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3867b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3868c;

    public b1(String str, String str2) {
        this.f3867b = str;
        this.f3868c = str2;
    }

    public final String f() {
        return this.f3867b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3867b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3868c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
