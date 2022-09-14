package defpackage;
/* compiled from: PG */
/* renamed from: amfw  reason: default package */
/* loaded from: classes.dex */
final class amfw extends amgj {
    private final String b;
    private final amgk c;

    public amfw(String str, amgk amgkVar) {
        if (str != null) {
            this.b = str;
            if (amgkVar != null) {
                this.c = amgkVar;
                return;
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.amgj
    public final String a() {
        return this.b;
    }

    @Override // defpackage.amgj
    public final amgk b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amgj) {
            amgj amgjVar = (amgj) obj;
            if (this.b.equals(amgjVar.a()) && this.c.equals(amgjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(str.length() + 24 + String.valueOf(valueOf).length());
        sb.append("TextureKey{name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
