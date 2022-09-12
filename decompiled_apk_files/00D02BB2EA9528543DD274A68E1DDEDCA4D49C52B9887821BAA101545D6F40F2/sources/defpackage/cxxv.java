package defpackage;
/* compiled from: PG */
/* renamed from: cxxv  reason: default package */
/* loaded from: classes5.dex */
final class cxxv extends cxzw {
    private final boolean a;
    private final boolean b;
    private final int c;

    public cxxv(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // defpackage.cxzw
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cxzw
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cxzw
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxzw) {
            cxzw cxzwVar = (cxzw) obj;
            if (this.a == cxzwVar.a() && this.b == cxzwVar.b()) {
                int i = this.c;
                int c = cxzwVar.c();
                if (i == 0) {
                    throw null;
                }
                if (i == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        int i4 = this.c;
        if (i4 != 0) {
            return i3 ^ i4;
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        String str = i != 1 ? i != 2 ? "null" : "MATCH_LOOKUP_ID" : "FULL";
        StringBuilder sb = new StringBuilder(str.length() + 100);
        sb.append("PeopleLookupOptions{returnContactsWithProfileIdOnly=");
        sb.append(z);
        sb.append(", restrictLookupToCache=");
        sb.append(z2);
        sb.append(", personMask=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
