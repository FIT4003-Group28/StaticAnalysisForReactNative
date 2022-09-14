package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class b extends v {

    /* renamed from: b  reason: collision with root package name */
    private final String f8848b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8849c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8850d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8851e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8852f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8853g;

    /* renamed from: h  reason: collision with root package name */
    private final v.d f8854h;
    private final v.c i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.c.j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0169b extends v.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8855a;

        /* renamed from: b  reason: collision with root package name */
        private String f8856b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f8857c;

        /* renamed from: d  reason: collision with root package name */
        private String f8858d;

        /* renamed from: e  reason: collision with root package name */
        private String f8859e;

        /* renamed from: f  reason: collision with root package name */
        private String f8860f;

        /* renamed from: g  reason: collision with root package name */
        private v.d f8861g;

        /* renamed from: h  reason: collision with root package name */
        private v.c f8862h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0169b() {
        }

        private C0169b(v vVar) {
            this.f8855a = vVar.g();
            this.f8856b = vVar.c();
            this.f8857c = Integer.valueOf(vVar.f());
            this.f8858d = vVar.d();
            this.f8859e = vVar.a();
            this.f8860f = vVar.b();
            this.f8861g = vVar.h();
            this.f8862h = vVar.e();
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a a(int i) {
            this.f8857c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a a(v.c cVar) {
            this.f8862h = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a a(v.d dVar) {
            this.f8861g = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a a(String str) {
            if (str != null) {
                this.f8859e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v a() {
            String str = "";
            if (this.f8855a == null) {
                str = str + " sdkVersion";
            }
            if (this.f8856b == null) {
                str = str + " gmpAppId";
            }
            if (this.f8857c == null) {
                str = str + " platform";
            }
            if (this.f8858d == null) {
                str = str + " installationUuid";
            }
            if (this.f8859e == null) {
                str = str + " buildVersion";
            }
            if (this.f8860f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f8855a, this.f8856b, this.f8857c.intValue(), this.f8858d, this.f8859e, this.f8860f, this.f8861g, this.f8862h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a b(String str) {
            if (str != null) {
                this.f8860f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a c(String str) {
            if (str != null) {
                this.f8856b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a d(String str) {
            if (str != null) {
                this.f8858d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.a
        public v.a e(String str) {
            if (str != null) {
                this.f8855a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }
    }

    private b(String str, String str2, int i, String str3, String str4, String str5, v.d dVar, v.c cVar) {
        this.f8848b = str;
        this.f8849c = str2;
        this.f8850d = i;
        this.f8851e = str3;
        this.f8852f = str4;
        this.f8853g = str5;
        this.f8854h = dVar;
        this.i = cVar;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public String a() {
        return this.f8852f;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public String b() {
        return this.f8853g;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public String c() {
        return this.f8849c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public String d() {
        return this.f8851e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public v.c e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        v.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f8848b.equals(vVar.g()) && this.f8849c.equals(vVar.c()) && this.f8850d == vVar.f() && this.f8851e.equals(vVar.d()) && this.f8852f.equals(vVar.a()) && this.f8853g.equals(vVar.b()) && ((dVar = this.f8854h) != null ? dVar.equals(vVar.h()) : vVar.h() == null)) {
            v.c cVar = this.i;
            v.c e2 = vVar.e();
            if (cVar == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (cVar.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public int f() {
        return this.f8850d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public String g() {
        return this.f8848b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    public v.d h() {
        return this.f8854h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f8848b.hashCode() ^ 1000003) * 1000003) ^ this.f8849c.hashCode()) * 1000003) ^ this.f8850d) * 1000003) ^ this.f8851e.hashCode()) * 1000003) ^ this.f8852f.hashCode()) * 1000003) ^ this.f8853g.hashCode()) * 1000003;
        v.d dVar = this.f8854h;
        int i = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v.c cVar = this.i;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v
    protected v.a j() {
        return new C0169b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8848b + ", gmpAppId=" + this.f8849c + ", platform=" + this.f8850d + ", installationUuid=" + this.f8851e + ", buildVersion=" + this.f8852f + ", displayVersion=" + this.f8853g + ", session=" + this.f8854h + ", ndkPayload=" + this.i + "}";
    }
}
