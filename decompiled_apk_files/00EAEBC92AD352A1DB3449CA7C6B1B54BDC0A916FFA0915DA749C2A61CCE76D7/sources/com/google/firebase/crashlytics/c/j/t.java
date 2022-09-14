package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class t extends v.d.e {

    /* renamed from: a  reason: collision with root package name */
    private final int f8998a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8999b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9000c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9001d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f9002a;

        /* renamed from: b  reason: collision with root package name */
        private String f9003b;

        /* renamed from: c  reason: collision with root package name */
        private String f9004c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f9005d;

        @Override // com.google.firebase.crashlytics.c.j.v.d.e.a
        public v.d.e.a a(int i) {
            this.f9002a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.e.a
        public v.d.e.a a(String str) {
            if (str != null) {
                this.f9004c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.e.a
        public v.d.e.a a(boolean z) {
            this.f9005d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.e.a
        public v.d.e a() {
            String str = "";
            if (this.f9002a == null) {
                str = str + " platform";
            }
            if (this.f9003b == null) {
                str = str + " version";
            }
            if (this.f9004c == null) {
                str = str + " buildVersion";
            }
            if (this.f9005d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new t(this.f9002a.intValue(), this.f9003b, this.f9004c, this.f9005d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.e.a
        public v.d.e.a b(String str) {
            if (str != null) {
                this.f9003b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private t(int i, String str, String str2, boolean z) {
        this.f8998a = i;
        this.f8999b = str;
        this.f9000c = str2;
        this.f9001d = z;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.e
    public String a() {
        return this.f9000c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.e
    public int b() {
        return this.f8998a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.e
    public String c() {
        return this.f8999b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.e
    public boolean d() {
        return this.f9001d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.e)) {
            return false;
        }
        v.d.e eVar = (v.d.e) obj;
        return this.f8998a == eVar.b() && this.f8999b.equals(eVar.c()) && this.f9000c.equals(eVar.a()) && this.f9001d == eVar.d();
    }

    public int hashCode() {
        return ((((((this.f8998a ^ 1000003) * 1000003) ^ this.f8999b.hashCode()) * 1000003) ^ this.f9000c.hashCode()) * 1000003) ^ (this.f9001d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f8998a + ", version=" + this.f8999b + ", buildVersion=" + this.f9000c + ", jailbroken=" + this.f9001d + "}";
    }
}
