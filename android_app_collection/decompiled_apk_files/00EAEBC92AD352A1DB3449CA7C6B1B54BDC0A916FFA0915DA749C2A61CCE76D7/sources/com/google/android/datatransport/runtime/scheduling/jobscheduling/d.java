package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;
/* loaded from: classes.dex */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f6722a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6723b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f6724c;

    /* loaded from: classes.dex */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f6725a;

        /* renamed from: b  reason: collision with root package name */
        private Long f6726b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f6727c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a a(long j) {
            this.f6725a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a a(Set<g.c> set) {
            if (set != null) {
                this.f6727c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b a() {
            String str = "";
            if (this.f6725a == null) {
                str = str + " delta";
            }
            if (this.f6726b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f6727c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f6725a.longValue(), this.f6726b.longValue(), this.f6727c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a b(long j) {
            this.f6726b = Long.valueOf(j);
            return this;
        }
    }

    private d(long j, long j2, Set<g.c> set) {
        this.f6722a = j;
        this.f6723b = j2;
        this.f6724c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long a() {
        return this.f6722a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    Set<g.c> b() {
        return this.f6724c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long c() {
        return this.f6723b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.f6722a == bVar.a() && this.f6723b == bVar.c() && this.f6724c.equals(bVar.b());
    }

    public int hashCode() {
        long j = this.f6722a;
        long j2 = this.f6723b;
        return this.f6724c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f6722a + ", maxAllowedDelay=" + this.f6723b + ", flags=" + this.f6724c + "}";
    }
}
