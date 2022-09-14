package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class d extends v.c {

    /* renamed from: a  reason: collision with root package name */
    private final w<v.c.b> f8867a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8868b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.c.a {

        /* renamed from: a  reason: collision with root package name */
        private w<v.c.b> f8869a;

        /* renamed from: b  reason: collision with root package name */
        private String f8870b;

        @Override // com.google.firebase.crashlytics.c.j.v.c.a
        public v.c.a a(w<v.c.b> wVar) {
            if (wVar != null) {
                this.f8869a = wVar;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.c.a
        public v.c.a a(String str) {
            this.f8870b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.c.a
        public v.c a() {
            String str = "";
            if (this.f8869a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new d(this.f8869a, this.f8870b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private d(w<v.c.b> wVar, String str) {
        this.f8867a = wVar;
        this.f8868b = str;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.c
    public w<v.c.b> a() {
        return this.f8867a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.c
    public String b() {
        return this.f8868b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c)) {
            return false;
        }
        v.c cVar = (v.c) obj;
        if (this.f8867a.equals(cVar.a())) {
            String str = this.f8868b;
            String b2 = cVar.b();
            if (str == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (str.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f8867a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8868b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f8867a + ", orgId=" + this.f8868b + "}";
    }
}
