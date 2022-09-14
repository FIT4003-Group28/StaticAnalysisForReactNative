package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class p2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<p2> CREATOR = new r2();

    /* renamed from: b  reason: collision with root package name */
    private String f3973b;

    /* renamed from: c  reason: collision with root package name */
    private List<a3> f3974c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.firebase.auth.a1 f3975d;

    public p2(String str, List<a3> list, com.google.firebase.auth.a1 a1Var) {
        this.f3973b = str;
        this.f3974c = list;
        this.f3975d = a1Var;
    }

    public final String f() {
        return this.f3973b;
    }

    public final com.google.firebase.auth.a1 j() {
        return this.f3975d;
    }

    public final List<com.google.firebase.auth.h0> q() {
        return com.google.firebase.auth.internal.p.a(this.f3974c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3973b, false);
        com.google.android.gms.common.internal.x.c.b(parcel, 2, this.f3974c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f3975d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
