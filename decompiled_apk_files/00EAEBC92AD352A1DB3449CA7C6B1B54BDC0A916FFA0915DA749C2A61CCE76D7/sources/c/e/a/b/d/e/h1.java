package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class h1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<h1> CREATOR = new k1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3916b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.auth.m0 f3917c;

    public h1(String str, com.google.firebase.auth.m0 m0Var) {
        this.f3916b = str;
        this.f3917c = m0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3916b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f3917c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
