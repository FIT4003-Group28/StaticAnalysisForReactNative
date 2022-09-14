package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class f extends v.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f8875a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8876b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8877c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f8878d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8879e;

    /* renamed from: f  reason: collision with root package name */
    private final v.d.a f8880f;

    /* renamed from: g  reason: collision with root package name */
    private final v.d.f f8881g;

    /* renamed from: h  reason: collision with root package name */
    private final v.d.e f8882h;
    private final v.d.c i;
    private final w<v.d.AbstractC0171d> j;
    private final int k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.d.b {

        /* renamed from: a  reason: collision with root package name */
        private String f8883a;

        /* renamed from: b  reason: collision with root package name */
        private String f8884b;

        /* renamed from: c  reason: collision with root package name */
        private Long f8885c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8886d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f8887e;

        /* renamed from: f  reason: collision with root package name */
        private v.d.a f8888f;

        /* renamed from: g  reason: collision with root package name */
        private v.d.f f8889g;

        /* renamed from: h  reason: collision with root package name */
        private v.d.e f8890h;
        private v.d.c i;
        private w<v.d.AbstractC0171d> j;
        private Integer k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(v.d dVar) {
            this.f8883a = dVar.e();
            this.f8884b = dVar.g();
            this.f8885c = Long.valueOf(dVar.j());
            this.f8886d = dVar.c();
            this.f8887e = Boolean.valueOf(dVar.l());
            this.f8888f = dVar.a();
            this.f8889g = dVar.k();
            this.f8890h = dVar.i();
            this.i = dVar.b();
            this.j = dVar.d();
            this.k = Integer.valueOf(dVar.f());
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(int i) {
            this.k = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(long j) {
            this.f8885c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(v.d.a aVar) {
            if (aVar != null) {
                this.f8888f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(v.d.c cVar) {
            this.i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(v.d.e eVar) {
            this.f8890h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(v.d.f fVar) {
            this.f8889g = fVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(w<v.d.AbstractC0171d> wVar) {
            this.j = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(Long l) {
            this.f8886d = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(String str) {
            if (str != null) {
                this.f8883a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b a(boolean z) {
            this.f8887e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d a() {
            String str = "";
            if (this.f8883a == null) {
                str = str + " generator";
            }
            if (this.f8884b == null) {
                str = str + " identifier";
            }
            if (this.f8885c == null) {
                str = str + " startedAt";
            }
            if (this.f8887e == null) {
                str = str + " crashed";
            }
            if (this.f8888f == null) {
                str = str + " app";
            }
            if (this.k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new f(this.f8883a, this.f8884b, this.f8885c.longValue(), this.f8886d, this.f8887e.booleanValue(), this.f8888f, this.f8889g, this.f8890h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.c.j.v.d.b
        public v.d.b b(String str) {
            if (str != null) {
                this.f8884b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    private f(String str, String str2, long j, Long l, boolean z, v.d.a aVar, v.d.f fVar, v.d.e eVar, v.d.c cVar, w<v.d.AbstractC0171d> wVar, int i) {
        this.f8875a = str;
        this.f8876b = str2;
        this.f8877c = j;
        this.f8878d = l;
        this.f8879e = z;
        this.f8880f = aVar;
        this.f8881g = fVar;
        this.f8882h = eVar;
        this.i = cVar;
        this.j = wVar;
        this.k = i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public v.d.a a() {
        return this.f8880f;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public v.d.c b() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public Long c() {
        return this.f8878d;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public w<v.d.AbstractC0171d> d() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public String e() {
        return this.f8875a;
    }

    public boolean equals(Object obj) {
        Long l;
        v.d.f fVar;
        v.d.e eVar;
        v.d.c cVar;
        w<v.d.AbstractC0171d> wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d)) {
            return false;
        }
        v.d dVar = (v.d) obj;
        return this.f8875a.equals(dVar.e()) && this.f8876b.equals(dVar.g()) && this.f8877c == dVar.j() && ((l = this.f8878d) != null ? l.equals(dVar.c()) : dVar.c() == null) && this.f8879e == dVar.l() && this.f8880f.equals(dVar.a()) && ((fVar = this.f8881g) != null ? fVar.equals(dVar.k()) : dVar.k() == null) && ((eVar = this.f8882h) != null ? eVar.equals(dVar.i()) : dVar.i() == null) && ((cVar = this.i) != null ? cVar.equals(dVar.b()) : dVar.b() == null) && ((wVar = this.j) != null ? wVar.equals(dVar.d()) : dVar.d() == null) && this.k == dVar.f();
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public int f() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public String g() {
        return this.f8876b;
    }

    public int hashCode() {
        long j = this.f8877c;
        int hashCode = (((((this.f8875a.hashCode() ^ 1000003) * 1000003) ^ this.f8876b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f8878d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f8879e ? 1231 : 1237)) * 1000003) ^ this.f8880f.hashCode()) * 1000003;
        v.d.f fVar = this.f8881g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v.d.e eVar = this.f8882h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v.d.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        w<v.d.AbstractC0171d> wVar = this.j;
        if (wVar != null) {
            i = wVar.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.k;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public v.d.e i() {
        return this.f8882h;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public long j() {
        return this.f8877c;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public v.d.f k() {
        return this.f8881g;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public boolean l() {
        return this.f8879e;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.d
    public v.d.b m() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f8875a + ", identifier=" + this.f8876b + ", startedAt=" + this.f8877c + ", endedAt=" + this.f8878d + ", crashed=" + this.f8879e + ", app=" + this.f8880f + ", user=" + this.f8881g + ", os=" + this.f8882h + ", device=" + this.i + ", events=" + this.j + ", generatorType=" + this.k + "}";
    }
}
