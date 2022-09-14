package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class n2 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<n2> CREATOR = new q2();

    /* renamed from: b  reason: collision with root package name */
    private final Status f3954b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.auth.a1 f3955c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3956d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3957e;

    public n2(Status status, com.google.firebase.auth.a1 a1Var, String str, String str2) {
        this.f3954b = status;
        this.f3955c = a1Var;
        this.f3956d = str;
        this.f3957e = str2;
    }

    public final Status f() {
        return this.f3954b;
    }

    public final com.google.firebase.auth.a1 j() {
        return this.f3955c;
    }

    public final String k() {
        return this.f3957e;
    }

    public final String q() {
        return this.f3956d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) this.f3954b, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f3955c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3956d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3957e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
