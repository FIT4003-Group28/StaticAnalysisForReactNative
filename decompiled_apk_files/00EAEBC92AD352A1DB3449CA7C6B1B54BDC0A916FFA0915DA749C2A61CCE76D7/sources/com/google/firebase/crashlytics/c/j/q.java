package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class q extends v.d.AbstractC0171d.a.b.e.AbstractC0180b {

    /* renamed from: a  reason: collision with root package name */
    private final long f8974a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8975b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8976c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8977d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8978e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a {

        /* renamed from: a  reason: collision with root package name */
        private Long f8979a;

        /* renamed from: b  reason: collision with root package name */
        private String f8980b;

        /* renamed from: c  reason: collision with root package name */
        private String f8981c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8982d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f8983e;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a a(int i) {
            this.f8983e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a a(long j) {
            this.f8982d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a a(String str) {
            this.f8981c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b a() {
            String str = "";
            if (this.f8979a == null) {
                str = str + " pc";
            }
            if (this.f8980b == null) {
                str = str + " symbol";
            }
            if (this.f8982d == null) {
                str = str + " offset";
            }
            if (this.f8983e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new q(this.f8979a.longValue(), this.f8980b, this.f8981c, this.f8982d.longValue(), this.f8983e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a b(long j) {
            this.f8979a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a
        public v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a b(String str) {
            if (str != null) {
                this.f8980b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    private q(long j, String str, String str2, long j2, int i) {
        this.f8974a = j;
        this.f8975b = str;
        this.f8976c = str2;
        this.f8977d = j2;
        this.f8978e = i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b
    public String a() {
        return this.f8976c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b
    public int b() {
        return this.f8978e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b
    public long c() {
        return this.f8977d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b
    public long d() {
        return this.f8974a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0180b
    public String e() {
        return this.f8975b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b.e.AbstractC0180b)) {
            return false;
        }
        v.d.AbstractC0171d.a.b.e.AbstractC0180b abstractC0180b = (v.d.AbstractC0171d.a.b.e.AbstractC0180b) obj;
        return this.f8974a == abstractC0180b.d() && this.f8975b.equals(abstractC0180b.e()) && ((str = this.f8976c) != null ? str.equals(abstractC0180b.a()) : abstractC0180b.a() == null) && this.f8977d == abstractC0180b.c() && this.f8978e == abstractC0180b.b();
    }

    public int hashCode() {
        long j = this.f8974a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f8975b.hashCode()) * 1000003;
        String str = this.f8976c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f8977d;
        return this.f8978e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f8974a + ", symbol=" + this.f8975b + ", file=" + this.f8976c + ", offset=" + this.f8977d + ", importance=" + this.f8978e + "}";
    }
}
