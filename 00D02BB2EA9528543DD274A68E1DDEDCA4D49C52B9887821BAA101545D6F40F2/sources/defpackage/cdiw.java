package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdiw  reason: default package */
/* loaded from: classes4.dex */
public final class cdiw extends cdjh {
    private final bwrs<ilo> a;
    private final dmbc b;
    private final dbsg<djgl> c;
    private final int d;

    public cdiw(bwrs<ilo> bwrsVar, dmbc dmbcVar, dbsg<djgl> dbsgVar, int i) {
        this.a = bwrsVar;
        this.b = dmbcVar;
        this.c = dbsgVar;
        this.d = i;
    }

    @Override // defpackage.cdjh
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.cdjh
    public final dmbc b() {
        return this.b;
    }

    @Override // defpackage.cdjh
    public final dbsg<djgl> c() {
        return this.c;
    }

    @Override // defpackage.cdjh
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdjh) {
            cdjh cdjhVar = (cdjh) obj;
            if (this.a.equals(cdjhVar.a()) && this.b.equals(cdjhVar.b()) && this.c.equals(cdjhVar.c())) {
                int i = this.d;
                int d = cdjhVar.d();
                if (i == 0) {
                    throw null;
                }
                if (i == d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dmbc dmbcVar = this.b;
        int i = dmbcVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmbcVar).c(dmbcVar);
            dmbcVar.bC = i;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ 2040732332) * 1000003;
        int i3 = this.d;
        if (i3 != 0) {
            return i2 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "FAILED" : "CANCELLED" : "POST_UPDATED" : "POST_DELETED" : "POST_CREATED";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + str.length());
        sb.append("PostFlowResult{placemarkRef=");
        sb.append(valueOf);
        sb.append(", mergedPost=");
        sb.append(valueOf2);
        sb.append(", thanksPage=");
        sb.append(valueOf3);
        sb.append(", eventType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
