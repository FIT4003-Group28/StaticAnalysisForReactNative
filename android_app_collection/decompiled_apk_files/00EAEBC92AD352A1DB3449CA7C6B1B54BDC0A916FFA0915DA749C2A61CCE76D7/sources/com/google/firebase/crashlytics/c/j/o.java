package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class o extends v.d.AbstractC0171d.a.b.AbstractC0177d {

    /* renamed from: a  reason: collision with root package name */
    private final String f8962a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8963b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8964c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a {

        /* renamed from: a  reason: collision with root package name */
        private String f8965a;

        /* renamed from: b  reason: collision with root package name */
        private String f8966b;

        /* renamed from: c  reason: collision with root package name */
        private Long f8967c;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a
        public v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a a(long j) {
            this.f8967c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a
        public v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a a(String str) {
            if (str != null) {
                this.f8966b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a
        public v.d.AbstractC0171d.a.b.AbstractC0177d a() {
            String str = "";
            if (this.f8965a == null) {
                str = str + " name";
            }
            if (this.f8966b == null) {
                str = str + " code";
            }
            if (this.f8967c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new o(this.f8965a, this.f8966b, this.f8967c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a
        public v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a b(String str) {
            if (str != null) {
                this.f8965a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private o(String str, String str2, long j) {
        this.f8962a = str;
        this.f8963b = str2;
        this.f8964c = j;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d
    public long a() {
        return this.f8964c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d
    public String b() {
        return this.f8963b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0177d
    public String c() {
        return this.f8962a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b.AbstractC0177d)) {
            return false;
        }
        v.d.AbstractC0171d.a.b.AbstractC0177d abstractC0177d = (v.d.AbstractC0171d.a.b.AbstractC0177d) obj;
        return this.f8962a.equals(abstractC0177d.c()) && this.f8963b.equals(abstractC0177d.b()) && this.f8964c == abstractC0177d.a();
    }

    public int hashCode() {
        long j = this.f8964c;
        return ((((this.f8962a.hashCode() ^ 1000003) * 1000003) ^ this.f8963b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f8962a + ", code=" + this.f8963b + ", address=" + this.f8964c + "}";
    }
}
