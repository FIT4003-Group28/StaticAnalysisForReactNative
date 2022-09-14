package com.android.billingclient.api;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private String f5098a;

    /* renamed from: b  reason: collision with root package name */
    private String f5099b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f5100a;

        /* renamed from: b  reason: collision with root package name */
        private String f5101b;

        private b() {
        }

        public b a(String str) {
            this.f5100a = str;
            return this;
        }

        public j a() {
            j jVar = new j();
            jVar.f5098a = this.f5101b;
            jVar.f5099b = this.f5100a;
            return jVar;
        }

        public b b(String str) {
            this.f5101b = str;
            return this;
        }
    }

    private j() {
    }

    public static b c() {
        return new b();
    }

    public String a() {
        return this.f5099b;
    }

    public String b() {
        return this.f5098a;
    }
}
