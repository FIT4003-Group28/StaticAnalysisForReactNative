package com.google.firebase.installations;

import com.google.firebase.installations.m;
/* loaded from: classes.dex */
final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f9333a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9334b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9335c;

    /* loaded from: classes.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private String f9336a;

        /* renamed from: b  reason: collision with root package name */
        private Long f9337b;

        /* renamed from: c  reason: collision with root package name */
        private Long f9338c;

        @Override // com.google.firebase.installations.m.a
        public m.a a(long j) {
            this.f9338c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a a(String str) {
            if (str != null) {
                this.f9336a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.m.a
        public m a() {
            String str = "";
            if (this.f9336a == null) {
                str = str + " token";
            }
            if (this.f9337b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f9338c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f9336a, this.f9337b.longValue(), this.f9338c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.m.a
        public m.a b(long j) {
            this.f9337b = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, long j, long j2) {
        this.f9333a = str;
        this.f9334b = j;
        this.f9335c = j2;
    }

    @Override // com.google.firebase.installations.m
    public String a() {
        return this.f9333a;
    }

    @Override // com.google.firebase.installations.m
    public long b() {
        return this.f9335c;
    }

    @Override // com.google.firebase.installations.m
    public long c() {
        return this.f9334b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f9333a.equals(mVar.a()) && this.f9334b == mVar.c() && this.f9335c == mVar.b();
    }

    public int hashCode() {
        long j = this.f9334b;
        long j2 = this.f9335c;
        return ((((this.f9333a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f9333a + ", tokenExpirationTimestamp=" + this.f9334b + ", tokenCreationTimestamp=" + this.f9335c + "}";
    }
}
