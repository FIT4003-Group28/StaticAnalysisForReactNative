package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class j2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<j2> CREATOR = new m2();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.auth.u0 f3931b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3932c;

    public j2(com.google.firebase.auth.u0 u0Var, String str) {
        this.f3931b = u0Var;
        this.f3932c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3931b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3932c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
