package c.e.a.a.i;

import c.e.a.a.i.l;
/* loaded from: classes.dex */
final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private final m f3687a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3688b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.c<?> f3689c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.e<?, byte[]> f3690d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.b f3691e;

    /* renamed from: c.e.a.a.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0093b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private m f3692a;

        /* renamed from: b  reason: collision with root package name */
        private String f3693b;

        /* renamed from: c  reason: collision with root package name */
        private c.e.a.a.c<?> f3694c;

        /* renamed from: d  reason: collision with root package name */
        private c.e.a.a.e<?, byte[]> f3695d;

        /* renamed from: e  reason: collision with root package name */
        private c.e.a.a.b f3696e;

        @Override // c.e.a.a.i.l.a
        l.a a(c.e.a.a.b bVar) {
            if (bVar != null) {
                this.f3696e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // c.e.a.a.i.l.a
        l.a a(c.e.a.a.c<?> cVar) {
            if (cVar != null) {
                this.f3694c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // c.e.a.a.i.l.a
        l.a a(c.e.a.a.e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f3695d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // c.e.a.a.i.l.a
        public l.a a(m mVar) {
            if (mVar != null) {
                this.f3692a = mVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // c.e.a.a.i.l.a
        public l.a a(String str) {
            if (str != null) {
                this.f3693b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // c.e.a.a.i.l.a
        public l a() {
            String str = "";
            if (this.f3692a == null) {
                str = str + " transportContext";
            }
            if (this.f3693b == null) {
                str = str + " transportName";
            }
            if (this.f3694c == null) {
                str = str + " event";
            }
            if (this.f3695d == null) {
                str = str + " transformer";
            }
            if (this.f3696e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f3692a, this.f3693b, this.f3694c, this.f3695d, this.f3696e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private b(m mVar, String str, c.e.a.a.c<?> cVar, c.e.a.a.e<?, byte[]> eVar, c.e.a.a.b bVar) {
        this.f3687a = mVar;
        this.f3688b = str;
        this.f3689c = cVar;
        this.f3690d = eVar;
        this.f3691e = bVar;
    }

    @Override // c.e.a.a.i.l
    public c.e.a.a.b a() {
        return this.f3691e;
    }

    @Override // c.e.a.a.i.l
    c.e.a.a.c<?> b() {
        return this.f3689c;
    }

    @Override // c.e.a.a.i.l
    c.e.a.a.e<?, byte[]> d() {
        return this.f3690d;
    }

    @Override // c.e.a.a.i.l
    public m e() {
        return this.f3687a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3687a.equals(lVar.e()) && this.f3688b.equals(lVar.f()) && this.f3689c.equals(lVar.b()) && this.f3690d.equals(lVar.d()) && this.f3691e.equals(lVar.a());
    }

    @Override // c.e.a.a.i.l
    public String f() {
        return this.f3688b;
    }

    public int hashCode() {
        return ((((((((this.f3687a.hashCode() ^ 1000003) * 1000003) ^ this.f3688b.hashCode()) * 1000003) ^ this.f3689c.hashCode()) * 1000003) ^ this.f3690d.hashCode()) * 1000003) ^ this.f3691e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3687a + ", transportName=" + this.f3688b + ", event=" + this.f3689c + ", transformer=" + this.f3690d + ", encoding=" + this.f3691e + "}";
    }
}
