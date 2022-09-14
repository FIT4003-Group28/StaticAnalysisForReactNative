package com.google.firebase.installations.r;

import com.google.firebase.installations.r.e;
/* loaded from: classes.dex */
final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f9404a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9405b;

    /* renamed from: c  reason: collision with root package name */
    private final e.b f9406c;

    /* renamed from: com.google.firebase.installations.r.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0189b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f9407a;

        /* renamed from: b  reason: collision with root package name */
        private Long f9408b;

        /* renamed from: c  reason: collision with root package name */
        private e.b f9409c;

        @Override // com.google.firebase.installations.r.e.a
        public e.a a(long j) {
            this.f9408b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.r.e.a
        public e.a a(e.b bVar) {
            this.f9409c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.e.a
        public e.a a(String str) {
            this.f9407a = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.e.a
        public e a() {
            String str = "";
            if (this.f9408b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f9407a, this.f9408b.longValue(), this.f9409c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private b(String str, long j, e.b bVar) {
        this.f9404a = str;
        this.f9405b = j;
        this.f9406c = bVar;
    }

    @Override // com.google.firebase.installations.r.e
    public e.b a() {
        return this.f9406c;
    }

    @Override // com.google.firebase.installations.r.e
    public String b() {
        return this.f9404a;
    }

    @Override // com.google.firebase.installations.r.e
    public long c() {
        return this.f9405b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f9404a;
        if (str != null ? str.equals(eVar.b()) : eVar.b() == null) {
            if (this.f9405b == eVar.c()) {
                e.b bVar = this.f9406c;
                e.b a2 = eVar.a();
                if (bVar == null) {
                    if (a2 == null) {
                        return true;
                    }
                } else if (bVar.equals(a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9404a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f9405b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        e.b bVar = this.f9406c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f9404a + ", tokenExpirationTimestamp=" + this.f9405b + ", responseCode=" + this.f9406c + "}";
    }
}
