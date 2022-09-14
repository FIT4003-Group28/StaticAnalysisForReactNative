package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<a1> CREATOR = new c1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3857b;

    public a1(String str) {
        this.f3857b = str;
    }

    public final String f() {
        return this.f3857b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3857b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
