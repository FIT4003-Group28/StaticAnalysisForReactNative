package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class i extends v.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f8902a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8903b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8904c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8905d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8906e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8907f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8908g;

    /* renamed from: h  reason: collision with root package name */
    private final String f8909h;
    private final String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f8910a;

        /* renamed from: b  reason: collision with root package name */
        private String f8911b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f8912c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8913d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8914e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f8915f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f8916g;

        /* renamed from: h  reason: collision with root package name */
        private String f8917h;
        private String i;

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a a(int i) {
            this.f8910a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a a(long j) {
            this.f8914e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a a(String str) {
            if (str != null) {
                this.f8917h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a a(boolean z) {
            this.f8915f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c a() {
            String str = "";
            if (this.f8910a == null) {
                str = str + " arch";
            }
            if (this.f8911b == null) {
                str = str + " model";
            }
            if (this.f8912c == null) {
                str = str + " cores";
            }
            if (this.f8913d == null) {
                str = str + " ram";
            }
            if (this.f8914e == null) {
                str = str + " diskSpace";
            }
            if (this.f8915f == null) {
                str = str + " simulator";
            }
            if (this.f8916g == null) {
                str = str + " state";
            }
            if (this.f8917h == null) {
                str = str + " manufacturer";
            }
            if (this.i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new i(this.f8910a.intValue(), this.f8911b, this.f8912c.intValue(), this.f8913d.longValue(), this.f8914e.longValue(), this.f8915f.booleanValue(), this.f8916g.intValue(), this.f8917h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a b(int i) {
            this.f8912c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a b(long j) {
            this.f8913d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a b(String str) {
            if (str != null) {
                this.f8911b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a c(int i) {
            this.f8916g = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.c.a
        public v.d.c.a c(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }
    }

    private i(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f8902a = i;
        this.f8903b = str;
        this.f8904c = i2;
        this.f8905d = j;
        this.f8906e = j2;
        this.f8907f = z;
        this.f8908g = i3;
        this.f8909h = str2;
        this.i = str3;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public int a() {
        return this.f8902a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public int b() {
        return this.f8904c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public long c() {
        return this.f8906e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public String d() {
        return this.f8909h;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public String e() {
        return this.f8903b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.c)) {
            return false;
        }
        v.d.c cVar = (v.d.c) obj;
        return this.f8902a == cVar.a() && this.f8903b.equals(cVar.e()) && this.f8904c == cVar.b() && this.f8905d == cVar.g() && this.f8906e == cVar.c() && this.f8907f == cVar.i() && this.f8908g == cVar.h() && this.f8909h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public String f() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public long g() {
        return this.f8905d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public int h() {
        return this.f8908g;
    }

    public int hashCode() {
        long j = this.f8905d;
        long j2 = this.f8906e;
        return ((((((((((((((((this.f8902a ^ 1000003) * 1000003) ^ this.f8903b.hashCode()) * 1000003) ^ this.f8904c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f8907f ? 1231 : 1237)) * 1000003) ^ this.f8908g) * 1000003) ^ this.f8909h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.c
    public boolean i() {
        return this.f8907f;
    }

    public String toString() {
        return "Device{arch=" + this.f8902a + ", model=" + this.f8903b + ", cores=" + this.f8904c + ", ram=" + this.f8905d + ", diskSpace=" + this.f8906e + ", simulator=" + this.f8907f + ", state=" + this.f8908g + ", manufacturer=" + this.f8909h + ", modelClass=" + this.i + "}";
    }
}
