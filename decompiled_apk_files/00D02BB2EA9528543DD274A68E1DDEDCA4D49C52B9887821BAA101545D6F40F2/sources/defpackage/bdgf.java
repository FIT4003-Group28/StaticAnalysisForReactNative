package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bdgf  reason: default package */
/* loaded from: classes3.dex */
final class bdgf extends bdgg {
    private final String a;
    private final List<dwfa> b;

    public bdgf(String str, List<dwfa> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null offeringAssociations");
        }
        throw new NullPointerException("Null photoId");
    }

    @Override // defpackage.bdgg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bdgg
    public final List<dwfa> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgg) {
            bdgg bdggVar = (bdgg) obj;
            if (this.a.equals(bdggVar.a()) && this.b.equals(bdggVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 53 + String.valueOf(valueOf).length());
        sb.append("OfferingsPhotoResult{photoId=");
        sb.append(str);
        sb.append(", offeringAssociations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
