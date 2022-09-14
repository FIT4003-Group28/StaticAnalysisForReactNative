package c.e.a.a.i.w.j;

import c.e.a.a.i.w.j.d;
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final long f3758b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3759c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3760d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3761e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3762f;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f3763a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f3764b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f3765c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3766d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f3767e;

        @Override // c.e.a.a.i.w.j.d.a
        d.a a(int i) {
            this.f3765c = Integer.valueOf(i);
            return this;
        }

        @Override // c.e.a.a.i.w.j.d.a
        d.a a(long j) {
            this.f3766d = Long.valueOf(j);
            return this;
        }

        @Override // c.e.a.a.i.w.j.d.a
        d a() {
            String str = "";
            if (this.f3763a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f3764b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f3765c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f3766d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f3767e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f3763a.longValue(), this.f3764b.intValue(), this.f3765c.intValue(), this.f3766d.longValue(), this.f3767e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.e.a.a.i.w.j.d.a
        d.a b(int i) {
            this.f3764b = Integer.valueOf(i);
            return this;
        }

        @Override // c.e.a.a.i.w.j.d.a
        d.a b(long j) {
            this.f3763a = Long.valueOf(j);
            return this;
        }

        @Override // c.e.a.a.i.w.j.d.a
        d.a c(int i) {
            this.f3767e = Integer.valueOf(i);
            return this;
        }
    }

    private a(long j, int i, int i2, long j2, int i3) {
        this.f3758b = j;
        this.f3759c = i;
        this.f3760d = i2;
        this.f3761e = j2;
        this.f3762f = i3;
    }

    @Override // c.e.a.a.i.w.j.d
    int a() {
        return this.f3760d;
    }

    @Override // c.e.a.a.i.w.j.d
    long b() {
        return this.f3761e;
    }

    @Override // c.e.a.a.i.w.j.d
    int c() {
        return this.f3759c;
    }

    @Override // c.e.a.a.i.w.j.d
    int d() {
        return this.f3762f;
    }

    @Override // c.e.a.a.i.w.j.d
    long e() {
        return this.f3758b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3758b == dVar.e() && this.f3759c == dVar.c() && this.f3760d == dVar.a() && this.f3761e == dVar.b() && this.f3762f == dVar.d();
    }

    public int hashCode() {
        long j = this.f3758b;
        long j2 = this.f3761e;
        return this.f3762f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3759c) * 1000003) ^ this.f3760d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f3758b + ", loadBatchSize=" + this.f3759c + ", criticalSectionEnterTimeoutMs=" + this.f3760d + ", eventCleanUpAge=" + this.f3761e + ", maxBlobByteSizePerRow=" + this.f3762f + "}";
    }
}
