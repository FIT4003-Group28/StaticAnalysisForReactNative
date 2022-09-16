package defpackage;
/* compiled from: PG */
/* renamed from: bqjc  reason: default package */
/* loaded from: classes4.dex */
final class bqjc extends bqlf {
    private final bwrs<ilo> a;
    private final docg b;
    private final dbsg<djgl> c;
    private final int d;

    public bqjc(bwrs<ilo> bwrsVar, docg docgVar, int i, dbsg<djgl> dbsgVar) {
        this.a = bwrsVar;
        this.b = docgVar;
        this.d = i;
        this.c = dbsgVar;
    }

    @Override // defpackage.bqlf
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.bqlf
    public final docg b() {
        return this.b;
    }

    @Override // defpackage.bqlf
    public final dbsg<djgl> c() {
        return this.c;
    }

    @Override // defpackage.bqlf
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqlf) {
            bqlf bqlfVar = (bqlf) obj;
            if (this.a.equals(bqlfVar.a()) && this.b.equals(bqlfVar.b())) {
                int i = this.d;
                int d = bqlfVar.d();
                if (i == 0) {
                    throw null;
                }
                if (i == d && this.c.equals(bqlfVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        docg docgVar = this.b;
        int i = docgVar.bC;
        if (i == 0) {
            i = dsst.a.b(docgVar).c(docgVar);
            docgVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = this.d;
        if (i3 != 0) {
            return ((i2 ^ i3) * 1000003) ^ this.c.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        switch (this.d) {
            case 1:
                str = "SUBMIT_PUBLISHED";
                break;
            case 2:
                str = "DELETE_PUBLISHED";
                break;
            case 3:
                str = "SUBMIT_DRAFT";
                break;
            case 4:
                str = "DELETE_DRAFT";
                break;
            case 5:
                str = "CANCEL";
                break;
            case 6:
                str = "FAILED";
                break;
            default:
                str = "null";
                break;
        }
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 72 + length2 + str.length() + String.valueOf(valueOf3).length());
        sb.append("ReviewsFlowResult{placemarkRef=");
        sb.append(valueOf);
        sb.append(", mergedReview=");
        sb.append(valueOf2);
        sb.append(", eventType=");
        sb.append(str);
        sb.append(", thanksPage=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
