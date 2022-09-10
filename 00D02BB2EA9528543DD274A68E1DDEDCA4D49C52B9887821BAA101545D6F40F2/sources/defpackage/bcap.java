package defpackage;
/* compiled from: PG */
/* renamed from: bcap  reason: default package */
/* loaded from: classes3.dex */
final class bcap extends bcbl {
    private final String a;
    private final dcdc<dclz<Integer>> b;

    public bcap(String str, dcdc<dclz<Integer>> dcdcVar) {
        if (str != null) {
            this.a = str;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null dishTags");
        }
        throw new NullPointerException("Null caption");
    }

    @Override // defpackage.bcbl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bcbl
    public final dcdc<dclz<Integer>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcbl) {
            bcbl bcblVar = (bcbl) obj;
            if (this.a.equals(bcblVar.a()) && dchl.m(this.b, bcblVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 34 + String.valueOf(valueOf).length());
        sb.append("TaggedCaption{caption=");
        sb.append(str);
        sb.append(", dishTags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
