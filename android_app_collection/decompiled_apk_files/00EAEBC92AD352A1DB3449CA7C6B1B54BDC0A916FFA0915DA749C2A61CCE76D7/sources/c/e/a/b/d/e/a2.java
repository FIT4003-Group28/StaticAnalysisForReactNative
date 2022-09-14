package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<a2> CREATOR = new d2();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.auth.j f3858b;

    public a2(com.google.firebase.auth.j jVar) {
        this.f3858b = jVar;
    }

    public final com.google.firebase.auth.j f() {
        return this.f3858b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3858b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
