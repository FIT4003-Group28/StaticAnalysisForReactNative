package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class m0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<m0> CREATOR = new o0();

    /* renamed from: b  reason: collision with root package name */
    private final String f3950b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3951c;

    public m0(String str, String str2) {
        this.f3950b = str;
        this.f3951c = str2;
    }

    public final String f() {
        return this.f3950b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3950b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3951c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
