package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class m extends v.d.AbstractC0171d.a.b.AbstractC0173a {

    /* renamed from: a  reason: collision with root package name */
    private final long f8944a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8945b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8946c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8947d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a {

        /* renamed from: a  reason: collision with root package name */
        private Long f8948a;

        /* renamed from: b  reason: collision with root package name */
        private Long f8949b;

        /* renamed from: c  reason: collision with root package name */
        private String f8950c;

        /* renamed from: d  reason: collision with root package name */
        private String f8951d;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a
        public v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a a(long j) {
            this.f8948a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a
        public v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a a(String str) {
            if (str != null) {
                this.f8950c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a
        public v.d.AbstractC0171d.a.b.AbstractC0173a a() {
            String str = "";
            if (this.f8948a == null) {
                str = str + " baseAddress";
            }
            if (this.f8949b == null) {
                str = str + " size";
            }
            if (this.f8950c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new m(this.f8948a.longValue(), this.f8949b.longValue(), this.f8950c, this.f8951d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a
        public v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a b(long j) {
            this.f8949b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a
        public v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a b(String str) {
            this.f8951d = str;
            return this;
        }
    }

    private m(long j, long j2, String str, String str2) {
        this.f8944a = j;
        this.f8945b = j2;
        this.f8946c = str;
        this.f8947d = str2;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a
    public long a() {
        return this.f8944a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a
    public String b() {
        return this.f8946c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a
    public long c() {
        return this.f8945b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0173a
    public String d() {
        return this.f8947d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b.AbstractC0173a)) {
            return false;
        }
        v.d.AbstractC0171d.a.b.AbstractC0173a abstractC0173a = (v.d.AbstractC0171d.a.b.AbstractC0173a) obj;
        if (this.f8944a == abstractC0173a.a() && this.f8945b == abstractC0173a.c() && this.f8946c.equals(abstractC0173a.b())) {
            String str = this.f8947d;
            String d2 = abstractC0173a.d();
            if (str == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (str.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f8944a;
        long j2 = this.f8945b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f8946c.hashCode()) * 1000003;
        String str = this.f8947d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f8944a + ", size=" + this.f8945b + ", name=" + this.f8946c + ", uuid=" + this.f8947d + "}";
    }
}
