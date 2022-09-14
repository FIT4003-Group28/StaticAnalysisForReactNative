package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class r extends v.d.AbstractC0171d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f8984a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8985b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8986c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8987d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8988e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8989f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f8990a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8991b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f8992c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f8993d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8994e;

        /* renamed from: f  reason: collision with root package name */
        private Long f8995f;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a a(int i) {
            this.f8991b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a a(long j) {
            this.f8995f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a a(Double d2) {
            this.f8990a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a a(boolean z) {
            this.f8992c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c a() {
            String str = "";
            if (this.f8991b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f8992c == null) {
                str = str + " proximityOn";
            }
            if (this.f8993d == null) {
                str = str + " orientation";
            }
            if (this.f8994e == null) {
                str = str + " ramUsed";
            }
            if (this.f8995f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new r(this.f8990a, this.f8991b.intValue(), this.f8992c.booleanValue(), this.f8993d.intValue(), this.f8994e.longValue(), this.f8995f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a b(int i) {
            this.f8993d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c.a
        public v.d.AbstractC0171d.c.a b(long j) {
            this.f8994e = Long.valueOf(j);
            return this;
        }
    }

    private r(Double d2, int i, boolean z, int i2, long j, long j2) {
        this.f8984a = d2;
        this.f8985b = i;
        this.f8986c = z;
        this.f8987d = i2;
        this.f8988e = j;
        this.f8989f = j2;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public Double a() {
        return this.f8984a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public int b() {
        return this.f8985b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public long c() {
        return this.f8989f;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public int d() {
        return this.f8987d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public long e() {
        return this.f8988e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.c)) {
            return false;
        }
        v.d.AbstractC0171d.c cVar = (v.d.AbstractC0171d.c) obj;
        Double d2 = this.f8984a;
        if (d2 != null ? d2.equals(cVar.a()) : cVar.a() == null) {
            if (this.f8985b == cVar.b() && this.f8986c == cVar.f() && this.f8987d == cVar.d() && this.f8988e == cVar.e() && this.f8989f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.c
    public boolean f() {
        return this.f8986c;
    }

    public int hashCode() {
        Double d2 = this.f8984a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f8985b) * 1000003;
        int i = this.f8986c ? 1231 : 1237;
        long j = this.f8988e;
        long j2 = this.f8989f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f8987d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f8984a + ", batteryVelocity=" + this.f8985b + ", proximityOn=" + this.f8986c + ", orientation=" + this.f8987d + ", ramUsed=" + this.f8988e + ", diskUsed=" + this.f8989f + "}";
    }
}
