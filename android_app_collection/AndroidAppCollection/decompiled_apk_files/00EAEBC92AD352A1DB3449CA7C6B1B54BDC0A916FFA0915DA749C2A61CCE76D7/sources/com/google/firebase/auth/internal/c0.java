package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* loaded from: classes.dex */
public final class c0 implements com.google.firebase.auth.g {
    public static final Parcelable.Creator<c0> CREATOR = new f0();

    /* renamed from: b  reason: collision with root package name */
    private final String f8336b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8337c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f8338d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8339e;

    public c0(String str, String str2, boolean z) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        this.f8336b = str;
        this.f8337c = str2;
        this.f8338d = m.b(str2);
        this.f8339e = z;
    }

    public c0(boolean z) {
        this.f8339e = z;
        this.f8337c = null;
        this.f8336b = null;
        this.f8338d = null;
    }

    @Override // com.google.firebase.auth.g
    public final String a() {
        return this.f8336b;
    }

    @Override // com.google.firebase.auth.g
    public final boolean c() {
        return this.f8339e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.g
    public final Map<String, Object> getProfile() {
        return this.f8338d;
    }

    @Override // com.google.firebase.auth.g
    public final String getUsername() {
        Map<String, Object> map;
        String str;
        if ("github.com".equals(this.f8336b)) {
            map = this.f8338d;
            str = "login";
        } else if (!"twitter.com".equals(this.f8336b)) {
            return null;
        } else {
            map = this.f8338d;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, a(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f8337c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, c());
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
