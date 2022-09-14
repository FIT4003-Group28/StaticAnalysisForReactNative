package com.android.billingclient.api;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private SkuDetails f5074a;

    /* renamed from: b  reason: collision with root package name */
    private String f5075b;

    /* renamed from: c  reason: collision with root package name */
    private String f5076c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5077d;

    /* renamed from: e  reason: collision with root package name */
    private int f5078e = 0;

    /* renamed from: f  reason: collision with root package name */
    private String f5079f;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private SkuDetails f5080a;

        /* renamed from: b  reason: collision with root package name */
        private String f5081b;

        /* renamed from: c  reason: collision with root package name */
        private String f5082c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5083d;

        /* renamed from: e  reason: collision with root package name */
        private int f5084e;

        /* renamed from: f  reason: collision with root package name */
        private String f5085f;

        private b() {
            this.f5084e = 0;
        }

        public b a(int i) {
            this.f5084e = i;
            return this;
        }

        public b a(SkuDetails skuDetails) {
            this.f5080a = skuDetails;
            return this;
        }

        public b a(String str) {
            this.f5082c = str;
            return this;
        }

        public g a() {
            g gVar = new g();
            gVar.f5074a = this.f5080a;
            gVar.f5075b = this.f5081b;
            gVar.f5076c = this.f5082c;
            gVar.f5077d = this.f5083d;
            gVar.f5078e = this.f5084e;
            gVar.f5079f = this.f5085f;
            return gVar;
        }

        public b b(String str) {
            this.f5085f = str;
            return this;
        }

        public b c(String str) {
            this.f5081b = str;
            return this;
        }
    }

    public static b j() {
        return new b();
    }

    public String a() {
        return this.f5076c;
    }

    public String b() {
        return this.f5079f;
    }

    public String c() {
        return this.f5075b;
    }

    public int d() {
        return this.f5078e;
    }

    public String e() {
        SkuDetails skuDetails = this.f5074a;
        if (skuDetails == null) {
            return null;
        }
        return skuDetails.l();
    }

    public SkuDetails f() {
        return this.f5074a;
    }

    public String g() {
        SkuDetails skuDetails = this.f5074a;
        if (skuDetails == null) {
            return null;
        }
        return skuDetails.p();
    }

    public boolean h() {
        return this.f5077d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return (!this.f5077d && this.f5076c == null && this.f5079f == null && this.f5078e == 0) ? false : true;
    }
}
