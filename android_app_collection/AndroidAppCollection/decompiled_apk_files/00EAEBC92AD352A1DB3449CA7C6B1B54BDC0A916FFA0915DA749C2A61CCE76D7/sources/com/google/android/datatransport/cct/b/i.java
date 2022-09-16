package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.o;
/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f6646a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f6647b;

    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f6648a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f6649b;

        @Override // com.google.android.datatransport.cct.b.o.a
        public o.a a(o.b bVar) {
            this.f6649b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.o.a
        public o.a a(o.c cVar) {
            this.f6648a = cVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.o.a
        public o a() {
            return new i(this.f6648a, this.f6649b, null);
        }
    }

    /* synthetic */ i(o.c cVar, o.b bVar, a aVar) {
        this.f6646a = cVar;
        this.f6647b = bVar;
    }

    @Override // com.google.android.datatransport.cct.b.o
    public o.b a() {
        return this.f6647b;
    }

    @Override // com.google.android.datatransport.cct.b.o
    public o.c b() {
        return this.f6646a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o.c cVar = this.f6646a;
        if (cVar != null ? cVar.equals(((i) obj).f6646a) : ((i) obj).f6646a == null) {
            o.b bVar = this.f6647b;
            o.b bVar2 = ((i) obj).f6647b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f6646a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f6647b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6646a + ", mobileSubtype=" + this.f6647b + "}";
    }
}
