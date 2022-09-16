package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<x0> CREATOR = new z0();

    /* renamed from: b  reason: collision with root package name */
    private final String f4013b;

    public x0(String str) {
        this.f4013b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f4013b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
