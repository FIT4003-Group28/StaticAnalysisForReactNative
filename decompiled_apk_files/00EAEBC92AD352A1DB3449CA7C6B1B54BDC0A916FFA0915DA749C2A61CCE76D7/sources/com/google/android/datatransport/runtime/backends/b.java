package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;
/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f6691a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar, long j) {
        if (aVar != null) {
            this.f6691a = aVar;
            this.f6692b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public long a() {
        return this.f6692b;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public g.a b() {
        return this.f6691a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6691a.equals(gVar.b()) && this.f6692b == gVar.a();
    }

    public int hashCode() {
        long j = this.f6692b;
        return ((this.f6691a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f6691a + ", nextRequestWaitMillis=" + this.f6692b + "}";
    }
}
