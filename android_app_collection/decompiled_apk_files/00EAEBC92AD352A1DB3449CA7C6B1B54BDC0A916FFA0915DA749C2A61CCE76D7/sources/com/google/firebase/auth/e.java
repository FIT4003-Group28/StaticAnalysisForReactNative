package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.o3;
/* loaded from: classes.dex */
public class e extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<e> CREATOR = new z0();

    /* renamed from: b  reason: collision with root package name */
    private final String f8308b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8309c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8310d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8311e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8312f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8313g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8314h;
    private String i;
    private int j;
    private String k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f8315a;

        /* renamed from: b  reason: collision with root package name */
        private String f8316b;

        /* renamed from: c  reason: collision with root package name */
        private String f8317c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8318d;

        /* renamed from: e  reason: collision with root package name */
        private String f8319e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8320f;

        /* renamed from: g  reason: collision with root package name */
        private String f8321g;

        private a() {
            this.f8320f = false;
        }

        public a a(String str) {
            this.f8321g = str;
            return this;
        }

        public a a(String str, boolean z, String str2) {
            this.f8317c = str;
            this.f8318d = z;
            this.f8319e = str2;
            return this;
        }

        public a a(boolean z) {
            this.f8320f = z;
            return this;
        }

        public e a() {
            if (this.f8315a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str) {
            this.f8316b = str;
            return this;
        }

        public a c(String str) {
            this.f8315a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f8308b = aVar.f8315a;
        this.f8309c = aVar.f8316b;
        this.f8310d = null;
        this.f8311e = aVar.f8317c;
        this.f8312f = aVar.f8318d;
        this.f8313g = aVar.f8319e;
        this.f8314h = aVar.f8320f;
        this.k = aVar.f8321g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f8308b = str;
        this.f8309c = str2;
        this.f8310d = str3;
        this.f8311e = str4;
        this.f8312f = z;
        this.f8313g = str5;
        this.f8314h = z2;
        this.i = str6;
        this.j = i;
        this.k = str7;
    }

    public static e f() {
        return new e(new a());
    }

    public static a x() {
        return new a();
    }

    public final void a(o3 o3Var) {
        this.j = o3Var.a();
    }

    public final void a(String str) {
        this.i = str;
    }

    public boolean q() {
        return this.f8314h;
    }

    public boolean r() {
        return this.f8312f;
    }

    public String s() {
        return this.f8313g;
    }

    public String t() {
        return this.f8311e;
    }

    public String u() {
        return this.f8309c;
    }

    public String v() {
        return this.f8308b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, v(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, u(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8310d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, t(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, r());
        com.google.android.gms.common.internal.x.c.a(parcel, 6, s(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, q());
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, this.j);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.k, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
