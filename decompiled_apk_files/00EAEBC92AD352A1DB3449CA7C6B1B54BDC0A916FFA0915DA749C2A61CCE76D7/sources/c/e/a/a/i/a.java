package c.e.a.a.i;

import c.e.a.a.i.h;
import java.util.Map;
/* loaded from: classes.dex */
final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f3675a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f3676b;

    /* renamed from: c  reason: collision with root package name */
    private final g f3677c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3678d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3679e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f3680f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends h.a {

        /* renamed from: a  reason: collision with root package name */
        private String f3681a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f3682b;

        /* renamed from: c  reason: collision with root package name */
        private g f3683c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3684d;

        /* renamed from: e  reason: collision with root package name */
        private Long f3685e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f3686f;

        @Override // c.e.a.a.i.h.a
        public h.a a(long j) {
            this.f3684d = Long.valueOf(j);
            return this;
        }

        @Override // c.e.a.a.i.h.a
        public h.a a(g gVar) {
            if (gVar != null) {
                this.f3683c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // c.e.a.a.i.h.a
        public h.a a(Integer num) {
            this.f3682b = num;
            return this;
        }

        @Override // c.e.a.a.i.h.a
        public h.a a(String str) {
            if (str != null) {
                this.f3681a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.e.a.a.i.h.a
        public h.a a(Map<String, String> map) {
            if (map != null) {
                this.f3686f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // c.e.a.a.i.h.a
        public h a() {
            String str = "";
            if (this.f3681a == null) {
                str = str + " transportName";
            }
            if (this.f3683c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3684d == null) {
                str = str + " eventMillis";
            }
            if (this.f3685e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3686f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f3681a, this.f3682b, this.f3683c, this.f3684d.longValue(), this.f3685e.longValue(), this.f3686f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.e.a.a.i.h.a
        public h.a b(long j) {
            this.f3685e = Long.valueOf(j);
            return this;
        }

        @Override // c.e.a.a.i.h.a
        protected Map<String, String> b() {
            Map<String, String> map = this.f3686f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    private a(String str, Integer num, g gVar, long j, long j2, Map<String, String> map) {
        this.f3675a = str;
        this.f3676b = num;
        this.f3677c = gVar;
        this.f3678d = j;
        this.f3679e = j2;
        this.f3680f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.a.i.h
    public Map<String, String> a() {
        return this.f3680f;
    }

    @Override // c.e.a.a.i.h
    public Integer b() {
        return this.f3676b;
    }

    @Override // c.e.a.a.i.h
    public g c() {
        return this.f3677c;
    }

    @Override // c.e.a.a.i.h
    public long d() {
        return this.f3678d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3675a.equals(hVar.f()) && ((num = this.f3676b) != null ? num.equals(hVar.b()) : hVar.b() == null) && this.f3677c.equals(hVar.c()) && this.f3678d == hVar.d() && this.f3679e == hVar.g() && this.f3680f.equals(hVar.a());
    }

    @Override // c.e.a.a.i.h
    public String f() {
        return this.f3675a;
    }

    @Override // c.e.a.a.i.h
    public long g() {
        return this.f3679e;
    }

    public int hashCode() {
        int hashCode = (this.f3675a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3676b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f3678d;
        long j2 = this.f3679e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f3677c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f3680f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3675a + ", code=" + this.f3676b + ", encodedPayload=" + this.f3677c + ", eventMillis=" + this.f3678d + ", uptimeMillis=" + this.f3679e + ", autoMetadata=" + this.f3680f + "}";
    }
}
