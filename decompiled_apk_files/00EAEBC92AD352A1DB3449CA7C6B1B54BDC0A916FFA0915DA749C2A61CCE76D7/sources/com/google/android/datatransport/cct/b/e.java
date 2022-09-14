package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.k;
/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f6613a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.datatransport.cct.b.a f6614b;

    /* loaded from: classes.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f6615a;

        /* renamed from: b  reason: collision with root package name */
        private com.google.android.datatransport.cct.b.a f6616b;

        @Override // com.google.android.datatransport.cct.b.k.a
        public k.a a(com.google.android.datatransport.cct.b.a aVar) {
            this.f6616b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.k.a
        public k.a a(k.b bVar) {
            this.f6615a = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.k.a
        public k a() {
            return new e(this.f6615a, this.f6616b, null);
        }
    }

    /* synthetic */ e(k.b bVar, com.google.android.datatransport.cct.b.a aVar, a aVar2) {
        this.f6613a = bVar;
        this.f6614b = aVar;
    }

    @Override // com.google.android.datatransport.cct.b.k
    public com.google.android.datatransport.cct.b.a a() {
        return this.f6614b;
    }

    @Override // com.google.android.datatransport.cct.b.k
    public k.b b() {
        return this.f6613a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k.b bVar = this.f6613a;
        if (bVar != null ? bVar.equals(((e) obj).f6613a) : ((e) obj).f6613a == null) {
            com.google.android.datatransport.cct.b.a aVar = this.f6614b;
            com.google.android.datatransport.cct.b.a aVar2 = ((e) obj).f6614b;
            if (aVar == null) {
                if (aVar2 == null) {
                    return true;
                }
            } else if (aVar.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f6613a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.b.a aVar = this.f6614b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6613a + ", androidClientInfo=" + this.f6614b + "}";
    }
}
