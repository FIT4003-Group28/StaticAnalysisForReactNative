package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class w1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<w1> CREATOR = new z1();

    /* renamed from: b  reason: collision with root package name */
    private final String f4009b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4010c;

    public w1(String str, String str2) {
        this.f4009b = str;
        this.f4010c = str2;
    }

    public final String f() {
        return this.f4009b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4009b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4010c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
