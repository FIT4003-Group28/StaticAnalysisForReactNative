package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class f1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<f1> CREATOR = new i1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3901b;

    /* renamed from: c  reason: collision with root package name */
    private final k3 f3902c;

    public f1(String str, k3 k3Var) {
        this.f3901b = str;
        this.f3902c = k3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3901b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f3902c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
