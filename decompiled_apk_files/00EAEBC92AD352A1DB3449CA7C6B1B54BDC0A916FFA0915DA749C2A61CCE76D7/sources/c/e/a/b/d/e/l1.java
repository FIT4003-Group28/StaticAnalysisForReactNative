package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class l1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<l1> CREATOR = new p1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3945b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.auth.e f3946c;

    public l1(String str, com.google.firebase.auth.e eVar) {
        this.f3945b = str;
        this.f3946c = eVar;
    }

    public final String f() {
        return this.f3945b;
    }

    public final com.google.firebase.auth.e j() {
        return this.f3946c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3945b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f3946c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
