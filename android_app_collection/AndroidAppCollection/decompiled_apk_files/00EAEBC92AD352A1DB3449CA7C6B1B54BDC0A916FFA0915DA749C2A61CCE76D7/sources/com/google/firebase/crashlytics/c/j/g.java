package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class g extends v.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8891a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8892b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8893c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.a.b f8894d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8895e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.a.AbstractC0170a {

        /* renamed from: a  reason: collision with root package name */
        private String f8896a;

        /* renamed from: b  reason: collision with root package name */
        private String f8897b;

        /* renamed from: c  reason: collision with root package name */
        private String f8898c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.a.b f8899d;

        /* renamed from: e  reason: collision with root package name */
        private String f8900e;

        @Override // com.google.firebase.crashlytics.c.j.v.d.a.AbstractC0170a
        public v.d.a.AbstractC0170a a(String str) {
            this.f8898c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.a.AbstractC0170a
        public v.d.a a() {
            String str = "";
            if (this.f8896a == null) {
                str = str + " identifier";
            }
            if (this.f8897b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new g(this.f8896a, this.f8897b, this.f8898c, this.f8899d, this.f8900e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.a.AbstractC0170a
        public v.d.a.AbstractC0170a b(String str) {
            if (str != null) {
                this.f8896a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.a.AbstractC0170a
        public v.d.a.AbstractC0170a c(String str) {
            this.f8900e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.a.AbstractC0170a
        public v.d.a.AbstractC0170a d(String str) {
            if (str != null) {
                this.f8897b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private g(String str, String str2, String str3, v.d.a.b bVar, String str4) {
        this.f8891a = str;
        this.f8892b = str2;
        this.f8893c = str3;
        this.f8894d = bVar;
        this.f8895e = str4;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.a
    public String a() {
        return this.f8893c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.a
    public String b() {
        return this.f8891a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.a
    public String c() {
        return this.f8895e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.a
    public v.d.a.b d() {
        return this.f8894d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.a
    public String e() {
        return this.f8892b;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.a.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a)) {
            return false;
        }
        v.d.a aVar = (v.d.a) obj;
        if (this.f8891a.equals(aVar.b()) && this.f8892b.equals(aVar.e()) && ((str = this.f8893c) != null ? str.equals(aVar.a()) : aVar.a() == null) && ((bVar = this.f8894d) != null ? bVar.equals(aVar.d()) : aVar.d() == null)) {
            String str2 = this.f8895e;
            String c2 = aVar.c();
            if (str2 == null) {
                if (c2 == null) {
                    return true;
                }
            } else if (str2.equals(c2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f8891a.hashCode() ^ 1000003) * 1000003) ^ this.f8892b.hashCode()) * 1000003;
        String str = this.f8893c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        v.d.a.b bVar = this.f8894d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f8895e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f8891a + ", version=" + this.f8892b + ", displayVersion=" + this.f8893c + ", organization=" + this.f8894d + ", installationUuid=" + this.f8895e + "}";
    }
}
