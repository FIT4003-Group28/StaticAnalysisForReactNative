package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class l2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<l2> CREATOR = new o2();

    /* renamed from: b  reason: collision with root package name */
    private final String f3947b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3948c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.auth.e f3949d;

    public l2(String str, String str2, com.google.firebase.auth.e eVar) {
        this.f3947b = str;
        this.f3948c = str2;
        this.f3949d = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3947b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3948c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f3949d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
