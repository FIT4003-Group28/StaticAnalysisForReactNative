package com.google.android.datatransport.cct.b;

import java.util.List;
/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f6612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<m> list) {
        if (list != null) {
            this.f6612a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // com.google.android.datatransport.cct.b.j
    public List<m> a() {
        return this.f6612a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f6612a.equals(((j) obj).a());
    }

    public int hashCode() {
        return this.f6612a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f6612a + "}";
    }
}
