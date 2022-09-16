package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class s2 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.v0.a.c2<s2, Object> {
    public static final Parcelable.Creator<s2> CREATOR = new t2();

    /* renamed from: b  reason: collision with root package name */
    private String f3986b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3987c;

    /* renamed from: d  reason: collision with root package name */
    private String f3988d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3989e;

    /* renamed from: f  reason: collision with root package name */
    private j3 f3990f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f3991g;

    public s2() {
        this.f3990f = j3.j();
    }

    public s2(String str, boolean z, String str2, boolean z2, j3 j3Var, List<String> list) {
        this.f3986b = str;
        this.f3987c = z;
        this.f3988d = str2;
        this.f3989e = z2;
        this.f3990f = j3Var == null ? j3.j() : j3.a(j3Var);
        this.f3991g = list;
    }

    public final List<String> j() {
        return this.f3991g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3986b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3987c);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3988d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f3989e);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, (Parcelable) this.f3990f, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f3991g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
