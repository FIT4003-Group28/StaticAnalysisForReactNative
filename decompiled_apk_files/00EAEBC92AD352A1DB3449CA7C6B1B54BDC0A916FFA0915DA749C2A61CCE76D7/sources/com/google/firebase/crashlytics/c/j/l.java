package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class l extends v.d.AbstractC0171d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final w<v.d.AbstractC0171d.a.b.e> f8936a;

    /* renamed from: b  reason: collision with root package name */
    private final v.d.AbstractC0171d.a.b.c f8937b;

    /* renamed from: c  reason: collision with root package name */
    private final v.d.AbstractC0171d.a.b.AbstractC0177d f8938c;

    /* renamed from: d  reason: collision with root package name */
    private final w<v.d.AbstractC0171d.a.b.AbstractC0173a> f8939d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.AbstractC0175b {

        /* renamed from: a  reason: collision with root package name */
        private w<v.d.AbstractC0171d.a.b.e> f8940a;

        /* renamed from: b  reason: collision with root package name */
        private v.d.AbstractC0171d.a.b.c f8941b;

        /* renamed from: c  reason: collision with root package name */
        private v.d.AbstractC0171d.a.b.AbstractC0177d f8942c;

        /* renamed from: d  reason: collision with root package name */
        private w<v.d.AbstractC0171d.a.b.AbstractC0173a> f8943d;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0175b
        public v.d.AbstractC0171d.a.b.AbstractC0175b a(v.d.AbstractC0171d.a.b.c cVar) {
            if (cVar != null) {
                this.f8941b = cVar;
                return this;
            }
            throw new NullPointerException("Null exception");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0175b
        public v.d.AbstractC0171d.a.b.AbstractC0175b a(v.d.AbstractC0171d.a.b.AbstractC0177d abstractC0177d) {
            if (abstractC0177d != null) {
                this.f8942c = abstractC0177d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0175b
        public v.d.AbstractC0171d.a.b.AbstractC0175b a(w<v.d.AbstractC0171d.a.b.AbstractC0173a> wVar) {
            if (wVar != null) {
                this.f8943d = wVar;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0175b
        public v.d.AbstractC0171d.a.b a() {
            String str = "";
            if (this.f8940a == null) {
                str = str + " threads";
            }
            if (this.f8941b == null) {
                str = str + " exception";
            }
            if (this.f8942c == null) {
                str = str + " signal";
            }
            if (this.f8943d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new l(this.f8940a, this.f8941b, this.f8942c, this.f8943d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.AbstractC0175b
        public v.d.AbstractC0171d.a.b.AbstractC0175b b(w<v.d.AbstractC0171d.a.b.e> wVar) {
            if (wVar != null) {
                this.f8940a = wVar;
                return this;
            }
            throw new NullPointerException("Null threads");
        }
    }

    private l(w<v.d.AbstractC0171d.a.b.e> wVar, v.d.AbstractC0171d.a.b.c cVar, v.d.AbstractC0171d.a.b.AbstractC0177d abstractC0177d, w<v.d.AbstractC0171d.a.b.AbstractC0173a> wVar2) {
        this.f8936a = wVar;
        this.f8937b = cVar;
        this.f8938c = abstractC0177d;
        this.f8939d = wVar2;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b
    public w<v.d.AbstractC0171d.a.b.AbstractC0173a> a() {
        return this.f8939d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b
    public v.d.AbstractC0171d.a.b.c b() {
        return this.f8937b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b
    public v.d.AbstractC0171d.a.b.AbstractC0177d c() {
        return this.f8938c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b
    public w<v.d.AbstractC0171d.a.b.e> d() {
        return this.f8936a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b)) {
            return false;
        }
        v.d.AbstractC0171d.a.b bVar = (v.d.AbstractC0171d.a.b) obj;
        return this.f8936a.equals(bVar.d()) && this.f8937b.equals(bVar.b()) && this.f8938c.equals(bVar.c()) && this.f8939d.equals(bVar.a());
    }

    public int hashCode() {
        return ((((((this.f8936a.hashCode() ^ 1000003) * 1000003) ^ this.f8937b.hashCode()) * 1000003) ^ this.f8938c.hashCode()) * 1000003) ^ this.f8939d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f8936a + ", exception=" + this.f8937b + ", signal=" + this.f8938c + ", binaries=" + this.f8939d + "}";
    }
}
