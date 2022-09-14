package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class k extends v.d.AbstractC0171d.a {

    /* renamed from: a  reason: collision with root package name */
    private final v.d.AbstractC0171d.a.b f8928a;

    /* renamed from: b  reason: collision with root package name */
    private final w<v.b> f8929b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f8930c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8931d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.AbstractC0172a {

        /* renamed from: a  reason: collision with root package name */
        private v.d.AbstractC0171d.a.b f8932a;

        /* renamed from: b  reason: collision with root package name */
        private w<v.b> f8933b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f8934c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f8935d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(v.d.AbstractC0171d.a aVar) {
            this.f8932a = aVar.c();
            this.f8933b = aVar.b();
            this.f8934c = aVar.a();
            this.f8935d = Integer.valueOf(aVar.d());
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.AbstractC0172a
        public v.d.AbstractC0171d.a.AbstractC0172a a(int i) {
            this.f8935d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.AbstractC0172a
        public v.d.AbstractC0171d.a.AbstractC0172a a(v.d.AbstractC0171d.a.b bVar) {
            if (bVar != null) {
                this.f8932a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.AbstractC0172a
        public v.d.AbstractC0171d.a.AbstractC0172a a(w<v.b> wVar) {
            this.f8933b = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.AbstractC0172a
        public v.d.AbstractC0171d.a.AbstractC0172a a(Boolean bool) {
            this.f8934c = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.AbstractC0172a
        public v.d.AbstractC0171d.a a() {
            String str = "";
            if (this.f8932a == null) {
                str = str + " execution";
            }
            if (this.f8935d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new k(this.f8932a, this.f8933b, this.f8934c, this.f8935d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private k(v.d.AbstractC0171d.a.b bVar, w<v.b> wVar, Boolean bool, int i) {
        this.f8928a = bVar;
        this.f8929b = wVar;
        this.f8930c = bool;
        this.f8931d = i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a
    public Boolean a() {
        return this.f8930c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a
    public w<v.b> b() {
        return this.f8929b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a
    public v.d.AbstractC0171d.a.b c() {
        return this.f8928a;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a
    public int d() {
        return this.f8931d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a
    public v.d.AbstractC0171d.a.AbstractC0172a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        w<v.b> wVar;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a)) {
            return false;
        }
        v.d.AbstractC0171d.a aVar = (v.d.AbstractC0171d.a) obj;
        return this.f8928a.equals(aVar.c()) && ((wVar = this.f8929b) != null ? wVar.equals(aVar.b()) : aVar.b() == null) && ((bool = this.f8930c) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f8931d == aVar.d();
    }

    public int hashCode() {
        int hashCode = (this.f8928a.hashCode() ^ 1000003) * 1000003;
        w<v.b> wVar = this.f8929b;
        int i = 0;
        int hashCode2 = (hashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.f8930c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f8931d;
    }

    public String toString() {
        return "Application{execution=" + this.f8928a + ", customAttributes=" + this.f8929b + ", background=" + this.f8930c + ", uiOrientation=" + this.f8931d + "}";
    }
}
