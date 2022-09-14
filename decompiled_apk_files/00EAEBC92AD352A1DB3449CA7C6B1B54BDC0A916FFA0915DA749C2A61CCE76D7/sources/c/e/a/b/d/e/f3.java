package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class f3 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.v0.a.c2<f3, Object> {
    public static final Parcelable.Creator<f3> CREATOR = new g3();

    /* renamed from: b  reason: collision with root package name */
    private String f3904b;

    /* renamed from: c  reason: collision with root package name */
    private String f3905c;

    /* renamed from: d  reason: collision with root package name */
    private String f3906d;

    /* renamed from: e  reason: collision with root package name */
    private a3 f3907e;

    public f3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(String str, String str2, String str3, a3 a3Var) {
        this.f3904b = str;
        this.f3905c = str2;
        this.f3906d = str3;
        this.f3907e = a3Var;
    }

    public final a3 g() {
        return this.f3907e;
    }

    public final String j() {
        return this.f3904b;
    }

    public final String k() {
        return this.f3906d;
    }

    public final String q() {
        return this.f3905c;
    }

    public final boolean r() {
        return this.f3904b != null;
    }

    public final boolean s() {
        return this.f3905c != null;
    }

    public final boolean t() {
        return this.f3906d != null;
    }

    public final boolean u() {
        return this.f3907e != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3904b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3905c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3906d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, (Parcelable) this.f3907e, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
