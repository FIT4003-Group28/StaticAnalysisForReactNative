package defpackage;
/* compiled from: PG */
/* renamed from: choc  reason: default package */
/* loaded from: classes4.dex */
final class choc extends chqy {
    private final String a;
    private final azxb b;

    public choc(String str, azxb azxbVar) {
        if (str != null) {
            this.a = str;
            if (azxbVar != null) {
                this.b = azxbVar;
                return;
            }
            throw new NullPointerException("Null itemIdentifier");
        }
        throw new NullPointerException("Null listId");
    }

    @Override // defpackage.chqy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.chqy
    public final azxb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chqy) {
            chqy chqyVar = (chqy) obj;
            if (this.a.equals(chqyVar.a()) && this.b.equals(chqyVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 42 + String.valueOf(valueOf).length());
        sb.append("LocalListItemKey{listId=");
        sb.append(str);
        sb.append(", itemIdentifier=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
