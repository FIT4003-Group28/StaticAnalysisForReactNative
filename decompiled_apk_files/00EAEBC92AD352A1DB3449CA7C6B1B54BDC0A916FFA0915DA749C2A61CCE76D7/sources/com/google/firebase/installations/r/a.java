package com.google.firebase.installations.r;

import com.google.firebase.installations.r.d;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f9394a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9395b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9396c;

    /* renamed from: d  reason: collision with root package name */
    private final e f9397d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f9398e;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f9399a;

        /* renamed from: b  reason: collision with root package name */
        private String f9400b;

        /* renamed from: c  reason: collision with root package name */
        private String f9401c;

        /* renamed from: d  reason: collision with root package name */
        private e f9402d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f9403e;

        @Override // com.google.firebase.installations.r.d.a
        public d.a a(d.b bVar) {
            this.f9403e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a a(e eVar) {
            this.f9402d = eVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a a(String str) {
            this.f9400b = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d a() {
            return new a(this.f9399a, this.f9400b, this.f9401c, this.f9402d, this.f9403e);
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a b(String str) {
            this.f9401c = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a c(String str) {
            this.f9399a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.f9394a = str;
        this.f9395b = str2;
        this.f9396c = str3;
        this.f9397d = eVar;
        this.f9398e = bVar;
    }

    @Override // com.google.firebase.installations.r.d
    public e a() {
        return this.f9397d;
    }

    @Override // com.google.firebase.installations.r.d
    public String b() {
        return this.f9395b;
    }

    @Override // com.google.firebase.installations.r.d
    public String c() {
        return this.f9396c;
    }

    @Override // com.google.firebase.installations.r.d
    public d.b d() {
        return this.f9398e;
    }

    @Override // com.google.firebase.installations.r.d
    public String e() {
        return this.f9394a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f9394a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f9395b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f9396c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    e eVar = this.f9397d;
                    if (eVar != null ? eVar.equals(dVar.a()) : dVar.a() == null) {
                        d.b bVar = this.f9398e;
                        d.b d2 = dVar.d();
                        if (bVar == null) {
                            if (d2 == null) {
                                return true;
                            }
                        } else if (bVar.equals(d2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9394a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9395b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9396c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.f9397d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.f9398e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f9394a + ", fid=" + this.f9395b + ", refreshToken=" + this.f9396c + ", authToken=" + this.f9397d + ", responseCode=" + this.f9398e + "}";
    }
}
