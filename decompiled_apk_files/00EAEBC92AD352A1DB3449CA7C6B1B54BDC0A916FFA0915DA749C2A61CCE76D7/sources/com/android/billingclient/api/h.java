package com.android.billingclient.api;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private int f5086a;

    /* renamed from: b  reason: collision with root package name */
    private String f5087b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f5088a;

        /* renamed from: b  reason: collision with root package name */
        private String f5089b;

        private b() {
        }

        public b a(int i) {
            this.f5088a = i;
            return this;
        }

        public b a(String str) {
            this.f5089b = str;
            return this;
        }

        public h a() {
            h hVar = new h();
            hVar.f5086a = this.f5088a;
            hVar.f5087b = this.f5089b;
            return hVar;
        }
    }

    public static b c() {
        return new b();
    }

    public String a() {
        return this.f5087b;
    }

    public int b() {
        return this.f5086a;
    }
}
