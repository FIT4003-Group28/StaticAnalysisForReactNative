package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class q1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<q1> CREATOR = new s1();

    /* renamed from: b  reason: collision with root package name */
    private final i3 f3976b;

    public q1(i3 i3Var) {
        this.f3976b = i3Var;
    }

    public final i3 f() {
        return this.f3976b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3976b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
