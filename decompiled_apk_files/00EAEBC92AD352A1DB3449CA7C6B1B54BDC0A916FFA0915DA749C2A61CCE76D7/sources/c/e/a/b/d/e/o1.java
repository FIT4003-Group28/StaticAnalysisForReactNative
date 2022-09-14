package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o1 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<o1> CREATOR = new r1();

    /* renamed from: b  reason: collision with root package name */
    private final String f3959b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.auth.e f3960c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3961d;

    public o1(String str, com.google.firebase.auth.e eVar, String str2) {
        this.f3959b = str;
        this.f3960c = eVar;
        this.f3961d = str2;
    }

    public final String f() {
        return this.f3959b;
    }

    public final com.google.firebase.auth.e j() {
        return this.f3960c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3959b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f3960c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3961d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
