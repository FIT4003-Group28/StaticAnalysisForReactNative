package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<c2> CREATOR = new e2();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.auth.m0 f3874b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3875c;

    public c2(com.google.firebase.auth.m0 m0Var, String str) {
        this.f3874b = m0Var;
        this.f3875c = str;
    }

    public final com.google.firebase.auth.m0 f() {
        return this.f3874b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3874b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3875c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
