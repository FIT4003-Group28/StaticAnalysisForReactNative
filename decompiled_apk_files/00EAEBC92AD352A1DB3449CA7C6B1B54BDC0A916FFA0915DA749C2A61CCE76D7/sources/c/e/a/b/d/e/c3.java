package c.e.a.b.d.e;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class c3 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<c3> CREATOR = new b3();

    /* renamed from: b  reason: collision with root package name */
    private String f3876b;

    /* renamed from: c  reason: collision with root package name */
    private String f3877c;

    /* renamed from: d  reason: collision with root package name */
    private String f3878d;

    /* renamed from: e  reason: collision with root package name */
    private String f3879e;

    /* renamed from: f  reason: collision with root package name */
    private String f3880f;

    /* renamed from: g  reason: collision with root package name */
    private String f3881g;

    /* renamed from: h  reason: collision with root package name */
    private String f3882h;

    public c3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f3876b = str;
        this.f3877c = str2;
        this.f3878d = str3;
        this.f3879e = str4;
        this.f3880f = str5;
        this.f3881g = str6;
        this.f3882h = str7;
    }

    public final String f() {
        return this.f3876b;
    }

    public final String g() {
        return this.f3881g;
    }

    public final String j() {
        return this.f3877c;
    }

    public final String k() {
        return this.f3879e;
    }

    public final Uri q() {
        if (!TextUtils.isEmpty(this.f3878d)) {
            return Uri.parse(this.f3878d);
        }
        return null;
    }

    public final String r() {
        return this.f3880f;
    }

    public final String s() {
        return this.f3882h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3876b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3877c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3878d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f3879e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f3880f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f3881g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.f3882h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
