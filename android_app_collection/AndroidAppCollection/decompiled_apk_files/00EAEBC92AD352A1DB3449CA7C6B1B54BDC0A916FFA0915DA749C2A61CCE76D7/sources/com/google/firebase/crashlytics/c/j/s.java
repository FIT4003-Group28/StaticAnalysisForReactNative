package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class s extends v.d.AbstractC0171d.AbstractC0182d {

    /* renamed from: a  reason: collision with root package name */
    private final String f8996a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.AbstractC0182d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8997a;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.AbstractC0182d.a
        public v.d.AbstractC0171d.AbstractC0182d.a a(String str) {
            if (str != null) {
                this.f8997a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.AbstractC0182d.a
        public v.d.AbstractC0171d.AbstractC0182d a() {
            String str = "";
            if (this.f8997a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new s(this.f8997a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private s(String str) {
        this.f8996a = str;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.AbstractC0182d
    public String a() {
        return this.f8996a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.AbstractC0182d)) {
            return false;
        }
        return this.f8996a.equals(((v.d.AbstractC0171d.AbstractC0182d) obj).a());
    }

    public int hashCode() {
        return this.f8996a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f8996a + "}";
    }
}
