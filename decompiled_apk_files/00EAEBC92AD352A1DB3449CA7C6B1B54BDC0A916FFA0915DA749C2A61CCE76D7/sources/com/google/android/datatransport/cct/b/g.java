package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.m;
import java.util.List;
/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f6631a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6632b;

    /* renamed from: c  reason: collision with root package name */
    private final k f6633c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f6634d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6635e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f6636f;

    /* renamed from: g  reason: collision with root package name */
    private final p f6637g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f6638a;

        /* renamed from: b  reason: collision with root package name */
        private Long f6639b;

        /* renamed from: c  reason: collision with root package name */
        private k f6640c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f6641d;

        /* renamed from: e  reason: collision with root package name */
        private String f6642e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f6643f;

        /* renamed from: g  reason: collision with root package name */
        private p f6644g;

        @Override // com.google.android.datatransport.cct.b.m.a
        public m.a a(long j) {
            this.f6638a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        public m.a a(k kVar) {
            this.f6640c = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        public m.a a(p pVar) {
            this.f6644g = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        m.a a(Integer num) {
            this.f6641d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        m.a a(String str) {
            this.f6642e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        public m.a a(List<l> list) {
            this.f6643f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        public m a() {
            String str = "";
            if (this.f6638a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f6639b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f6638a.longValue(), this.f6639b.longValue(), this.f6640c, this.f6641d, this.f6642e, this.f6643f, this.f6644g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.b.m.a
        public m.a b(long j) {
            this.f6639b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ g(long j, long j2, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.f6631a = j;
        this.f6632b = j2;
        this.f6633c = kVar;
        this.f6634d = num;
        this.f6635e = str;
        this.f6636f = list;
        this.f6637g = pVar;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public k a() {
        return this.f6633c;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public List<l> b() {
        return this.f6636f;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public Integer c() {
        return this.f6634d;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public String d() {
        return this.f6635e;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public p e() {
        return this.f6637g;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f6631a == mVar.f() && this.f6632b == mVar.g() && ((kVar = this.f6633c) != null ? kVar.equals(((g) mVar).f6633c) : ((g) mVar).f6633c == null) && ((num = this.f6634d) != null ? num.equals(((g) mVar).f6634d) : ((g) mVar).f6634d == null) && ((str = this.f6635e) != null ? str.equals(((g) mVar).f6635e) : ((g) mVar).f6635e == null) && ((list = this.f6636f) != null ? list.equals(((g) mVar).f6636f) : ((g) mVar).f6636f == null)) {
            p pVar = this.f6637g;
            p pVar2 = ((g) mVar).f6637g;
            if (pVar == null) {
                if (pVar2 == null) {
                    return true;
                }
            } else if (pVar.equals(pVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public long f() {
        return this.f6631a;
    }

    @Override // com.google.android.datatransport.cct.b.m
    public long g() {
        return this.f6632b;
    }

    public int hashCode() {
        long j = this.f6631a;
        long j2 = this.f6632b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        k kVar = this.f6633c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f6634d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6635e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f6636f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f6637g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f6631a + ", requestUptimeMs=" + this.f6632b + ", clientInfo=" + this.f6633c + ", logSource=" + this.f6634d + ", logSourceName=" + this.f6635e + ", logEvents=" + this.f6636f + ", qosTier=" + this.f6637g + "}";
    }
}
