package com.android.billingclient.api;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f4990a;

    /* renamed from: b  reason: collision with root package name */
    private String f4991b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f4992a;

        /* renamed from: b  reason: collision with root package name */
        private String f4993b;

        private b() {
        }

        public b a(String str) {
            this.f4992a = str;
            return this;
        }

        public a a() {
            a aVar = new a();
            aVar.f4990a = this.f4992a;
            aVar.f4991b = this.f4993b;
            return aVar;
        }

        public b b(String str) {
            this.f4993b = str;
            return this;
        }
    }

    private a() {
    }

    public static b c() {
        return new b();
    }

    public String a() {
        return this.f4990a;
    }

    public String b() {
        return this.f4991b;
    }
}
