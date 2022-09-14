package com.google.android.datatransport.cct.b;
/* loaded from: classes.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f6645a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j) {
        this.f6645a = j;
    }

    @Override // com.google.android.datatransport.cct.b.n
    public long a() {
        return this.f6645a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f6645a == ((n) obj).a();
    }

    public int hashCode() {
        long j = this.f6645a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f6645a + "}";
    }
}
