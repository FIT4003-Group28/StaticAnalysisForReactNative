package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class u extends v.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f9006a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f9007a;

        @Override // com.google.firebase.crashlytics.c.j.v.d.f.a
        public v.d.f.a a(String str) {
            if (str != null) {
                this.f9007a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.f.a
        public v.d.f a() {
            String str = "";
            if (this.f9007a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new u(this.f9007a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private u(String str) {
        this.f9006a = str;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.f
    public String a() {
        return this.f9006a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.f)) {
            return false;
        }
        return this.f9006a.equals(((v.d.f) obj).a());
    }

    public int hashCode() {
        return this.f9006a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f9006a + "}";
    }
}
