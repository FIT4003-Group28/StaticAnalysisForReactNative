package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class j1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<j1> CREATOR = new n1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3930b;

    public j1(String str) {
        this.f3930b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3930b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
