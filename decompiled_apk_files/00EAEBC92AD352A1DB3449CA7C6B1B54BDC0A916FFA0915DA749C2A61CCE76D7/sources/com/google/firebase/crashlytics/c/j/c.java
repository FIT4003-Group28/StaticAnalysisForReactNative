package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class c extends v.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8863a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8864b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8865a;

        /* renamed from: b  reason: collision with root package name */
        private String f8866b;

        @Override // com.google.firebase.crashlytics.c.j.v.b.a
        public v.b.a a(String str) {
            if (str != null) {
                this.f8865a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.b.a
        public v.b a() {
            String str = "";
            if (this.f8865a == null) {
                str = str + " key";
            }
            if (this.f8866b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new c(this.f8865a, this.f8866b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.b.a
        public v.b.a b(String str) {
            if (str != null) {
                this.f8866b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    private c(String str, String str2) {
        this.f8863a = str;
        this.f8864b = str2;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.b
    public String a() {
        return this.f8863a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.b
    public String b() {
        return this.f8864b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        return this.f8863a.equals(bVar.a()) && this.f8864b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f8863a.hashCode() ^ 1000003) * 1000003) ^ this.f8864b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f8863a + ", value=" + this.f8864b + "}";
    }
}
