package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class u1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<u1> CREATOR = new x1();

    /* renamed from: b  reason: collision with root package name */
    private final k3 f3996b;

    public u1(k3 k3Var) {
        this.f3996b = k3Var;
    }

    public final k3 f() {
        return this.f3996b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3996b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
