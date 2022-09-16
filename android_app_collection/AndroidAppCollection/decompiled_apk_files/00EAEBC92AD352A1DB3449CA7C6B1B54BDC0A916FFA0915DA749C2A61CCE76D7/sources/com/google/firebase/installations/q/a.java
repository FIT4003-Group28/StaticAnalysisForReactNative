package com.google.firebase.installations.q;

import com.google.firebase.installations.q.c;
import com.google.firebase.installations.q.d;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f9369a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f9370b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9371c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9372d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9373e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9374f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9375g;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f9376a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f9377b;

        /* renamed from: c  reason: collision with root package name */
        private String f9378c;

        /* renamed from: d  reason: collision with root package name */
        private String f9379d;

        /* renamed from: e  reason: collision with root package name */
        private Long f9380e;

        /* renamed from: f  reason: collision with root package name */
        private Long f9381f;

        /* renamed from: g  reason: collision with root package name */
        private String f9382g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f9376a = dVar.c();
            this.f9377b = dVar.f();
            this.f9378c = dVar.a();
            this.f9379d = dVar.e();
            this.f9380e = Long.valueOf(dVar.b());
            this.f9381f = Long.valueOf(dVar.g());
            this.f9382g = dVar.d();
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a a(long j) {
            this.f9380e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a a(c.a aVar) {
            if (aVar != null) {
                this.f9377b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a a(String str) {
            this.f9378c = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d a() {
            String str = "";
            if (this.f9377b == null) {
                str = str + " registrationStatus";
            }
            if (this.f9380e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f9381f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f9376a, this.f9377b, this.f9378c, this.f9379d, this.f9380e.longValue(), this.f9381f.longValue(), this.f9382g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(long j) {
            this.f9381f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(String str) {
            this.f9376a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a c(String str) {
            this.f9382g = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a d(String str) {
            this.f9379d = str;
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f9369a = str;
        this.f9370b = aVar;
        this.f9371c = str2;
        this.f9372d = str3;
        this.f9373e = j;
        this.f9374f = j2;
        this.f9375g = str4;
    }

    @Override // com.google.firebase.installations.q.d
    public String a() {
        return this.f9371c;
    }

    @Override // com.google.firebase.installations.q.d
    public long b() {
        return this.f9373e;
    }

    @Override // com.google.firebase.installations.q.d
    public String c() {
        return this.f9369a;
    }

    @Override // com.google.firebase.installations.q.d
    public String d() {
        return this.f9375g;
    }

    @Override // com.google.firebase.installations.q.d
    public String e() {
        return this.f9372d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f9369a;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.f9370b.equals(dVar.f()) && ((str = this.f9371c) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f9372d) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f9373e == dVar.b() && this.f9374f == dVar.g()) {
                String str4 = this.f9375g;
                String d2 = dVar.d();
                if (str4 == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (str4.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.q.d
    public c.a f() {
        return this.f9370b;
    }

    @Override // com.google.firebase.installations.q.d
    public long g() {
        return this.f9374f;
    }

    public int hashCode() {
        String str = this.f9369a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f9370b.hashCode()) * 1000003;
        String str2 = this.f9371c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9372d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f9373e;
        long j2 = this.f9374f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f9375g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.installations.q.d
    public d.a m() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f9369a + ", registrationStatus=" + this.f9370b + ", authToken=" + this.f9371c + ", refreshToken=" + this.f9372d + ", expiresInSecs=" + this.f9373e + ", tokenCreationEpochInSecs=" + this.f9374f + ", fisError=" + this.f9375g + "}";
    }
}
