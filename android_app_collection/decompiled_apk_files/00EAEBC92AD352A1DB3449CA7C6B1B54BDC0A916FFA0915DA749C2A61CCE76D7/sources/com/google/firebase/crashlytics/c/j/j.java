package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class j extends v.d.AbstractC0171d {

    /* renamed from: a  reason: collision with root package name */
    private final long f8918a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8919b;

    /* renamed from: c  reason: collision with root package name */
    private final v.d.AbstractC0171d.a f8920c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.AbstractC0171d.c f8921d;

    /* renamed from: e  reason: collision with root package name */
    private final v.d.AbstractC0171d.AbstractC0182d f8922e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f8923a;

        /* renamed from: b  reason: collision with root package name */
        private String f8924b;

        /* renamed from: c  reason: collision with root package name */
        private v.d.AbstractC0171d.a f8925c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.AbstractC0171d.c f8926d;

        /* renamed from: e  reason: collision with root package name */
        private v.d.AbstractC0171d.AbstractC0182d f8927e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(v.d.AbstractC0171d abstractC0171d) {
            this.f8923a = Long.valueOf(abstractC0171d.d());
            this.f8924b = abstractC0171d.e();
            this.f8925c = abstractC0171d.a();
            this.f8926d = abstractC0171d.b();
            this.f8927e = abstractC0171d.c();
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d.b a(long j) {
            this.f8923a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d.b a(v.d.AbstractC0171d.a aVar) {
            if (aVar != null) {
                this.f8925c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d.b a(v.d.AbstractC0171d.c cVar) {
            if (cVar != null) {
                this.f8926d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d.b a(v.d.AbstractC0171d.AbstractC0182d abstractC0182d) {
            this.f8927e = abstractC0182d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d.b a(String str) {
            if (str != null) {
                this.f8924b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.b
        public v.d.AbstractC0171d a() {
            String str = "";
            if (this.f8923a == null) {
                str = str + " timestamp";
            }
            if (this.f8924b == null) {
                str = str + " type";
            }
            if (this.f8925c == null) {
                str = str + " app";
            }
            if (this.f8926d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new j(this.f8923a.longValue(), this.f8924b, this.f8925c, this.f8926d, this.f8927e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private j(long j, String str, v.d.AbstractC0171d.a aVar, v.d.AbstractC0171d.c cVar, v.d.AbstractC0171d.AbstractC0182d abstractC0182d) {
        this.f8918a = j;
        this.f8919b = str;
        this.f8920c = aVar;
        this.f8921d = cVar;
        this.f8922e = abstractC0182d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public v.d.AbstractC0171d.a a() {
        return this.f8920c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public v.d.AbstractC0171d.c b() {
        return this.f8921d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public v.d.AbstractC0171d.AbstractC0182d c() {
        return this.f8922e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public long d() {
        return this.f8918a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public String e() {
        return this.f8919b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d)) {
            return false;
        }
        v.d.AbstractC0171d abstractC0171d = (v.d.AbstractC0171d) obj;
        if (this.f8918a == abstractC0171d.d() && this.f8919b.equals(abstractC0171d.e()) && this.f8920c.equals(abstractC0171d.a()) && this.f8921d.equals(abstractC0171d.b())) {
            v.d.AbstractC0171d.AbstractC0182d abstractC0182d = this.f8922e;
            v.d.AbstractC0171d.AbstractC0182d c2 = abstractC0171d.c();
            if (abstractC0182d == null) {
                if (c2 == null) {
                    return true;
                }
            } else if (abstractC0182d.equals(c2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d
    public v.d.AbstractC0171d.b f() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.f8918a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f8919b.hashCode()) * 1000003) ^ this.f8920c.hashCode()) * 1000003) ^ this.f8921d.hashCode()) * 1000003;
        v.d.AbstractC0171d.AbstractC0182d abstractC0182d = this.f8922e;
        return (abstractC0182d == null ? 0 : abstractC0182d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f8918a + ", type=" + this.f8919b + ", app=" + this.f8920c + ", device=" + this.f8921d + ", log=" + this.f8922e + "}";
    }
}
