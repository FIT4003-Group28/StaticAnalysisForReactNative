package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class n extends v.d.AbstractC0171d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8953b;

    /* renamed from: c  reason: collision with root package name */
    private final w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> f8954c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.AbstractC0171d.a.b.c f8955d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8956e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.AbstractC0171d.a.b.c.AbstractC0176a {

        /* renamed from: a  reason: collision with root package name */
        private String f8957a;

        /* renamed from: b  reason: collision with root package name */
        private String f8958b;

        /* renamed from: c  reason: collision with root package name */
        private w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> f8959c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.AbstractC0171d.a.b.c f8960d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f8961e;

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c.AbstractC0176a a(int i) {
            this.f8961e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c.AbstractC0176a a(v.d.AbstractC0171d.a.b.c cVar) {
            this.f8960d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c.AbstractC0176a a(w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> wVar) {
            if (wVar != null) {
                this.f8959c = wVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c.AbstractC0176a a(String str) {
            this.f8958b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c a() {
            String str = "";
            if (this.f8957a == null) {
                str = str + " type";
            }
            if (this.f8959c == null) {
                str = str + " frames";
            }
            if (this.f8961e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new n(this.f8957a, this.f8958b, this.f8959c, this.f8960d, this.f8961e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c.AbstractC0176a
        public v.d.AbstractC0171d.a.b.c.AbstractC0176a b(String str) {
            if (str != null) {
                this.f8957a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private n(String str, String str2, w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> wVar, v.d.AbstractC0171d.a.b.c cVar, int i) {
        this.f8952a = str;
        this.f8953b = str2;
        this.f8954c = wVar;
        this.f8955d = cVar;
        this.f8956e = i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c
    public v.d.AbstractC0171d.a.b.c a() {
        return this.f8955d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c
    public w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> b() {
        return this.f8954c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c
    public int c() {
        return this.f8956e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c
    public String d() {
        return this.f8953b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d.AbstractC0171d.a.b.c
    public String e() {
        return this.f8952a;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.AbstractC0171d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0171d.a.b.c)) {
            return false;
        }
        v.d.AbstractC0171d.a.b.c cVar2 = (v.d.AbstractC0171d.a.b.c) obj;
        return this.f8952a.equals(cVar2.e()) && ((str = this.f8953b) != null ? str.equals(cVar2.d()) : cVar2.d() == null) && this.f8954c.equals(cVar2.b()) && ((cVar = this.f8955d) != null ? cVar.equals(cVar2.a()) : cVar2.a() == null) && this.f8956e == cVar2.c();
    }

    public int hashCode() {
        int hashCode = (this.f8952a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8953b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8954c.hashCode()) * 1000003;
        v.d.AbstractC0171d.a.b.c cVar = this.f8955d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f8956e;
    }

    public String toString() {
        return "Exception{type=" + this.f8952a + ", reason=" + this.f8953b + ", frames=" + this.f8954c + ", causedBy=" + this.f8955d + ", overflowCount=" + this.f8956e + "}";
    }
}
