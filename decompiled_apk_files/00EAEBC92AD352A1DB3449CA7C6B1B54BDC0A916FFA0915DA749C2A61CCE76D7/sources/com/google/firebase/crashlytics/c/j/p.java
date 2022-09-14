package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class p extends v.d.AbstractC0171d.a.b.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f8968a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8969b;

    /* renamed from: c  reason: collision with root package name */
    private final w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> f8970c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.e.AbstractC0179a {

        /* renamed from: a  reason: collision with root package name */
        private String f8971a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8972b;

        /* renamed from: c  reason: collision with root package name */
        private w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> f8973c;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0179a
        public v.d.AbstractC0171d.a.b.e.AbstractC0179a a(int i) {
            this.f8972b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0179a
        public v.d.AbstractC0171d.a.b.e.AbstractC0179a a(w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> wVar) {
            if (wVar != null) {
                this.f8973c = wVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0179a
        public v.d.AbstractC0171d.a.b.e.AbstractC0179a a(String str) {
            if (str != null) {
                this.f8971a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e.AbstractC0179a
        public v.d.AbstractC0171d.a.b.e a() {
            String str = "";
            if (this.f8971a == null) {
                str = str + " name";
            }
            if (this.f8972b == null) {
                str = str + " importance";
            }
            if (this.f8973c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new p(this.f8971a, this.f8972b.intValue(), this.f8973c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private p(String str, int i, w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> wVar) {
        this.f8968a = str;
        this.f8969b = i;
        this.f8970c = wVar;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e
    public w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> a() {
        return this.f8970c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e
    public int b() {
        return this.f8969b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.e
    public String c() {
        return this.f8968a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b.e)) {
            return false;
        }
        v.d.AbstractC0171d.a.b.e eVar = (v.d.AbstractC0171d.a.b.e) obj;
        return this.f8968a.equals(eVar.c()) && this.f8969b == eVar.b() && this.f8970c.equals(eVar.a());
    }

    public int hashCode() {
        return ((((this.f8968a.hashCode() ^ 1000003) * 1000003) ^ this.f8969b) * 1000003) ^ this.f8970c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f8968a + ", importance=" + this.f8969b + ", frames=" + this.f8970c + "}";
    }
}
